package example;

public class MrMax {

    static int max(int first, int second) {
        return first > second ? first : second;
    }

    static int max(int first, int second, int third, int fourth) {
        int[] variables = {first, second, third, fourth};
        int max = variables[0];
        for (int i = 1; i < variables.length; i++) {
            if (variables[i] > max)
                max = variables[i];
        }
        return max;
    }

}
