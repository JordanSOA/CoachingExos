import com.sun.tools.javac.util.StringUtils;
import jdk.internal.joptsimple.util.RegexMatcher;
import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Objects;
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
        for (int i = 0; i < splitPhrase.length; i++) {
            if (!splitPhrase[i].isEmpty()){
                char firstLetter = splitPhrase[i].charAt(0);
                stringBuilder.append(firstLetter);
            }
        }
        return stringBuilder.toString().toUpperCase();
    }
}
