package wordcount;

import java.util.Arrays;

class WordCount3 implements WordCount {

    @Override
    public long count(String text) {
        if (null == text || text.isEmpty()) {
            return 0L;
        }

        return Arrays.stream(text.split("\\s")).count();
    }
}
