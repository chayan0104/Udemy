package CollectionFramework.Travesing.PassingClass;
import java.util.ArrayList;
//Here we are passing a class as a data item.

public class Traverse2 {
    public static void main(String[] args) {
        //List<Vehicle> carList = new linkedList<Vehicle>(1000);
        //or
        ArrayList<Vehicle> carList = new ArrayList<Vehicle>(1000);
        carList.add(new Vehicle("Honda","City",12,true));
        //or
        Vehicle carList2 = new Vehicle("Tata","Safari",15,false);
        carList.add(carList2);

        for (Vehicle cars : carList) {
            //System.out.println(cars.getManufacturer()+" "+cars.getModel()+" "+cars.Price+" "+cars.FourWheelDrive);
            System.out.println(cars);
        }
    }
}
