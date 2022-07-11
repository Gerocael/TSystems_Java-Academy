package cars;

public class Truck extends Car{
    private String load;

    public Truck(String brand, String load) {
        super(brand);
        this.load = load;

    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public void unload(String load) {
        this.load = null;
    }

    @Override
    public String toString() {
        return "Truck "
                + super.toString()
                + ", load: " + load;
    }
}