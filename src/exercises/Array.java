package exercises;

import java.util.Arrays;

public class Array {
    public int makeArrayConsecutive2(int[] statues) {
        int[] orderedStatues = Arrays.stream(statues).sorted().toArray();;

        int needsStatues = 0;

        for (int i = 0; i < orderedStatues.length - 1; i++) {
            int diff =  orderedStatues[i + 1] - orderedStatues[i];
            if(diff > 1) {
                needsStatues += diff - 1;
            }
        }
        return needsStatues;
    }
}
