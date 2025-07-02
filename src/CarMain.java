import java.util.*;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("===================== ЗАДАНИЕ 3 =====================");
        Car car1 = new Car("ABC123", "Camry", "Toyota", 2020, 45000, 25000.0);
        Car car2 = new Car("XYZ789", "Focus", "Ford", 2018, 60000, 18000.0);
        Car car3 = new Car("DEF456", "G-class", "Mercedes", 2022, 10000, 120000.0);
        Car car4 = new Car("ABC123", "Corolla", "Toyota", 2015, 120000, 15000.0); // Дубликат VIN

        System.out.println("=== Проверка равенства ===");
        System.out.println("car1.equals(car4): " + car1.equals(car4)); // true (одинаковый VIN)
        System.out.println("car1.equals(car2): " + car1.equals(car2)); // false
        System.out.println("Хэш-коды: car1=" + car1.hashCode() + ", car4=" + car4.hashCode());

        Set<Car> carSet = new HashSet<>();
        carSet.addAll(Arrays.asList(car1, car2, car3, car4));

        System.out.println("\n=== HashSet (без дубликатов) ===");
        carSet.forEach(System.out::println);

        List<Car> carList = new ArrayList<>(carSet);
        Collections.sort(carList);

        System.out.println("\n=== Сортировка по году (новые сначала) ===");
        carList.forEach(System.out::println);

        System.out.println("\n=== Сравнение через compareTo ===");
        System.out.println("car1 vs car3: " + car1.compareTo(car3)); // car3 новее (2022 vs 2020)
        System.out.println("car1 vs car2: " + car1.compareTo(car2)); // car1 новее (2020 vs 2018)
    }
}