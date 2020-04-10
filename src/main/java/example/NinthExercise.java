package example;

public class NinthExercise {

    public static void main(String[] args) {

        String[][] mas = new String[5][10];
        String a = "*";


        int u;
        int y;


        for (u = 0; u < mas.length; u++){
            for(y = 0; y < u+1 ; y++){

                mas[u][y] = a;
                System.out.print(mas[u][y]);
            }
            System.out.println();
            }

    }
}
