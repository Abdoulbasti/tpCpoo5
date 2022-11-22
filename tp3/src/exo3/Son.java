package exo3;


public class Son extends Dad {
    public static void f(A a, A aa) {
        System.out.println("Son : A : A");
    }

    public static void f(C c, A a) {
        System.out.println("Son : C : A");
    }
    public static void main(String[] args) {
        f(new B(), new A());
        f(new D(), new A());
        f(new B(), new D());
        f(new A(), new C());

        /*
        Question 3
        f(new C(), new C());
        f(new C(), new B());*/
    }
}