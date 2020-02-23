
import java.util.regex.Pattern;

public class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        Pattern pat = Pattern.compile("'[a-zA-Z]|\\W|_");
        String[] splitPhrase = pat.split(this.phrase, this.phrase.length());
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : splitPhrase) {
            if (!s.isEmpty()) {
                char firstLetter = s.charAt(0);
                stringBuilder.append(firstLetter);
            }
        }
        return stringBuilder.toString().toUpperCase();
    }
}
