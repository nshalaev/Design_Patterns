package patterns.behavioral.mediator.checkbox;

import patterns.behavioral.mediator.Mediator;

public class BlueCheckBox extends CheckBox {

    private boolean isChecked;

    public BlueCheckBox(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void set(boolean isChecked) {
        super.set(isChecked);
    }
}
