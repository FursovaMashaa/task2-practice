import java.util.*;
import java.util.stream.Collectors;

public class CarStreamMain {
    public static void main(String[] args) {
        System.out.println("===================== ЗАДАНИЕ 4 =====================");
        List<Car> cars = Arrays.asList(
                new Car("VIN001", "Camry", "Toyota", 2020, 45000, 20000),
                new Car("VIN002", "Model 3", "Tesla", 2022, 30000, 35000),
                new Car("VIN003", "Accord", "Honda", 2019, 70000, 18000),
                new Car("VIN004", "X5", "BMW", 2021, 40000, 42000),
                new Car("VIN005", "A4", "Audi", 2023, 10000, 39000),
                new Car("VIN006", "Focus", "Ford", 2018, 90000, 12000),
                new Car("VIN005", "Camry", "Toyota", 2018, 60000, 20000)
        );

        List<Car> lowMileageCars = cars.stream().filter(car -> car.getMileage() < 50_000).collect(Collectors.toList());
        System.out.println("Машины с пробегом < 50_000:");
        lowMileageCars.forEach(System.out::println);

        List<Car> sortedByPriceDesc = lowMileageCars.stream().sorted(Comparator.comparingDouble(Car::getPrice).reversed()).collect(Collectors.toList());

        System.out.println("\nТоп-3 самые дорогие машины (пробег < 50_000):");
        sortedByPriceDesc.stream().limit(3).forEach(System.out::println);

        double averageMileage = cars.stream().mapToInt(Car::getMileage).average().orElse(0.0);
        System.out.printf("\nСредний пробег всех машин: %.2f км%n", averageMileage);

        Map<String, List<Car>> carsByManufacturer = cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer));

        System.out.println("\nМашины по производителям:");
        carsByManufacturer.forEach((maker, carList) -> {
            System.out.println(maker + ":");
            carList.forEach(car -> System.out.println("  " + car));
        });
    }
}