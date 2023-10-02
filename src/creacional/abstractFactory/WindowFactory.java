package creacional.abstractFactory;

public class WindowFactory implements Factory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowCheckbox();
	}

}
