import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("===================== ЗАДАНИЕ 1 =====================");
        int[] car = new int[50];
        Random rand = new Random();
        for(int i=0;i<car.length;i++){
            car[i]=rand.nextInt(2026-2000)+2000;
        }
        System.out.println("Годы выпуска машин:" + Arrays.toString(car));

        System.out.println("Машины, выпущенные после 2015 года:");
        for(int i = 0; i < car.length; i++) {
            if(car[i] > 2015) {
                System.out.println(car[i]);
            }
        }
        double sum = 0;
        int year= 2025;
        for(int i = 0; i < car.length; i++) {
            sum += year-car[i];
        }
        double avg = sum/car.length;
        System.out.println("Средний возраст авто: " + avg);
    }
}