package nulltest;

import java.security.SecureRandom;

public class NullSafeCompare {
    public static void main(String[] args) {
        int randomInt = new SecureRandom().nextInt(100);

        String s1 = randomInt < 30 ? null : randomInt + "";
        String s2 = randomInt > 70 ? "" : randomInt + "";

        System.out.println("Result: "+compare(s1, s2));
    }

    /**
     * @param s1 - First string, Can be null or any string value
     * @param s2 - Second String, can be null or any string value
     * @return
     */
    private static boolean compare(String s1, String s2) {
        System.out.println("First:"+s1+", Second:"+s2);
        // Implementation goes here
        return false;
    }
}
