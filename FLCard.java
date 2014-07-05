public class FLCard {

    protected FLDate tcgDate;
    protected FLDate ocgDate;
    protected java.util.String name;

    public FLCard (java.util.String inName, FLDate inTcg, FLDate inOcg) {

        name = inName;
        tcgDate = inTcg;
        ocgDate = inOcg;

    }

}
