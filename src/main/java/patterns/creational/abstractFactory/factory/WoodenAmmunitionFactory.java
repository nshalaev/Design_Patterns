package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.shield.Shield;
import patterns.creational.abstractFactory.shield.WoodenShield;
import patterns.creational.abstractFactory.sword.Sword;
import patterns.creational.abstractFactory.sword.WoodenSword;

public class WoodenAmmunitionFactory implements AmmunitionFactory {

    @Override
    public Sword createSword() {
        return new WoodenSword();
    }

    @Override
    public Shield createShield() {
        return new WoodenShield();
    }
}
