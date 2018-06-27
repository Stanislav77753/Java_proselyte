package shildt.chapter3;

import java.io.IOException;

public class Ex3_10 {
    //программа преобразует строчные в прописные, а пропистные в строчные буквы
    public static void main(String[] args) throws IOException {
        int choise;
        int count = 0;
            System.out.println("Введите буквы:");
            do {
                choise = System.in.read();
                if (choise >= 65 & choise < 90) {
                    choise += 32;
                    System.out.println((char) choise);
                    count++;
                } else if (choise >= 97 & choise < 122) {
                    choise -= 32;
                    System.out.println((char) choise);
                    count++;
                }
                if (choise == '.') {
                    break;
                }
            }
            while (choise != '.');
        System.out.println("Количество букв у которых был изменен регистр - " + count);
    }
}
