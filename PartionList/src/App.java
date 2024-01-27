
public class App {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList(3);
        ll.append(7);
        ll.append(10);
        ll.append(12);
        ll.append(4);
        ll.append(1);

        System.out.println("LL before partitionList:");
        ll.printList(); 

        ll.partitionList(5);

        
        System.out.println("LL after partitionList:");
        ll.printList(); 
    }
}

