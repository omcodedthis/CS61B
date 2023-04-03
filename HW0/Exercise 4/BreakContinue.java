// The task:
// Write a function windowPosSum(int[] a, int n) that replaces each element a[i] with the sum of a[i] through a[i + n],
// but only if a[i] is positive valued. If there are not enough values because we reach the end of the array, we sum
// only as many values as we have.
// The class BreakContinue has 1 method, windowPosSum() and main() calls it, passing it an array. The altered array is
// then printed to the terminal.
public class BreakContinue {
    /** windowPosSum() does the above task, editing each index's value if needed. For the final index, the for-loop
     is broken as there is no need to change its value. */
    public static void windowPosSum(int[] a, int n) {
        int length = a.length;
        int max_index = length - 1;
        int current;

        for (int i = 0; i < length; i++) {
            current = a[i];

            if (i >= max_index) {
                break;
            }

            if (current < 0) {
                continue;
            }

            else {
                if (n > (max_index - i)) {
                    n = max_index - i;
                }

                for (int j = i; j < (i + n); j++) {
                    current += a[j + 1];
                }
                a[i] = current;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}