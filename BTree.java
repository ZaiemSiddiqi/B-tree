import java.util.LinkedList;
import java.util.List;

public class BTree <T extends Comparable<T>> {
    // B+ tree order
    private int bTreeOrder;

    private Node root;
    private Node head;//head of the leaf node

    public BTree(){
        this.bTreeOrder = 4;
    }

    public BTree(int bTreeOrder){
        this.bTreeOrder = bTreeOrder;
    }

    public Node getRoot() {
        return root;
    }

    public Node getHead() {
        return head;
    }

    public void printLeaf(){
        while (head != null){
            System.out.print(head + "->");
            head = head.next;
        }
    }

    /**
     * tree node
     * @author Administrator
     *
     */
    private class Node<T>{
        // leaf node's linked list
        private Node pre;
        //parent node
        private Node parnet;
        // a list of element nodes inside a tree node
        private List<Element<T>> eles;
        // leaf node's linked list
        private Node next;
        public Node(){
            eles=new LinkedList<>();
        }
        public Node(Element ele){
            this();
            eles.add(ele);
        }
        public Node(List<Element<T>> eles){
            this.eles=new LinkedList<>();
            this.eles.addAll(eles);
        }
        @Override
        public String toString() {
            if(eles==null){
                return null;
            }
            StringBuilder sb=new StringBuilder();
            for(Element e:eles){
                sb.append(e.data).append(",");
            }
            return sb.toString();
        }
    }

    /**
     * Single Element Node
     * @param <T>
     */
    private class Element<T>{
        private T data;
        //left sub tree pointer
        private Node left;
        //right sub tree pointer
        private Node right;
        public Element(T data){
            this.data=data;
        }
        @Override
        public String toString() {
            return "Element data:" + data + ", left pointer =" + left + ", right pointer=" + right + "";
        }

    }

    public boolean add(T t){
      
      // write your code here
      return false;
    }
    
    
    public boolean find(T t){
    // write your code here
      return false;
    }
}

