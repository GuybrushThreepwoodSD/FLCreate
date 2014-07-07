public class FLCardTree {

    private FLCardNode root;
    public boolean ocg;

    public FLCardTree(){};

    public FLCardTree(FLCard initial) {

        insert(initial);

    }

    public void insert(FLCard toAdd) {  

        if (ocg)
            insertOcg(toAdd);
        else if (root == null)
            root = new FLCardNode(toAdd);
        else
            recursiveAdd(root, toAdd);

    }

    public void insertOcg(FLCard toAdd) {

        if (root == null)
            root = new FLCardNode(toAdd);
        else
            recursiveAddOcg(root, toAdd);

    }

    public void recursiveAdd(FLCardNode currentNode, FLCard insertedCard) {

        if (insertedCard.compareTCG(currentNode.value) == -1) {
            if (currentNode.left == null)
                currentNode.left = new FLCardNode(insertedCard);
            else
                recursiveAdd(currentNode.left, insertedCard);
        }
        else if (currentNode.right == null)
            currentNode.right = new FLCardNode(insertedCard);
        else
            recursiveAdd(currentNode.right, insertedCard);

    }

    public void recursiveAddOcg(FLCardNode currentNode, FLCard insertedCard) {

        
    
    }

    public void printTree() {
     
        printInOrder(root);

    }
    public void printInOrder(FLCardNode current) {

        if (current != null) {
            printInOrder(current.right);
            System.out.println(current);
            printInOrder(current.left);
        }

    }


}

