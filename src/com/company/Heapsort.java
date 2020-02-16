package com.company;

import java.util.Comparator;

public class Heapsort <Key extends Comparable<Key>>{

    private Key[] pq;
    private int N;

    public Heapsort(int capacity) {

        pq = (Key[]) new Comparable[capacity + 1];

    }

    public void sort(Comparable[] pq){
        int N = pq.length;
        for(int k = N/2; k>=1;k--){
            sink(pq,k,N);
        }

        while(N > 1){
            exch(pq, 1, N);
            sink(pq, 1, --N);
        }
    }



//    public void heapbuild(){
//        for(int k = N/2; k>=1; k--){
//            sink(a,k,N);
//        }
//
//    }
//
//    public void sortdown(){
//
//        while (N >1){
//
//            exch(a,1, N--);
//            sink(a,1, N);
//        }
//    }

    private void sink(Comparable[] pq, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(pq, j, j + 1)) {
                j++;
            }

            if (!less(pq,k, j)) {
                break;
            }
            exch(pq, k, j);
            k = j;
        }
    }

    private  boolean less(Comparable[] pq, int i, int j) {

        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(Comparable[] pq, int i, int j) {
        Key t = (Key) pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }
}
