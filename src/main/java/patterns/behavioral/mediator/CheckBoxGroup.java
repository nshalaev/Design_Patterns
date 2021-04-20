package patterns.behavioral.mediator;

import patterns.behavioral.mediator.checkbox.BlueCheckBox;
import patterns.behavioral.mediator.checkbox.CheckBox;
import patterns.behavioral.mediator.checkbox.RedCheckBox;

public class CheckBoxGroup implements Mediator {
    private RedCheckBox redCheckBox;
    private BlueCheckBox blueCheckBox;

    public void setRedCheckBox(RedCheckBox redCheckBox) {
        this.redCheckBox = redCheckBox;
    }

    public void setBlueCheckBox(BlueCheckBox blueCheckBox) {
        this.blueCheckBox = blueCheckBox;
    }

    @Override
    public void set(CheckBox checkBox, boolean isChecked) {
        if (redCheckBox.equals(checkBox)) {
            setRedCheckBox(isChecked);
        } else if (blueCheckBox.equals(checkBox)) {
            setBlueCheckBox(isChecked);
        }
    }

    private void setRedCheckBox(boolean isChecked) {
        redCheckBox.setChecked(isChecked);
        if (isChecked && blueCheckBox.isChecked()) {
            blueCheckBox.setChecked(false);
        }
    }

    private void setBlueCheckBox(boolean isChecked) {
        blueCheckBox.setChecked(isChecked);
        if (isChecked && redCheckBox.isChecked()) {
            redCheckBox.setChecked(false);
        }
    }
}
