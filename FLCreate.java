public class FLCreate {

    public static void main (String[] args) {


        FLCardTree tcgTree = new FLCardTree();
        tcgTree.insert(new FLCard("Test",new FLDate(1,2,12),new FLDate(99,99,99)));    
        // Define variables
        tcgTree.insert(new FLCard("Test",new FLDate(1,2,11),new FLDate(99,99,99)));    
        tcgTree.insert(new FLCard("Test",new FLDate(1,23,12),new FLDate(99,99,99)));    
        tcgTree.insert(new FLCard("Test",new FLDate(2,2,13),new FLDate(99,99,99)));    
        tcgTree.printTree();

        // Load card list


        // Set up current F&L List
 

        // Set up past lists until EOF


    }

}
