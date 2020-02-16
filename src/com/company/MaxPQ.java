package com.company;

public class MaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N;

    public MaxPQ(int capacity) {

        pq = (Key[]) new Comparable[capacity + 1];

    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(Key x) {
        pq[++N] = x;
        swim(N);
    }

    public Key delMax() {
        return null;
    }

    private void swim(int k) {
        while(k > 1 && less(k/2 , 2)){
            exch(k, k/2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) {
                j++;
            }

            if (!less(k, j)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }
    private boolean greater(int i, int j) {
        return pq[i].compareTo(pq[j]) > 0;
    }




}

