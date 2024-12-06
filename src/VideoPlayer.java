
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Абстрактний клас VideoPlayer для відтворення відео з пам'яті.
 */
public abstract class VideoPlayer {

    private PrintWriter fout;
    private final String FILE = "lab3.txt";
    private boolean isOn = false;
    private Memory memory;

    public VideoPlayer() throws FileNotFoundException {
        fout = new PrintWriter(new File(FILE));
        memory = new Memory();
    }

    /**
     * Записує відео у пам'ять.
     * @param frames - кадри відео
     */
    public void writeIntoMemory(ArrayList<Frame> frames) {
        frames.forEach((frame -> {
            memory.write(frame);
        }));
    }

    public abstract void play() throws Exception;

    /**
     * Метод для відтворення відео.
     * @throws Exception - у разі помилки відтворення
     */
    protected void playVideo() throws Exception {
        if (!isOn) {
            throw new Exception("You need to turn on the video player");
        }

        memory.getContent().forEach(this::ShowFrame);
    }

    public Frame readFromMemory(int index) throws Exception {
        if(index >= memory.getSize()) {
            throw new Exception("Wrong index");
        }
        return memory.read(index);
    }

    public void ShowFrame(Frame frame) {
        AtomicInteger i = new AtomicInteger();
        frame.getContent().forEach((pixel) -> {
            if (i.get() == frame.getFRAME_WIDTH()) {
                i.set(0);
                printMessage("\n");
            } else {
                printMessage(pixel.getInfo());
                i.getAndIncrement();
            }
        });
    }

    public void turnOn() {
        if (isOn) {
            return;
        }
        isOn = true;
        printMessage("VideoPlayer is turned on");
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            printMessage("VideoPlayer is turned off");
        }
    }

    public void dispose() {
        fout.flush();
        fout.close();
    }

    private void printlnMessage(String message) {
        fout.println(message);
        System.out.println(message);
    }

    private void printMessage(String message) {
        fout.print(message);
        System.out.print(message);
    }
}
