public class Pixel {
    public int red;
    public int green;
    public int blue;

    public Pixel(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    /**
     * Returns info about the pixel
     */
    public String getInfo() {
        return "(" + red + ";" +  green + ";" + blue + ")";
    }
}
