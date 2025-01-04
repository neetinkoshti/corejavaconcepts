package org.example;

public class OverridingDemo {

    public static void main(String[] args) {

    }
}

class A {
    public A(){
    }
    void m1() throws Exception
    {
    }
}

class B extends A{
    public B() throws Exception {
        super();
        super.m1(); // this is allowed
//        this(""); // This is not allowed with Super() , cause only one explicit constructor calls allowed
          this.m1(); // this is allowed
        super.m1(); // this is allowed
    }

    public B(String s){
    }


    @Override
    void m1() throws Exception  // Child can throw same exception as parent or its sub class exception ,but not parent exception
    {
        this.m1();
        super.m1();
        this.m1();
    }
}
