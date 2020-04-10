package example;


public class EightExercise {

    public static void main(String[] args) {


        String[][] arr = new String[4][10];
        String i = "*";

        int u;
        int y;
        for (u = 0; u < arr.length; u++) {
            for (y = 0; y < arr[u].length; y++) {

                arr[u][y] = i;

                System.out.print(arr[u][y]);
            }
            System.out.println();
        }
    }

}
