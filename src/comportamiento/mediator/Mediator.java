package comportamiento.mediator;


import comportamiento.mediator.components.Component;

import javax.swing.*;

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    <E> void sendToFilter(ListModel<E> listModel);
    <E> void setElementsList(ListModel<E> list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
