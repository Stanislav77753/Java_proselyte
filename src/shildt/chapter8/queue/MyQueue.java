package shildt.chapter8.queue;

public interface MyQueue<T> {
    void put(T t);
    T get();
    void reset();
}
