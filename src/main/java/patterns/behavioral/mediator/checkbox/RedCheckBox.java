package patterns.behavioral.mediator.checkbox;

import patterns.behavioral.mediator.Mediator;

public class RedCheckBox extends CheckBox {

    private boolean isChecked;

    public RedCheckBox(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void set(boolean isChecked) {
        this.isChecked = isChecked;
        super.set(isChecked);
    }
}
