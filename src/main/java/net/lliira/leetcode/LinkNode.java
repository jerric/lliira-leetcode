package net.lliira.leetcode;

/**
 * Created by Jerric on 1/17/2017.
 */
public class LinkNode<T> {
    T value;
    LinkNode<T> next;

    public LinkNode(T value, final LinkNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
