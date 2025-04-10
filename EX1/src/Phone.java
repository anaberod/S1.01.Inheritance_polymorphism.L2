public class Phone {

    private final String brand;
    private final String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String call(String phoneNumber) {
        return "Calling number " + phoneNumber;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
