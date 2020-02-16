package com.company;

public class Insert<Key> {

    public void  insert(Key x){
        pq[++N] = x;
        swim(N);
    }
}
