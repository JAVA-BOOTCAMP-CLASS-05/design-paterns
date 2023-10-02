package creacional.prototype;

import java.util.Objects;

public abstract class Figura implements Cloneable {

    public int x;
    public int y;
    public String color;

    public Figura(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Figura(Figura target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Figura clone();

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Figura)
            return this.equals((Figura) obj);

        return false;
    }

    public boolean equals(Figura fig) {
        return fig.x == x && fig.y == y && Objects.equals(fig.color, color);
    }
}
