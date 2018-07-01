package shildt.chapter5;

public class Ex5_3 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double sum = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = 0 + (Math.random()*100);
            sum+=arr[i];
        }
        System.out.println("Среднее арифметическое 10 значений double = " + String.format("%.2f",sum/10));
    }
}
