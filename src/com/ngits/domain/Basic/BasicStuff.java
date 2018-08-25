package com.ngits.domain.Basic;

public class BasicStuff {

    public void basicCommands(){

        for (int i=0;i<5;i++){
            System.out.println("Hello : " + i);
            basic1();
            basic2();
        }
    }

    private void basic1(){
        System.out.println("Hello : inside private method");
    }

    protected void basic2(){
        System.out.println("Hello : inside protected method");
    }


}
