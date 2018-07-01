package shildt.chapter6;

public class Ex6_4 {
    public static void main(String[] args) {
        Test test1 = new Test(5);
        Test test2 = new Test(10);
        System.out.println(test1.a);
        System.out.println(test2.a);
        test1.swap(test2);
        System.out.println(test1.a);
        System.out.println(test2.a);
    }
}

class Test{
    int a;
    Test(int i){
        a = i;
    }
    public void swap(Test test){
        int temp = test.a;
        test.a = a;
        a = temp;
    }
}
