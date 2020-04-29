    package com.bl.demo;

    public class Max<T extends Comparable> {
        T firstVariable;
        T secondVariable;
        T thirdVariable;
        T[] array;

        Max(){}

        Max(T firstVariable, T secondVariable ,T thirdVariable){
            this.firstVariable=firstVariable;
            this.secondVariable=secondVariable;
            this.thirdVariable=thirdVariable;
        }

        Max(T[] array){
            this.array=array;
        }

        public T getMaximum (){
                quickSort(0,array.length-1);
                return array[array.length-1];
        }

        public T getMax(){
            if(firstVariable.compareTo(secondVariable)>0&&firstVariable.compareTo(thirdVariable)>0)
                return printMax(firstVariable);
            else if(secondVariable.compareTo(firstVariable)>0&&secondVariable.compareTo(thirdVariable)>0)
                return printMax(secondVariable);
            else if(thirdVariable.compareTo(firstVariable)>0&&thirdVariable.compareTo(secondVariable)>0)
                return printMax(thirdVariable);
        return null;
        }

        public T getMax(T ...args){
            this.array=args;
            return getMaximum();
        }

        void quickSort(int left, int right){
            if(left<right){
                int pi = sort(left,right);
                quickSort(left,pi-1);
                quickSort(pi+1,right);
            }
        }

        int sort(int left,int right){
            int pIndex=right;
            T pi=array[right];
            for(int i = left ; i < right ; i++ ){
                if(pi.compareTo(array[i])<0){
                    T temp=array[pIndex];
                    array[pIndex]=array[i];
                    array[i]=temp;
                    pIndex++;
                }
            }
            array[right]=array[pIndex];
            array[pIndex]=pi;
            return pIndex;
        }

        T printMax(T max){
            return max;
        }

    }
