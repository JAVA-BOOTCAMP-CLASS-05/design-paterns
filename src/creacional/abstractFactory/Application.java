package creacional.abstractFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(Factory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
