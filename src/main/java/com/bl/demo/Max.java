package com.bl.demo;

public class Max {

    public <T extends Comparable> T getMaximum(T[] array){
        T max=array[0];
        for(int arrayElement=1;arrayElement<array.length;arrayElement++){
            if(array[arrayElement].compareTo(max)>0)
                max=array[arrayElement];
        }
        return max;
    }

}
