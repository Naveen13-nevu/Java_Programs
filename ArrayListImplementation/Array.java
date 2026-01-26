class MyArrayList {

    private int size = 0;
    private int capacity = 5;
    private int[] arr = new int[capacity];

    // Add element
    public void add(int value) {
        if (size == capacity) {
            grow();
        }
        arr[size++] = value;
    }

    // Increase capacity
    private void grow() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Get element
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    // Remove element
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--; // decrease size
    }

    // Size
    public int size() {
        return size;
    }

    // Display elements
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


public class Array {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60); // triggers grow()

        list.display(); // 10 20 30 40 50 60

        list.remove(2);
        list.display(); // 10 20 40 50 60

        System.out.println(list.get(1)); // 20
        System.out.println(list.size()); // 5
    }
}
