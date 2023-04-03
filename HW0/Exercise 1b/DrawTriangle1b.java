// The class DrawTriangle1b has a method called drawTriangle. drawTriangle has 1 parameter, N, which denotes the size
// of the triangle that is printed to the terminal. main() simply calls drawTriangle(), passing an argument where N is
// 10.
public class DrawTriangle1b {
    public static void drawTriangle(int N) {
        int size = 0;
        int row_count = 0;
        while (size < N) {
            while (row_count < size) {
                System.out.print("*");
                row_count++;
            }
            System.out.println("*");
            row_count = 0;
            size++;
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}
