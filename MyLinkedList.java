package com.labs;

public class MyLinkedList {
    Box firstBox;

    public void add(Object value){
        Box newBox = new Box();
        newBox.cent = value;
        newBox.nextAddress = null;

        if (firstBox == null){
            firstBox = newBox;
        } else {
            Box currentBox = firstBox;
            while(currentBox.nextAddress != null) {
                currentBox = currentBox.nextAddress;
            }
            currentBox.nextAddress = newBox;
        }
    }

    /*public void remove(int index) {
        Box currentBox = firstBox;
        Box previousBox = null;
        if (currentBox != null && currentBox.cent == index ){
            firstBox = currentBox.nextAddress;
            return;
        }
        while (currentBox != null && currentBox.cent != index){
            previousBox = currentBox;
            currentBox = currentBox.nextAddress;
        }
        if (currentBox == null)
            return;
        previousBox.nextAddress = currentBox.nextAddress;
    }*/

    public Object getNumber(int index) {
        Box currentBox = firstBox;
        for (int i = 0; i < index; i++){
            currentBox = currentBox.nextAddress;
        }
        return currentBox.cent;
    }

    public void printList()
    {
        Box list = firstBox;
        while (list != null)
        {
            System.out.print(list.cent+" ");
            list = list.nextAddress;
        }
    }

    private class Box {
        Object cent;
        Box nextAddress;
    }
}

