package virtual_pet;

public abstract class Robots extends VirtualPet {

    protected int oilLevel = 50;

    protected boolean needsOil = false;

    protected boolean poweredOn = true;

    protected int batteryLevel = 50;

    protected String type;

    public String getType() {
        return type;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public boolean isNeedsOil() {
        return needsOil;
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public Robots(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName() + ": " +
                "\n    Type: " + getType() +
                "\n    Oil level: " + getOilLevel() +
                "\n    Battery level: " + getBatteryLevel() +
                "\n    Powered on: " + (isPoweredOn() ? "yes" : "no") +
                "\n    Needs oil: " + (isNeedsOil() ? "yes" : "no");

    }

    public void changeBattery() {
        batteryLevel = 50;
    }

    private void decreaseOilLevel() {
        if (isPoweredOn()) {
            oilLevel -= 3;
            if (oilLevel < 0) oilLevel = 0;
        }
        needsOil = oilLevel < 10;
    }

    private void decreaseBatteryLevel() {
        batteryLevel -= 6;
        if (batteryLevel < 0) batteryLevel = 0;
        poweredOn = batteryLevel != 0;
    }

    @Override
    public void tick() {
        decreaseOilLevel();
        decreaseBatteryLevel();
    }

    @Override
    public void play() {
        if (isNeedsOil() || !isPoweredOn()) {
            System.out.println(getName() + " requires maintenance!");
            System.out.println("Powered on: " + (isPoweredOn() ? "yes" : "no") + "\nNeeds oil: " + (isNeedsOil() ? "yes" : "no"));
            return;
        }
        oilLevel -= 8;
        batteryLevel -= 10;
    }

    public abstract void changeOil();
}
