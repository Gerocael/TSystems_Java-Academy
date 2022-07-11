package cars;

public class PersonalCar extends Car{
    private final int seats;

    public PersonalCar(String brand, int seats) {
        super(brand);
        this.seats = seats;

    }

    public int getNumberOfSeats() {
        return numberOfSeats();
    }

    public int numberOfSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "PersonalCar "
                + super.toString()
                + ", seats: " + seats;
    }
}