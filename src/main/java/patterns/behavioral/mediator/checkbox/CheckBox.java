package patterns.behavioral.mediator.checkbox;

import patterns.behavioral.mediator.Mediator;

public abstract class CheckBox {
    private Mediator mediator;
    private boolean isChecked;

    public CheckBox(Mediator mediator) {
        this.mediator = mediator;
    }

    public void set(boolean isChecked) {
        mediator.set(this, isChecked);
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean checked) {
        this.isChecked = checked;
        System.out.println(this.getClass().getSimpleName() + " is checked: " + isChecked);
    }
}
