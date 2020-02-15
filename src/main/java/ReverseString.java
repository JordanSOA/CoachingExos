import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public String reverse(String lineToReverse) {
        StringBuilder lineToReverseModel = new StringBuilder();
        lineToReverseModel.append(lineToReverse);
        lineToReverseModel = lineToReverseModel.reverse();
        String reverseLine = String.valueOf(lineToReverseModel);
        return reverseLine;
    }
}
