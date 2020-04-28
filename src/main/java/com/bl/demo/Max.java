package com.bl.demo;

public class Max {

    public int getMaximum(int[] intArray){
        int max=intArray[0];
        for(int element=1;element<intArray.length;element++){
            max=Math.max(max,intArray[element]);
        }
        return max;
    }

    public float getMaximum(float[] floatArray){
        float max = 0;
        for(int element=1;element<floatArray.length;element++){
            max=Math.max(max,floatArray[element]);
        }
        return max;

    }

}
