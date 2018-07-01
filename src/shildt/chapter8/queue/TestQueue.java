package shildt.chapter8.queue;

public class TestQueue {
    public static void main(String[] args) {
        MyDynCircularQueue<Integer> myDynCircularQueue = new MyDynCircularQueue<>(5);
        myDynCircularQueue.put(1);
        myDynCircularQueue.put(2);
        myDynCircularQueue.put(3);
        myDynCircularQueue.put(4);
        myDynCircularQueue.put(5);
        myDynCircularQueue.put(6);
        myDynCircularQueue.put(7);
        myDynCircularQueue.put(8);
        myDynCircularQueue.put(9);
        myDynCircularQueue.put(10);
        myDynCircularQueue.get();
        myDynCircularQueue.get();
        myDynCircularQueue.get();
        myDynCircularQueue.put(11);
        myDynCircularQueue.put(12);
        myDynCircularQueue.put(13);
        myDynCircularQueue.put(14);
        myDynCircularQueue.put(15);
        myDynCircularQueue.get();
        myDynCircularQueue.get();
        myDynCircularQueue.get();


        myDynCircularQueue.printQueue();
        myDynCircularQueue.reset();
        System.out.println("--------------");
        myDynCircularQueue.printQueue();
    }
}
