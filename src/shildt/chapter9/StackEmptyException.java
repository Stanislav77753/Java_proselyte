package shildt.chapter9;

public class StackEmptyException extends Exception{
    @Override
    public String toString() {
        return "Stack пуст{}";
    }
}
