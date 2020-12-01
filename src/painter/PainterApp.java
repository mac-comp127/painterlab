package painter;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Point;

import java.awt.Color;

public class PainterApp {
    private CanvasWindow canvas;
    private final PaintSettingsView paintSettingsView;

    public PainterApp() {
        canvas = new CanvasWindow("Painter", 900, 800);

        paintSettingsView = new PaintSettingsView(Color.BLUE, 60);
        canvas.add(paintSettingsView, 10 - paintSettingsView.getBounds().getMinX(), 10);

        paint(canvas.getCenter());  // TODO: Replace with event handlers that use mouse position
    }

    private void paint(Point location) {
        BrushOptions brushOptions = paintSettingsView.getBrushOptions();

        GraphicsObject dot = PaintUtils.createFuzzyDot(
            location,
            brushOptions.getColor(),
            brushOptions.getRadius(),
            0.2f);
        dot.setCenter(location);
        canvas.add(dot);
    }

    public static void main(String[] args) {
        new PainterApp();
    }
}
