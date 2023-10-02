package estructural.composite;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguraCompuesta extends FiguraBase {
    protected List<Figura> hijos = new ArrayList<>();

    public FiguraCompuesta(Figura ... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Figura component) {
        hijos.add(component);
    }

    public void add(Figura... components) {
        hijos.addAll(Arrays.asList(components));
    }

    public void remove(Figura child) {
        hijos.remove(child);
    }

    public void remove(Figura... components) {
        hijos.removeAll(Arrays.asList(components));
    }

    public void clear() {
        hijos.clear();
    }

    @Override
    public int getX() {
        if (hijos.isEmpty()) {
            return 0;
        }
        int x = hijos.get(0).getX();
        for (Figura child : hijos) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (hijos.isEmpty()) {
            return 0;
        }
        int y = hijos.get(0).getY();
        for (Figura child : hijos) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (Figura child : hijos) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (Figura child : hijos) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for (Figura child : hijos) {
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (Figura child : hijos) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for (Figura child : hijos) {
            child.unSelect();
        }
    }

    public boolean selectChildAt(int x, int y) {
        for (Figura child : hijos) {
            if (child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (Figura child : hijos) {
            child.paint(graphics);
        }
    }
 }
