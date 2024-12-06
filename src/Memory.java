import java.util.ArrayList;

public class Memory {

    private ArrayList<Frame> content;

    public Memory() {
        content = new ArrayList<Frame>();
    }
    /**
     * Write frame to memory
     * @param frame
     */
    public void write(Frame frame) {
        content.add(frame);
    }
    /**
     * Read frame from memory
     */
    public Frame read(int index) {
        return content.get(index);
    }
    /**
     * Returns content size
     */
    public int getSize() {
        return content.size();
    }
    /**
     * Returns content
     */
    public ArrayList<Frame> getContent() {
        return content;
    }
}
