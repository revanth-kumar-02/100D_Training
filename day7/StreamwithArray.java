package day7;

import java.util.Arrays;

public class StreamwithArray {
    public static void shortList(double[][] arr) {
        for (double[] row : arr) {
            double[] temp = Arrays.stream(row)
                    .filter(each -> each > 0)
                    .toArray();
        }
    }
}
