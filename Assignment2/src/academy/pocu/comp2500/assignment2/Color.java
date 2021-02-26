package academy.pocu.comp2500.assignment2;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = max(0, min(255, red));;
        this.green = max(0, min(255, green));;
        this.blue = max(0, min(255, blue));;
    }
    public int getRed() {
        return this.red;
    }
    public int getGreen() {
        return this.green;
    }
    public int getBlue() {
        return this.blue;
    }
    public void setRed(int red) {
        assert (0 <= red && red <= 255);
        this.red = red;
    }
    public void setGreen(int green) {
        assert (0 <= green && green <= 255);
        this.green = green;
    }
    public void setBlue(int blue) {
        assert (0 <= blue && blue <= 255);
        this.blue = blue;
    }

}
