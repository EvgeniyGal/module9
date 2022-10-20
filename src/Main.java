import com.list.MyArrayList;
import com.list.MyLinkedList;

public class Main {
    public static void main(String[] args) {

//      Test MyArrayList
        MyArrayList<String> myArrayList = new MyArrayList<>("1d0fbf");
        myArrayList.add("2dsg");
        myArrayList.add("3fgbfg");
        myArrayList.add("4dfbdf");
        myArrayList.add("5yukyukuy");
        myArrayList.add("6luiuilui");
        myArrayList.add("7luiuilui");
        myArrayList.add("8luiuilui");
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        myArrayList.remove(myArrayList.size() - 1);
        System.out.println(myArrayList);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        System.out.println("Test get(2): " + myArrayList.get(2));

//      Test MyLinkedList
        MyLinkedList<String> myLinkedList = new MyLinkedList<>("1d0fbf");
        myLinkedList.add("2dsg");
        myLinkedList.add("3fgbfg");
        myLinkedList.add("4dfbdf");
        myLinkedList.add("5yukyukuy");
        myLinkedList.add("6luiuilui");
        myLinkedList.add("7luiuilui");
        myLinkedList.add("8luiuilui");
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(myLinkedList.size() - 1);
        System.out.println(myLinkedList);
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
        System.out.println("Test get(2): " + myLinkedList.get(2));




    }
}