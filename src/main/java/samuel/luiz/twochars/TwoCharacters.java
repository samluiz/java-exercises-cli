package samuel.luiz.twochars;

import java.util.HashMap;
import java.util.Map;

public class TwoCharacters {
    public static int alternate(String s) {
        char[] chars = s.toCharArray();
        int[] unique = s.chars().distinct().toArray();
        int maxLength = 0;

        for (int i = 0; i < unique.length - 1; i++) {
            char c1 = (char) unique[i];

            for (int j = i + 1; j < unique.length; j++) {
                char c2 = (char) unique[j];
                int count = 0;
                boolean valid = true;
                int totalUniqueChars = 0;

                for (char aChar : chars) {
//                    System.out.println("c1: " + chars[k] + " - " + c1);
//                    System.out.println("c2: " + chars[k] + " - " + c2);
                    if (aChar == c1) {
                        totalUniqueChars++;
                        count++;
                    } else if (aChar == c2) {
                        totalUniqueChars--;
                        count++;
                    }
//                    System.out.println("count: " + count);
//                    System.out.println("totalUniqueChars: " + totalUniqueChars);
                    if (totalUniqueChars > 1 || totalUniqueChars < 0) {
                        valid = false;
                        break;
                    }
                }
                if (valid && count > maxLength) {
                    maxLength = count;
                }
            }
        }
        return maxLength;
    }

    public void run(String s) {
        int maxLength = alternate(s);

        System.out.println("The max length of a alternating substring of " + s + " is " + maxLength);
    }
}
