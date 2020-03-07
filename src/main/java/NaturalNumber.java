public class NaturalNumber {

    public Classification classification;
    public int number;
    public NaturalNumber(int i) {
        if (i >= 1) {
            this.number = i;
        } else {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }

    public Classification getClassification() {
        int res = 0;
        for (int i = 1; i < this.number ; i++) {
            if ((this.number % i) == 0){
                res += i;
            }
        }
        if (res > this.number){
            return this.classification = Classification.ABUNDANT;
        } else if (res < this.number){
            return this.classification = Classification.DEFICIENT;
        } else {
            return this.classification = Classification.PERFECT;
        }
    }

    enum Classification {

        DEFICIENT, PERFECT, ABUNDANT

    }
}

