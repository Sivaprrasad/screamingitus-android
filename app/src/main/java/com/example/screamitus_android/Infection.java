package com.example.screamitus_android;

public class Infection {

    int numInfected;

    public int calculateTotalInfected(int days){
        if (days<=0){
            return -1;
        }
        else if(days>0){
            numInfected = days*5;
        }

        return numInfected;

        if(days > 7)
        {

        }

    }

}
