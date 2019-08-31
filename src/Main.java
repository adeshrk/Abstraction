/**
 * Created by Adesh on 31-08-2019
 */

public class Main{
    public static void main(String[] args) {
        MyLinkedList lis = new MyLinkedList();
        String data = "5 7 3 9 8 2 1 0 4 6";
        String[] s = data.split(" ");

        for(String n : s){
            lis.addItem(new Node(n));
        }

        lis.traverse(lis.getroot());
        lis.removeItem(new Node("3"));
        lis.traverse(lis.getroot());

        lis.removeItem(new Node("5"));
        lis.traverse(lis.getroot());

        lis.removeItem(new Node("0"));
        lis.removeItem(new Node("4"));
        lis.removeItem(new Node("2"));
        lis.traverse(lis.getroot());

        lis.removeItem(new Node("9"));
        lis.traverse(lis.getroot());
        lis.removeItem(new Node("8"));
        lis.traverse(lis.getroot());
        lis.removeItem(new Node("6"));
        lis.traverse(lis.getroot());
        lis.removeItem(lis.getroot());
        lis.traverse(lis.getroot());
        lis.removeItem(lis.getroot());
        lis.traverse(lis.getroot());
    }


}
