package main;
import structures.*;

public class main {
    public static void main(String[] args){
        doubleLinkedList<Integer> ll = new doubleLinkedList(3);
        ll.append(2);
        ll.append(1);
        ll.append(0);
        ll.deleteK(1);
        ll.print();
        System.out.println(ll.getLast());

        System.out.println("------------- STACK --------------");

        Stack<Integer> sta = new Stack<Integer>();
        sta.push(4);
        sta.push(3);
        sta.push(2);
        sta.push(1);
        sta.push(0);
        sta.print();
        sta.pop();
        System.out.print("pop: ");
        System.out.println(sta.top());
        System.out.println(sta.size());
    }
}
