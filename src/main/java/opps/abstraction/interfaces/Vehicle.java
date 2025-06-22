package opps.abstraction.interfaces;

public abstract class Vehicle implements Transport{
    private String model;

    public Vehicle() {
    }

    public Vehicle(String model) {
        this.model = model;

    }
    public String getModel() {
        return model;

    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void getSetGo() {
        System.out.println("get set go");
    }
}
