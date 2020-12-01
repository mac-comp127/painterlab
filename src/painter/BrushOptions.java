package painter;

import java.awt.Color;

/**
 * Describes the adjustable settings that can apply to a brush.
 */
public class BrushOptions {
    private Color color;
    private int radius;

    BrushOptions(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }
}
