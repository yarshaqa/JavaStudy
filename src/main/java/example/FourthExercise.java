package example;


public class FourthExercise {
    public static void main(String[] args) {


        int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        int i;

        int sum = 0;

        for (i = 1; i < arr.length-1; i++) {
            //Arr[i] += i;

            sum += arr[i];

        }
        System.out.println(sum);


    }

}
