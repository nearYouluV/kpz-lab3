import java.util.ArrayList;

public class Frame {

    private ArrayList<Pixel> content;
    private int FRAME_WIDTH = 5;

    public Frame(ArrayList<Pixel> content) {
        this.content = content;
    }
    /**
     * Returns frame width
     */
    public int getFRAME_WIDTH() {
        return FRAME_WIDTH;
    }
    /**
     * Returns frame content
     */
    public ArrayList<Pixel> getContent() {
        return content;
    }
}
