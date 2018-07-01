package shildt.chapter5;

public class Ex5_13 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;
        for(int i = 0; i < nums.length; i++){
            nums[i] = 0 + (int)(Math.random()*100);
        }
        for(int x : nums){
            System.out.print(x + " ");
        }
        min = max = nums[0];
        for(int x : nums){
           if(max < x){
               max = x;
           }
           if(min > x){
               min = x;
           }
        }
        System.out.println("\n" + "Максимальное значение в массиве - " + max);
        System.out.println("Минимальное значение в массиве - " +min);
    }

}

