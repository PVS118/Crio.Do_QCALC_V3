package com.crio.qcalc;

public class StandardCalculator {
    private int result;

    public void add(int num1,int num2){
        result = num1 +num2;
        setResult(result);
    }
    

    public void subtract(int num1,int num2){
        result = num1 -num2;
        setResult(result);
    }


    public void multiply(int num1,int num2){
       result = num1 *num2;
     setResult(result);
    }


    public void divide(int num1,int num2){
        result = num1 /num2;
        setResult(result);
    }

    public int getResult(){
        return result;
    }
    private void setResult(int value){
        this.result =value;
    }
    
    public void clearResult()
    {
        this.result = 0;
    }

    public void printResult()
    {
        System.out.println("Standarard Calculator Result:"+getResult());
    }
}













    




