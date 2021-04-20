package patterns.structural.adapter.device;

import patterns.structural.adapter.charger.TypeCCharger;

public interface TypeCDevice extends Device {
    void typeCCharge(TypeCCharger charger);
}
