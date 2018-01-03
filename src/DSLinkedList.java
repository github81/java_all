import java.io.*;
import java.util.*;


public class DSLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() {
            return element;
        }
        public void setElement(E e) {
            element =  e;
        }
        public void setNext(Node<E> new_node) {
            next = new_node;
        }

    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public DSLinkedList() { }
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public E first() {
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E last() {
        if(isEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E e) {
        head = new Node<>(e,head);
        if(size == 0) {
            tail = head;
            size++;
        }
    }
    public void addLast(E e) {
        Node newest = new Node<>(e,null);
        if(size == 0) {
            head = tail = newest;
        } else {
            tail.next = newest;
            tail = newest;
        }
        size++;
    }
    public static void main(String args[]) {


    }
}
