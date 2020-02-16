public class Hamming {
    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    void allowEmptyString(boolean allow){

        if (!allow) {
            if ("".equals(this.leftStrand)) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }
            if ("".equals(this.rightStrand)) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }
        }
    }
    int getHammingDistance() {
        int count = 0;
        if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        };
            for (int i = 0; i < this.leftStrand.length() ; i++) {
                char c = leftStrand.charAt(i);
                char c1 = this.rightStrand.charAt(i);
                if ( c != c1 ){
                    count += 1;
                }
        }
        return count;
    }
}
