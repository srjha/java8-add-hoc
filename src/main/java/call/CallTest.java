package call;

import java.util.Random;

public class CallTest {
    private static Integer random = 0;

    public static void main(String[] args) {
        new CallTest().setValue(random);
        System.out.println("Received: " +random);
    }

    public void setValue(Integer random) {
        int generatedNum = new Random().nextInt();
        System.out.println("Generated: " + generatedNum);
        random = generatedNum;
    }

}
