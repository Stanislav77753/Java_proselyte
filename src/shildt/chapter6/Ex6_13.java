package shildt.chapter6;

public class Ex6_13 {
    public static void main(String[] args) {
        Test13 test13 = new Test13();
        System.out.println(test13.sum(10,15,14,16,17,18));
    }

}
class Test13{
    private int sum = 0;
    public int sum(int...a){
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
