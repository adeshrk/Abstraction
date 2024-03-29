/**
 * Created by Adesh on 31-08-2019
 */

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem prev() {
        return this.leftLink;
    }

    @Override
    ListItem setPrev(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return (((String) super.getValue()).compareTo((String) item.getValue()));
        }
        return -1;
    }
}
