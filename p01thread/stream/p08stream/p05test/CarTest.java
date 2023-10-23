package org.example.thread.p01thread.stream.p08stream.p05test;

import java.util.List;
import java.util.stream.Stream;

public class CarTest {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("bmw", "ghermez", 2000, 12000),
                new Car("renault", "sefid", 2023, 12000),
                new Car("bmw", "ghermez", 1809, 12000),
                new Car("benz", "zard", 2009, 33443),
                new Car("renault", "zard", 2000, 12000),
                new Car("benz", "sefid", 1980, 1200340),
                new Car("bmw", "ghermez", 2000, 12000),
                new Car("bmw", "zard", 2000, 343434),
                new Car("benz", "zard", 2004, 343434),
                new Car("bmw", "zard", 2020, 12345),
                new Car("renault", "zard", 2000, 3456),
                new Car("renault", "zard", 2022, 12000),
                new Car("bmw", "sefid", 2001, 44444)
        );

       /*   cars.stream().filter(car -> car.getColour().equals("sefid"))
                       .forEach(System.out::println);*/




       /* cars.stream().filter(car -> car.getColour().equals("zard"))
                     .filter(car -> car.getModel() > 2000)
                     .sorted((o1, o2) -> o1.getModel()- o2.getModel())
                     .forEach(System.out::println);*/





        cars.stream().filter(car -> car.getColour().equals("zard") && car.getModel()>2010)
                .sorted((o1, o2) -> o1.getModel()- o2.getModel())
                .forEach(System.out::println);


    }
}
