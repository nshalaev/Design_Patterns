package patterns.behavioral.mediator;

import org.junit.Assert;
import org.junit.Test;
import patterns.behavioral.mediator.checkbox.BlueCheckBox;
import patterns.behavioral.mediator.checkbox.CheckBox;
import patterns.behavioral.mediator.checkbox.RedCheckBox;

public class MediatorTest {

    @Test
    public void testCheckboxMediator() {
        CheckBoxGroup mediator = new CheckBoxGroup();
        BlueCheckBox blueCheckBox = new BlueCheckBox(mediator);
        RedCheckBox redCheckBox = new RedCheckBox(mediator);

        mediator.setBlueCheckBox(blueCheckBox);
        mediator.setRedCheckBox(redCheckBox);

        Assert.assertFalse(blueCheckBox.isChecked());
        Assert.assertFalse(redCheckBox.isChecked());

        blueCheckBox.set(true);
        Assert.assertTrue(blueCheckBox.isChecked());
        Assert.assertFalse(redCheckBox.isChecked());

        redCheckBox.set(true);
        Assert.assertFalse(blueCheckBox.isChecked());
        Assert.assertTrue(redCheckBox.isChecked());

        blueCheckBox.set(true);
        Assert.assertTrue(blueCheckBox.isChecked());
        Assert.assertFalse(redCheckBox.isChecked());

        blueCheckBox.set(false);
        Assert.assertFalse(blueCheckBox.isChecked());
        Assert.assertFalse(redCheckBox.isChecked());

        redCheckBox.set(true);
        Assert.assertFalse(blueCheckBox.isChecked());
        Assert.assertTrue(redCheckBox.isChecked());

        redCheckBox.set(false);
        Assert.assertFalse(blueCheckBox.isChecked());
        Assert.assertFalse(redCheckBox.isChecked());
    }
}
