package interview;

public class Celebrity_status {

    public static void main(String arg[]) {
        int data[][] = {{1, 0, 1, 1, 0}, {0, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 0}, {1, 0, 1, 1, 1}};
        int c = 0;
        while (c < data.length) {
            int count = 0;
            for (int row = 0; row < data.length; row++) {
                if (data[c][row] == 1)//30,31,32,33,31
                    count++;
            }
            if (count == 0)//not knowning anyone
            {
                int count2 = 0;
                for (int column = 0; column < data.length; column++) {
                    if (data[column][c] == 1)//03,13,23,33,34
                        count2++;
                }
                if (count2 == data.length - 1)
                    System.out.println("Celebrity is:" + c);
            }
            c++;
        }
    }
}
