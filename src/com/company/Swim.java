package com.company;

public class Swim {

    private void swim(int k){

        while(k > 1 && less(k/2 , 2)){
            exch(k, k/2);
            k = k / 2;
        }
    }
}
