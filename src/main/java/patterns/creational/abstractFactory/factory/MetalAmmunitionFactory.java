package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.shield.MetalShield;
import patterns.creational.abstractFactory.shield.Shield;
import patterns.creational.abstractFactory.sword.MetalSword;
import patterns.creational.abstractFactory.sword.Sword;

public class MetalAmmunitionFactory implements AmmunitionFactory {
    @Override
    public Sword createSword() {
        return new MetalSword();
    }

    @Override
    public Shield createShield() {
        return new MetalShield();
    }
}
