package com.dmdev.lesson18;

public class List1<T> {
    private T[] objects;

    private int size;
    public List1(int initialSize){
        this.objects=(T[]) new Object[initialSize];
    }
    public void add(T element){
        objects[size++]=element;
    }
    public T get(int index){
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
