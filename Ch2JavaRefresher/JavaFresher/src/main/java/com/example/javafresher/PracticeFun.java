package com.example.javafresher;

public class PracticeFun {
    public static float average(int a,int b, int c){
        float avg=0f;
        avg = (a+b+c)/3f;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(13,2,43));
        Harry h1 = new Harry();
        h1.meth1();
        HarryPotter hp1 = new HarryPotter();
        hp1.meth1();
        hp1.spells();

    }
}
class Harry{
    public void meth1(){
        System.out.println("HarryWalker");
    }
}
class HarryPotter extends  Harry{
    @Override
    public void meth1(){
        System.out.println("HARRY POTTAAH");
    }
    public void spells(){
        System.out.println("I am the boy who lived");
    }
}
