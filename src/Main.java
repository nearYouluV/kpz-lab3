
import java.util.ArrayList;

public class Main {
    public static void main(String[] argc) throws Exception {
        VideoPlayer videoPlayer = new VideoRecorder();

        videoPlayer.turnOn();

        ArrayList<Frame> video = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            ArrayList<Pixel> pixels = new ArrayList<>();

            for (int j = 0; j < 50; j++) {
                pixels.add(new Pixel((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            }

            video.add(new Frame(pixels));
        }

        ((VideoRecorder) videoPlayer).record(video);
        videoPlayer.play();
        videoPlayer.turnOff();
        videoPlayer.dispose();
    }
}
