public class FLCardNode {

    public FLCardNode left;
    public FLCardNode right;
    public FLCard value;

    public FLCardNode(){};

    public FLCardNode(FLCard inValue) {
        value = inValue;
    }

    public String toString() {
        return value.toString();
    }

}
