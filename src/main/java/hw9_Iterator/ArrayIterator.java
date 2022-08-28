package hw9_Iterator;

import java.util.Iterator;

public class ArrayIterator<String> implements Iterator {

    private int index = 0;
    private String[] var = null;

    public ArrayIterator(String[] array) {
        var = array;
    }

    @Override
    public boolean hasNext() {
        return var.length > index;
    }

    @Override
    public String next() {
        return var[index++];
    }

}

