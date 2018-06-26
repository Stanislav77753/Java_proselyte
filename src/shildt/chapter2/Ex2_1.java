package shildt.chapter2;

import java.util.Scanner;

public class Ex2_1 {
    //Рассчитать расстоние до скалы
    public static void main(String[] args) {
        double velocity = 331.46; //скорость звука в воздухе м/с
        boolean inParametr = true;
        double time;
        Scanner scanner = new Scanner(System.in);
        while (inParametr){
            try {
                System.out.println("Введите время за которое вернулось эхо (в секундах):");
                time = scanner.nextDouble();
                System.out.println("Расстояние до скалы - " + String.format("%.2f",velocity * (time / 2)) + " м");
                inParametr = false;
            }
            catch(Exception e){
                System.out.println("Введите время цифрами");
            }
        }
    }
}
