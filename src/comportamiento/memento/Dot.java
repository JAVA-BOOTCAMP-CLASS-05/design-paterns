package comportamiento.memento;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serial;

public class Dot extends BaseShape {
    /**
	 * 
	 */
	@Serial
    private static final long serialVersionUID = -4531945990148719381L;
	private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}