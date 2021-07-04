public class Clock {
    public static void main(String[] args) {
        int column = 20;
        int rows = 9;

        for (int i = 0; i < rows; i++) {
            int val = i < (rows / 2) ? i + 1 : rows - i;
            int sh = i < (rows / 2) ? i * 2 : (rows - i - 1) * 2;
            for (int j = 0; j < sh; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < column - 2 * sh; j++) {
                System.out.print(val + " ");
            }
            System.out.println();

        }


    }
}
