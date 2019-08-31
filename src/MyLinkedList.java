/**
 * Created by Adesh on 31-08-2019
 */

public class MyLinkedList implements NodeList{
    private ListItem root = null;
    @Override
    public ListItem getroot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newitem) {
        if(this.root == null){
            this.root =newitem;
            return true;
        }
        ListItem currentitem =this.root;
        while (currentitem != null){
            int compare = currentitem.compareTo(newitem);
            if(compare<0){
                if(currentitem.next() != null){
                    currentitem = currentitem.next();
                }else{
                    currentitem.setNext(newitem).setPrev(currentitem);
                    return true;
                }
            }else if(compare>0){
                if (currentitem.prev() != null){
                    currentitem.prev().setNext(newitem).setPrev(currentitem.prev());
                    newitem.setNext(currentitem).setPrev(newitem);
                }else{
                    newitem.setNext(this.root).setPrev(newitem);
                    this.root = newitem;
                }
                return true;
            }else{
                System.out.println("Item already Exists");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.prev().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrev(currentItem.prev());
                    }
                }
                return true;
            } else if(comparison <0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
