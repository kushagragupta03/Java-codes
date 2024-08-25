//ArrayList Implementation
import java.util.ArrayList;

public class ArrayList_Implementation {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("kabir");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.size());
    cars.remove(1);
    System.out.println(cars);
    System.out.println(cars.size());
    
  }
}
