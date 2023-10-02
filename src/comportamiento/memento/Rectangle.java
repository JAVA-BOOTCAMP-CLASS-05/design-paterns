package comportamiento.memento;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serial;

public class Rectangle extends BaseShape {
    /**
	 * 
	 */
	@Serial
    private static final long serialVersionUID = -7766291279136429390L;
	private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}