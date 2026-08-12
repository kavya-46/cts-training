package com.inheritence;

public class Add {
    int a = 15,b=10;
    void add() {
        System.out.println(a+b);
    }

}
class Sub extends Add{
    void Sub() {
        System.out.println(a-b);
    }
}
class Mul extends Sub{
    void Mul() {
        System.out.println(a*b);
    }
}
class Div extends Mul {
    void Div() {
        System.out.println(a/b);
    }
}

class Inheritence {
    public static void main(String[] args) {
Div d = new Div();
d.add();
d.Sub();
d.Mul();
d.Div();
    }
}