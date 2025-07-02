import java.util.*;
import java.util.stream.Collectors;
public class CarModels {
    public static void main(String[] args) {
        System.out.println("===================== ЗАДАНИЕ  2=====================");
        List<String> carModels = new ArrayList<>();
        carModels.add("BMW M4");
        carModels.add("Ford Focus");
        carModels.add("Mercedes G-class");
        carModels.add("BMW M4");
        carModels.add("Toyota Camry");
        carModels.add("Audi A4");
        carModels.add("Toyota Camry");
        carModels.add("Tesla Model S"); // Добавим Tesla для примера
        System.out.println("Модели машин (с дубликатами): " + carModels);

        List<String> uniqueCarModels = carModels.stream().distinct().collect(Collectors.toList());
        System.out.println("Модели машин (без дубликатов): " + uniqueCarModels);

        uniqueCarModels.sort(Collections.reverseOrder());
        System.out.println("Отсортированные модели (обратный порядок): " + uniqueCarModels);

        List<String> processedModels = new ArrayList<>();
        for (String model : uniqueCarModels) {
            if (model.contains("Tesla")) {
                processedModels.add("ELECTRO_CAR");
            } else {
                processedModels.add(model);
            }
        }
        System.out.println("Если модель содержит слово Tesla, замените её на ELECTRO_CAR: " + processedModels);

        Set<String> carModelsSet = new LinkedHashSet<>(processedModels);
        System.out.println("Сохранено в Set: " + carModelsSet);
    }
}