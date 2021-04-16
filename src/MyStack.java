public class MyStack {
    private int[] arr;
    private int size;
    private int index;
    
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
//    public MyStack(){
//        arr = new int[size];
//    }
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size() {
        return index;
    }

    private boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String show = "";
        for (int i = 0; i < arr.length; i++) {
            show+=arr[i]+" ";
        }
        return show;
    }
}
