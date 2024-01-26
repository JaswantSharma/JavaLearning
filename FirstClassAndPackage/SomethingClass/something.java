package SomethingClass;

//package bnana seekh raha tha
public class something {
    public int num1;
    public int num2;

    public something(){
        num1 = 0;
        num2 = 0;
    }
    public int multiple(int a , int b){
        return a*b;
    }

    public void getMembers(){
        System.out.println("these are the members " + num1 + " and " + num2);
    }

    public void setMembers(int a, int b){
        num1 = a;
        num2 = b;
    }

}
