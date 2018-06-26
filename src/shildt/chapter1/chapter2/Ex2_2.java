package shildt.chapter1.chapter2;

public class Ex2_2 {
    //таблица истиности
    public static void main(String[] args) {
        int p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        for(p = 0; p <= 1 ; p ++){
            for(q = 0; q <= 1; q++){
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.print((p^q) + "\t" + (p == 0 ? 1 : 0) + "\t");
                System.out.println();
            }
        }
    }
}
