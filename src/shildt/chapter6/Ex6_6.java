package shildt.chapter6;

public class Ex6_6 {
    public static void main(String[] args) {
        Clazz clazz = new Clazz();
        clazz.reversePrint("Java");
    }
}
class Clazz{

    public void reversePrint(String string){
        if(string.length() == 0){
            return;
        }
        else{
            System.out.print(string.charAt(string.length() - 1));
            reversePrint(string.substring(0,string.length()-1));
        }
    }
}