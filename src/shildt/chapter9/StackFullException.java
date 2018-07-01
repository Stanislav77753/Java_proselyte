package shildt.chapter9;

public class StackFullException extends Exception {
    int size;

    public StackFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Stack заполенен{" +
                " максимальный размер =" + size +
                '}';
    }
}
