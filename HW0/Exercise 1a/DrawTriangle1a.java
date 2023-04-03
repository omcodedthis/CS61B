// The class DrawTriangle1a draws a triangle with the size of 5. The first while loop is used to print the final '*',
// increase the size by 1 & rest row_count to 0 . The second while loop prints the '*' for each row without including
// the final '*' for the row. The row_count is increased by one each loop.
public class DrawTriangle1a {
    public static void main(String[] args) {
        int size = 0;
        int row_count = 0;
        while (size < 5) {
            while (row_count < size) {
                System.out.print("*");
                row_count++;
            }
            System.out.println("*");
            row_count = 0;
            size++;
        }
    }
}
