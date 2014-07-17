public class FLList {

    public FLListNode root;
    public FLListNode tail;
    public FLIntNode ocgRoot;
    public FLIntNode tcgRoot;
    public FLIntNode ocgTail;
    public FLIntNode tcgTail;
    public FLList () {};

    public FLList (String inId) {

        insert(inId);

    }

    public void insert (String inId) {

        if (root == null) {
            root = new FLListNode(inId);
            tail = root;
        }
        else {
            tail.next = new FLListNode(inId);
            tail = tail.next;
        }

    }

    public void insertTcg (int inValue) {

        if (tcgRoot == null) {
            tcgRoot = new FLIntNode(inValue);
            tcgTail = tcgRoot;
        }
        else {
            tcgTail.next = new FLIntNode(inValue);
            tcgTail = tcgTail.next;
        }

    }
    
    public void insertOcg (int inValue) {

        if (ocgRoot == null) {
            ocgRoot = new FLIntNode(inValue);
            ocgTail = ocgRoot;
        }
        else {
            ocgTail.next = new FLIntNode(inValue);
            ocgTail = ocgTail.next;
        }

    }
}
