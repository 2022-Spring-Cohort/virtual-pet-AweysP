package virtual_pet;

public abstract class Organic extends VirtualPet {

    private boolean needsToPoop;

    protected String type;

    public String getType() {
        return type;
    }

    public boolean isNeedsToPoop() {
        return needsToPoop;
    }

    public Organic(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName() + ":" +
                "\n    Type: " + getType() +
                "\n    Hunger: " + getHunger() ;

    }

}
