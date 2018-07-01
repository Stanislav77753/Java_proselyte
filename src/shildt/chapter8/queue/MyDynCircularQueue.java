package shildt.chapter8.queue;

public class MyDynCircularQueue<T> implements MyQueue {

    private T queue[];
    private int putloc, getloc, size;

    public MyDynCircularQueue(int size){
        this.size = size;
        queue = (T[]) new Object[size];
        putloc = getloc = -1;
    }

    @Override
    public void put(Object o) {
        // если вставляемый элемент является последним и до момента вставки ни одного элемента не извлекали
        if(putloc == queue.length - 1 && getloc == -1){
            putloc = -1;
            T[] t = (T[]) new Object[queue.length * 2];
            for(int i = 0; i < queue.length; i++){
                t[i] = queue[i];
                putloc++;
            }
            queue = t;
        }
        else if(putloc + 1 == getloc){
            T[] t = (T[]) new Object[queue.length * 2];
            putloc = -1;
            for(int i = getloc + 1; i < queue.length; i++){
                t[i - getloc - 1] = queue[i];
                putloc++;
            }
            for(int i = 0; i < getloc; i++){
                t[queue.length - getloc - 1 + i] = queue[i];
                putloc++;
            }
            queue = t;
            getloc = -1;
        }
        putloc++;
        if(putloc == queue.length) putloc = 0;
        queue[putloc] = (T)o;
    }

    @Override
    public Object get() {
        if (getloc == putloc){
            System.out.println("Queue is empty");
            return null;
        }
        getloc++;
        if(getloc == queue.length) getloc = 0;
        T object = queue[getloc];
        queue[getloc] = null;
        return object;
    }

    @Override
    public void reset() {
        T[] t = (T[]) new Object[size];
        queue = t;
        putloc = getloc = -1;
    }

    public void printQueue(){
        for(T x : queue){
            System.out.println(x);
        }
    }
}
