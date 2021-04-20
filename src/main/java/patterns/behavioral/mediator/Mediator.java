package patterns.behavioral.mediator;

import patterns.behavioral.mediator.checkbox.CheckBox;

public interface Mediator {
    void set(CheckBox checkBox, boolean isChecked);
}
