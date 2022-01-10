package implimentation;

public class Runner {
    
    public static void main(String[] args) {
        

        LinkedList llist = new LinkedList();
        
        llist.add(6);
        llist.add(7);
        llist.add(66);
        llist.insertAtStart(55);

        llist.insertAt(1, 100);
        llist.insertAt(0, 78);

        llist.deleteAt(4);

        llist.show();
    }
}
