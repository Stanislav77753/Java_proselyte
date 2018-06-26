package shildt.chapter1;

public class Ex1_10 {
    // дюймы в метры
    public static void main(String[] args) {
        int inch;
        for(inch = 1; inch <= 144; inch++){
            if(inch > 10 & inch < 21){
                System.out.println(inch + " дюймов соответсвует " + String.format("%.4f",inch * 0.0254) + " метра" );
            }
            else if(inch % 10 == 1){
                System.out.println(inch + " дюйм соответсвует " + String.format("%.4f",inch * 0.0254) + " метра" );
            }
            else if(inch % 10 > 1 & inch % 10 < 5){
                System.out.println(inch + " дюйма соответсвует " + String.format("%.4f",inch * 0.0254) + " метра" );
            }
            else{
                System.out.println(inch + " дюймов соответсвует " + String.format("%.4f",inch * 0.0254) + " метра" );
            }
            if(inch % 12 == 0){
                System.out.println();
            }
        }
    }
}
