package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.shield.Shield;
import patterns.creational.abstractFactory.sword.Sword;

//abstraction factory
public interface AmmunitionFactory {
    Sword createSword();
    Shield createShield();
}
