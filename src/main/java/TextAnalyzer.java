import java.util.*;

public class TextAnalyzer {
    private final String text;

    public TextAnalyzer(String text){
        this.text = text.toLowerCase();
    }

    public List<String> getUniqueWords() {
        String[] wordsArray = this.text.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();

        for(String word : wordsArray){
            String cleanWords = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");

            if(!cleanWords.isEmpty()){
                uniqueWords.add(cleanWords);
            }
        }

        return new ArrayList<>(uniqueWords);
    }

    public int getWordCount() {
        return getUniqueWords().size();
    }

    public List<String> getSortedWords() {
        String[] wordsArray = this.text.split("\\s+");
        Set<String> uniqueSortedWords = new TreeSet<>();

        for(String word : wordsArray){
            String cleanWords = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");

            if(!cleanWords.isEmpty()){
                uniqueSortedWords.add(cleanWords);
            }
        }

        return new ArrayList<>(uniqueSortedWords);
    }
}
