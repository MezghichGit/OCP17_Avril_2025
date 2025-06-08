package QCM1;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Car> myCars = new ArrayList<>(List.of(
            new Car("Mercedes", 2500.0),
            new Car("BMW", 3500.0),
            new Car("Audi", 6000.0)
        ));

        OptionalDouble average = myCars.stream()
            .peek(c -> c.setPrice(1000))
            .mapToDouble(Car::getPrice)
            .average();

        average.ifPresent(System.out::println); // should print 1000.0
    }
}


