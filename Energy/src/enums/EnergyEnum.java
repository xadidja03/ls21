package enums;

public enum EnergyEnum {
    YOU_ARE_HUNGRY(0.0),
    YOU_ARE_VERY_HUNGRY(0.0),
    YOU_DIED(0.0),
    INCREMENT_ENERGY_BY_MILK(1.08),

    INCREMENT_ENERGY_BY_MEAT(1.10),
    DECREMENT_ENERGY(0.91);
    final double value;

    EnergyEnum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
