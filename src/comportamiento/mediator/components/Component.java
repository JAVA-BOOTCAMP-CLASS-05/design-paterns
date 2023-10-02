package comportamiento.mediator.components;

import comportamiento.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}