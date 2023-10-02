package comportamiento.mediator;

import comportamiento.mediator.components.*;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List<>(new DefaultListModel<Note>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
