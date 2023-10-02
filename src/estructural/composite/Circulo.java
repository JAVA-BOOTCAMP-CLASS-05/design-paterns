package estructural.composite;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends FiguraBase {
    public int radio;

    public Circulo(int x, int y, int radio, Color color) {
        super(x, y, color);
        this.radio = radio;
    }

    @Override
    public int getWidth() {
        return radio * 2;
    }

    @Override
    public int getHeight() {
        return radio * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
  }
