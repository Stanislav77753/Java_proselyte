package shildt.chapter2;

public class Ex2_11 {
    // вывод простых чисел от 2 до 100
    public static void main(String[] args) {
        int count;
        for(int i = 2; i <= 100; i++){
            count = 0;
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
                if(count > 1){
                    break;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }
    }
}
