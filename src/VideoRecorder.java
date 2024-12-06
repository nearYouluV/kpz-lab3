import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Інтерфейс для запису відео.
 */
interface IVideoRecorder {
    void record(ArrayList<Frame> video);
}
/**
 * Клас VideoRecorder для запису та відтворення відео.
 */
public class VideoRecorder extends VideoPlayer implements IVideoRecorder {

    public VideoRecorder() throws FileNotFoundException {
        super();
    }

    /**
     * Реалізація методу запису відео.
     * @param video - відео, що записується
     */
    @Override
    public void record(ArrayList<Frame> video) {
        video.forEach((frame -> {
            super.writeIntoMemory(video);
        }));
    }

    /**
     * Метод для відтворення відео.
     * @throws Exception - у разі помилки відтворення
     */
    @Override
    public void play() throws Exception {
        super.playVideo();
    }
}