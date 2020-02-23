import java.util.*;

public class ProteinTranslator {


    public List<String> translate(String input) {

        Map<String, List<String>> map = new HashMap<>();
        List<String> valMethionine = new ArrayList<>();
        valMethionine.add("AUG");
        List<String> valPhenylalanine = new ArrayList<>();
        valPhenylalanine.add("UUU");
        valPhenylalanine.add("UUC");
        List<String> valLeucine = new ArrayList<>();
        valLeucine.add("UUA");
        valLeucine.add("UUG");
        List<String> valSerine = new ArrayList<>();
        valSerine.add("UCU");
        valSerine.add("UCC");
        valSerine.add("UCA");
        valSerine.add("UCG");
        List<String> valCysteine = new ArrayList<>();
        valCysteine.add("UGU");
        valCysteine.add("UGC");
        List<String> valTyrosine = new ArrayList<>();
        valTyrosine.add("UAU");
        valTyrosine.add("UAC");
        List<String> valTryptophan = new ArrayList<>();
        valTryptophan.add("UGG");
        List<String> valStop = new ArrayList<>();
        valStop.add("UAA");
        valStop.add("UAG");
        valStop.add("UGA");
        map.put("Methionine", valMethionine);
        map.put("Phenylalanine", valPhenylalanine);
        map.put("Leucine", valLeucine);
        map.put("Serine", valSerine);
        map.put("Tyrosine", valTyrosine);
        map.put("Cysteine", valCysteine);
        map.put("Tryptophan", valTryptophan);
        map.put("STOP", valStop);

        StringBuilder sepStr = new StringBuilder();
        String originInput = input;
        List<String> proteinFound = new ArrayList<>();
        String res ;
        for (int i = 0; i <= input.length(); i++) {
            res = input.substring(0, 3);

            String[] split = (input.split(res));
            sepStr.append(res);
            if (sepStr.length() == originInput.length()) {
                input = "";
            }

            if (split.length != 0) {
                switch (i){
                    case 0:
                        input = split[i + 1];
                        break;
                    case 1 :
                        input = split[i];
                        break;
                    default:
                        input = split[i - 1];
                        break;
                }
            }

            for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
                String protein = stringListEntry.getKey();
                List<String> codons = stringListEntry.getValue();
                for (String s : codons) {
                    if (s.equalsIgnoreCase(res)) {
                        if ("STOP".equals(protein)) {
                            return proteinFound;
                        }
                        proteinFound.add(protein);
                    }
                }
            }
        }
        return proteinFound;
    }
}