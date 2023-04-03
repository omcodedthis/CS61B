// The class FindMaxInArray has 1 method, max() which finds the maximum integer in a given array. main() calls max()
// passing the array to max(). The max value is then printed into the terminal.
public class FindMaxInArray {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int length = m.length;
        int current_max = m[0];
        int current_number;

        for (int i = 1; i < length; i++) {
            current_number = m[i];
            if (current_number > current_max) {
                current_max = current_number;
            }
        }
        return current_max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        int max_value = max(numbers);
        System.out.println(max_value);
    }
}