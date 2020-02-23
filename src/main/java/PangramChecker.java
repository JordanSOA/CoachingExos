import java.util.ArrayList;
import java.util.stream.Stream;

public class PangramChecker {


    public PangramChecker() {
    }

    public boolean isPangram(String input) {
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if ('A' <= c && c <= 'Z') {
                index = c - 'A';
            } else if('a' <= c && c <= 'z')
                index = c - 'a';
            mark[index] = true;
        }
        int j = 0;
        while (j <= 25) {
            if (!mark[j]) {
                return false;
            }
            j++;
        }
        return true;
    }
}
