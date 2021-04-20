package patterns.creational.abstractFactory;

import org.junit.Assert;
import org.junit.Test;
import patterns.creational.abstractFactory.factory.AmmunitionFactory;
import patterns.creational.abstractFactory.factory.MetalAmmunitionFactory;
import patterns.creational.abstractFactory.factory.WoodenAmmunitionFactory;
import patterns.creational.abstractFactory.shield.MetalShield;
import patterns.creational.abstractFactory.shield.Shield;
import patterns.creational.abstractFactory.shield.WoodenShield;
import patterns.creational.abstractFactory.sword.MetalSword;
import patterns.creational.abstractFactory.sword.Sword;
import patterns.creational.abstractFactory.sword.WoodenSword;

public class AbstractFactoryTest {

    @Test
    public void shouldCreateWoodenAmmunition() {
        AmmunitionFactory ammunitionFactory = new WoodenAmmunitionFactory();
        Sword sword = ammunitionFactory.createSword();
        Shield shield = ammunitionFactory.createShield();

        Assert.assertTrue(sword instanceof WoodenSword);
        Assert.assertTrue(shield instanceof WoodenShield);
    }

    @Test
    public void shouldCreateMetalAmmunition() {
        AmmunitionFactory ammunitionFactory = new MetalAmmunitionFactory();
        Sword sword = ammunitionFactory.createSword();
        Shield shield = ammunitionFactory.createShield();

        Assert.assertTrue(sword instanceof MetalSword);
        Assert.assertTrue(shield instanceof MetalShield);
    }
}
