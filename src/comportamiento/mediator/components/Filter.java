package comportamiento.mediator.components;

import comportamiento.mediator.Mediator;
import comportamiento.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

public class Filter extends JTextField implements Component {
    /**
	 * 
	 */
	@Serial
    private static final long serialVersionUID = 5333406347989995591L;
	
	private Mediator mediator;
    private ListModel<?> listModel;

    public Filter() {}

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
        searchElements(start);
    }

    public <E> void setList(ListModel<E> listModel) {
        this.listModel = listModel;
    }

    private void searchElements(String s) {
        if (listModel == null) {
            return;
        }

        if (s.isEmpty()) {
            mediator.setElementsList(listModel);
            return;
        }

        List<Note> notes = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note) listModel.getElementAt(i));
        }
        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for (Note note : notes) {
            if (note.getName().contains(s)) {
                listModel.addElement(note);
            }
        }
        mediator.setElementsList(listModel);
    }

    @Override
    public String getName() {
        return "Filter";
    }
}
