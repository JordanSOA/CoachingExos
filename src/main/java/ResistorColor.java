import java.util.*;

public class ResistorColor {

    public int colorCode(String input) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("black",0);
        map.put("brown",1);
        map.put("red",2);
        map.put("orange",3);
        map.put("yellow",4);
        map.put("green",5);
        map.put("blue",6);
        map.put("violet", 7);
        map.put("grey",8);
        map.put("white",9);
        return map.get(input);
    }

    public Object[] colors() {
        List colorsList = new ArrayList();
        colorsList.add("black");
        colorsList.add("brown");
        colorsList.add("red");
        colorsList.add("orange");
        colorsList.add("yellow");
        colorsList.add("green");
        colorsList.add("blue");
        colorsList.add("violet");
        colorsList.add("grey");
        colorsList.add("white");

        return colorsList.toArray();
    }
}
