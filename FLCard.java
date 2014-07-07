public class FLCard {

    protected FLDate tcgDate;
    protected FLDate ocgDate;
    protected String name;

    public FLCard (String inName, FLDate inTcg, FLDate inOcg) {

        name = inName;
        tcgDate = inTcg;
        ocgDate = inOcg;

    }

    public int compareTCG (FLCard cardTwo) {

        return tcgDate.compareTo(cardTwo.tcgDate);

    }

    public int compareOCG (FLCard cardTwo) {

        return ocgDate.compareTo(cardTwo.ocgDate);

    }

    public String toString() {

        return "\"" + name + "\" " + tcgDate + " " + ocgDate;

    }

}
