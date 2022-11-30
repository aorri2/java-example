package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyListImpl<T> implements MyList<T> {
    private final List<T> innerList;

    public MyListImpl() {
        this.innerList = new ArrayList<>();
    }
    @Override
    public void addAll(Collection<T> collection) {
        innerList.addAll(collection);
    }
}
