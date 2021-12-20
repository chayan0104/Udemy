package CollectionFramework.Traversing.PassingClass;

public class Vehicle {
    String Manufacturer;
    String Model;
    Integer  Price;
    Boolean FourWheelDrive;

    @Override
    public String toString() {
        return "Vehicle{" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", Price=" + Price +
                ", FourWheelDrive=" + FourWheelDrive +
                '}';
    }

    public Vehicle(String manufacturer, String model, Integer price, Boolean fourWheelDrive) {
        Manufacturer = manufacturer;
        Model = model;
        Price = price;
        FourWheelDrive = fourWheelDrive;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Boolean getFourWheelDrive() {
        return FourWheelDrive;
    }

    public void setFourWheelDrive(Boolean fourWheelDrive) {
        FourWheelDrive = fourWheelDrive;
    }
}
