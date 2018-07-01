package shildt.chapter5;

import java.util.Scanner;

public class Ex5_4 {
    public static void main(String[] args) {
        int size = 6;
        int min;
        String strArr[] = new String[size];
        Scanner scanner = new Scanner(System.in);
        String temp;
        for(int i = 0; i < size; i++){
            System.out.println("Введите строку:");
            strArr[i] = scanner.nextLine();
        }
        System.out.println("Исходный массив:");
        for(String str : strArr){
            System.out.print(str + " ");
        }
        System.out.println();
        //Сортируем массив
        for(int i = 1; i < strArr.length; i++){
            for(int j = strArr.length-1; j >= i; j--){
                min = strArr[j-1].length() < strArr[j].length() ? strArr[j-1].length() : strArr[j].length();
                for(int k = 0; k < min; k++){
                    if(strArr[j-1].charAt(k) > strArr[j].charAt(k)){
                        temp = strArr[j - 1];
                        strArr[j - 1] = strArr[j];
                        strArr[j] = temp;
                        break;
                    }
                    else if (strArr[j-1].charAt(k) < strArr[j].charAt(k)){
                        break;
                    }
                    else if(k == min - 1 & min != strArr[j - 1].length()){
                        temp = strArr[j - 1];
                        strArr[j - 1] = strArr[j];
                        strArr[j] = temp;
                        break;
                    }
                }

            }
        }
        System.out.println("Отсортированный массив");
        for(String str : strArr){
            System.out.print(str + " ");
        }
    }
}
