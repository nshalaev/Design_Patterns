package patterns.structural.adapter.device;

import patterns.structural.adapter.charger.TypeCCharger;

public class Phone implements TypeCDevice {

    private boolean isCharging = false;

    @Override
    public void typeCCharge(TypeCCharger charger) {
        if (charger != null) {
            this.isCharging = true;
            charger.typeCCharge();
        }
    }

    @Override
    public boolean isCharging() {
        return this.isCharging;
    }
}
