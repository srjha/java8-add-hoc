package wordcount;

import java.util.Arrays;
import java.util.stream.Collectors;

class WordCount4 implements WordCount {

    @Override
    public long count(String text) {
        if (null == text || text.isEmpty()) {
            return 0L;
        }

        return Arrays.stream(text.split("\\s")).collect(Collectors.groupingBy(w -> w.toUpperCase())).size();
    }
}
