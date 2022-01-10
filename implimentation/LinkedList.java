package implimentation;

public class LinkedList {

    Node1 head;

    //this add method will add at the end 
    public void add(int i) {

        //creation of new node and assigning new value 
        Node1 new_node = new Node1();
        new_node.data = i;
        new_node.next = null;

        //check for the existing node in list
        if(head == null){
            head = new_node;

        }else{ // the list is not empty 
            Node1 n = head;//will create the node and assign head 

            while(n.next!= null){
                n = n.next;
            }

            n.next = new_node;
            
        }
    }


    //inserting an element at start of the list
    public void insertAtStart(int data){

        //create new node and assign that node to head

        Node1 new_node = new Node1();
        new_node.data = data;
      //  new_node.next = null;

        new_node.next = head;
        head = new_node;


    }

    //inserting an element at particular index
    public void insertAt(int index, int data){
        Node1 new_node = new Node1();
        new_node.data = data;
        new_node.next = null;

        if(index == 0){
            insertAtStart(data);
        }else{
        Node1 n = head;
        for(int i=0; i<index-1; i++){

            n = n.next;
        }
        new_node.next=n.next;
        n.next = new_node;
    }
    }

    //to delete the element at index
    public void deleteAt(int index){

        if(index==0){
            head = head.next;
        }else{

            Node1 n = head;
            Node1 n1 = null;
            for(int i=0; i<index-1;i++){
                n=n.next;
            }

            n1 = n.next;//which is need to be deletd(reff)
            n.next =n1.next;

        }
    }

    //to print all the elements 

    public void show(){
        Node1 n = head;
        while(n.next!= null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println(n.data);

    }
     

}
