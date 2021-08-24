package wordcount;

import java.util.StringTokenizer;

class WordCount2 implements WordCount {

    @Override
    public long count(String text) {
        if (null == text || text.isEmpty()) {
            return 0L;
        }

        return new StringTokenizer(text).countTokens();
    }
}
