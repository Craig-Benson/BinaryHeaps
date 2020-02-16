package com.company;

public class delMax<Key> {

    public Key delMax(){

        Key max = pq[1];
        exch(1,N--);
        sink(1);
        pq[N=1] = null;
        return max;

    }

}
