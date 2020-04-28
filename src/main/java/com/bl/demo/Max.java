package com.bl.demo;

public class Max<T extends Comparable> {
    T firstVariable;
    T secondVariable;
    T thirdVariable;
    T[] array;

    Max(T firstVariable, T secondVariable ,T thirdVariable){
        this.firstVariable=firstVariable;
        this.secondVariable=secondVariable;
        this.thirdVariable=thirdVariable;
    }

    Max(T[] array){
        this.array=array;
    }

    public T getMaximum (){
            T max = array[0];
        for(int arrayElement=1;arrayElement<array.length;arrayElement++){
            if(array[arrayElement].compareTo(max)>0)
                max=array[arrayElement];
        }
        return max;
    }

    public T getMax(){
        if(firstVariable.compareTo(secondVariable)>0&&firstVariable.compareTo(thirdVariable)>0)
            return this.firstVariable;
        else if(secondVariable.compareTo(firstVariable)>0&&secondVariable.compareTo(thirdVariable)>0)
            return secondVariable;
        else if(thirdVariable.compareTo(firstVariable)>0&&thirdVariable.compareTo(secondVariable)>0)
            return thirdVariable;
        return null;
    }

}
