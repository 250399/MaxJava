package com.bl.demo;

public class Max {

    public int getMaximum(int[] intArray){
        int max=intArray[0];
        for(int element=1;element<intArray.length;element++){
            max=Math.max(max,intArray[element]);
        }
        return max;
    }

}
