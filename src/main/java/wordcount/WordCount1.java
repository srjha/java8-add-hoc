package wordcount;

class WordCount1 implements WordCount {

    @Override
    public long count(String text) {
        if (null == text || text.isEmpty()) {
            return 0L;
        }

        return text.split("\\s").length;
    }
}
