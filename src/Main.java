import com.collection.Queue;
import com.list.MyArrayList;
import com.list.MyLinkedList;
import com.map.MyHashMap;
import com.queue.MyQueue;
import com.stack.MyStack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Test MyArrayList\n");
        MyArrayList<String> myArrayList = new MyArrayList<>("1d0fbf");
        myArrayList.add("2dsg");
        myArrayList.add("3fgbfg");
        myArrayList.add("4dfbdf");
        myArrayList.add("5yukyukuy");
        myArrayList.add("6luiuilui");
        myArrayList.add("7luiuilui");
        myArrayList.add("8luiuilui");
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        myArrayList.remove(myArrayList.size() - 1);
        System.out.println(myArrayList);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        System.out.println("Test get(2): " + myArrayList.get(2));

        System.out.println("Test MyLinkedList\n");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>("1d0fbf");
        myLinkedList.add("2dsg");
        myLinkedList.add("3fgbfg");
        myLinkedList.add("4dfbdf");
        myLinkedList.add("5yukyukuy");
        myLinkedList.add("6luiuilui");
        myLinkedList.add("7luiuilui");
        myLinkedList.add("8luiuilui");
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(myLinkedList.size() - 1);
        System.out.println(myLinkedList);
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
        System.out.println("Test get(2): " + myLinkedList.get(2));

        System.out.println("\n\nTest MyQueue\n");
        Queue<String> myQueue = new MyQueue<>("1d0fbf");
        myQueue.add("2dsg");
        myQueue.add("3fgbfg");
        myQueue.add("4dfbdf");
        myQueue.add("5yukyukuy");
        myQueue.add("6luiuilui");
        myQueue.add("7luiuilui");
        myQueue.add("8luiuilui");
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println(myQueue);
        myQueue.remove(3);
        System.out.println(myQueue);
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println(myQueue);

        System.out.println("\n\nTest MyStack\n");
        MyStack<String> myStack = new MyStack<>("1d0fbf");
        myStack.add("2dsg");
        myStack.add("3fgbfg");
        myStack.add("4dfbdf");
        myStack.add("5yukyukuy");
        myStack.add("6luiuilui");
        myStack.add("7luiuilui");
        myStack.add("8luiuilui");
        System.out.println("myStack = " + myStack);
        System.out.println(myStack);
        myStack.remove(3);
        System.out.println(myStack);
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.poll() = " + myStack.pop());
        System.out.println(myStack);

        System.out.println("\n\nTest MyHashMap\n");
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>(1, "1d0fbf");
        myHashMap.put(2,"2dsg");
        myHashMap.put(3,"3fgbfg");
        myHashMap.put(4,"4dfbdf");
        myHashMap.put(5,"5yukyukuy");
        myHashMap.put(6,"6luiuilui");
        myHashMap.put(6,"rhrhrhrh");
        myHashMap.put(7,"7luiuilui");
        myHashMap.put(8,"8luiuilui");
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println(myHashMap);
        myHashMap.remove(3);
        System.out.println(myHashMap);
        System.out.println("myHashMap.get(5) = " + myHashMap.get(5));

    }
}