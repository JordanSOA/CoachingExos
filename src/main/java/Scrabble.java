import java.util.stream.Stream;

public class Scrabble {
    private int score;
    private String word;

    public Scrabble(String word) {
        this.word = word;
    }
    public int getScore() {
        this.score = 0;
        if ("".equals(this.word)){
            this.score += 0;
        } else {
            char[] chars = this.word.toCharArray();
            for (char aChar : chars) {
                if (Stream.of("a", "e", "i", "o", "u", "l", "n", "r", "s", "t").anyMatch(s -> s.equalsIgnoreCase(String.valueOf(aChar)))
                ) {
                    this.score += 1;
                } else if (Stream.of("d","g").anyMatch(s -> s.equalsIgnoreCase(String.valueOf(aChar)))){
                    this.score += 2;
                }else if (Stream.of("b","c","m","p").anyMatch(s -> s.equalsIgnoreCase(String.valueOf(aChar)))){
                    this.score += 3;
                }else if (Stream.of("f","h","v","w","y").anyMatch(s -> s.equalsIgnoreCase(String.valueOf(aChar)))){
                    this.score += 4;
                }else if ("k".equalsIgnoreCase(String.valueOf(aChar))){
                    this.score += 5;
                }else if (Stream.of("j","x").anyMatch(s -> s.equalsIgnoreCase(String.valueOf(aChar)))){
                    this.score += 8;
                }else if (Stream.of("q","z").anyMatch(s -> s.equalsIgnoreCase(String.valueOf(aChar)))){
                    this.score += 10;
                }
            }
        }
        return this.score;
    }

}
