package com.company;

import edu.princeton.cs.algs4.StdIn;

public class MinPQ<Transaction> {


    public static void main(String[] args) {

        MinPQ<Transaction> pq = new MinPQ<Transaction>();

        while(StdIn.hasNextLine()){
            String line =StdIn.readLine();
            Transaction item = new Transaction(line);

            pq.insert(item);

            if(pq.size()>M){
                pq.delMin();
            }
        }

    }
}
