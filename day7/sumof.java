package day7;

import java.util.Arrays;

public class sumof {
    public static  int[] find(int[][] arr) {
        int[] result = {
            Integer.MAX_VALUE,
            Integer.MIN_VALUE
        };
        for(int[] row:arr) {
            result[0] = Math.min(result[0],Arrays.stream(row).min().getAsINt());
            result[1] = Math.max(result[1],Arrays.stream(row).max().getAsINt);
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] tds = {
            {2,5,12},
            {9,4},
            {45,32,12,23,54}
        };

        int received = find(tds);
        System.out.println(Arrays.toString(received));
    }
}
