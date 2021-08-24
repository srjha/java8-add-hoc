package wordcount;

public class Test {

    private static final String TEXT = "Hi, there! oops there! again";

    public static void main(String[] args) {
        WordCount wordCount = new WordCount1();
        System.out.println("result 1: " + wordCount.count(TEXT));

        wordCount = new WordCount2();
        System.out.println("result 2: " + wordCount.count(TEXT));

        wordCount = new WordCount3();
        System.out.println("result 3: " + wordCount.count(TEXT));

        wordCount = new WordCount4();
        System.out.println("result 4: " + wordCount.count(TEXT));

    }
}
