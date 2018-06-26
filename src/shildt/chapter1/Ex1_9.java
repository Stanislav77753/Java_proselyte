package shildt.chapter1;

import java.util.Scanner;

public class Ex1_9 {
    public static void main(String[] args) {
        // вес на луне
        boolean inParametr = true;
        Scanner scanner = new Scanner(System.in);
        double mass;
        while (inParametr){
            try {
                System.out.println("Введите массу вашего тела в кг:");
                mass = scanner.nextDouble();
                System.out.println("Ваш вес на луне составляет - " + String.format("%.2f",mass * 9.81 * 0.17) + " Н");
                inParametr = false;
            }
            catch(Exception e){
                System.out.println("Введите массу цифрами");
            }
        }


    }
}
