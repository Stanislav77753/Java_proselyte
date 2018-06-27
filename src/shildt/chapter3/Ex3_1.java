package shildt.chapter3;

import java.io.IOException;

public class Ex3_1 {
    //программа получается символы до тех пора, пока не встретиться точка. реализовать подсчет пробелов
    public static void main(String[] args) throws IOException {
        char choise;
        int count = 0;
            System.out.println("Введите символы:");
            do{
                choise = (char) System.in.read();
                if(choise == ' '){
                    count++;
                }
                if(choise == '.'){
                    break;
                }
            }
            while (choise != '.');
        System.out.println("Количество пробелов - " + count);
    }
}
