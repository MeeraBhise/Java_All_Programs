package AbstractionPractise;
public class test extends test1 {
    void method()
    {
        System.out.println("normal method");
    }
    @Override
        void method2()
    {
        System.out.println("abstract method");
    }
    @Override
    void method3()
    {
        System.out.println("abstract method2");
    }

    public static void main(String[] args) {
        System.out.println("java main method");
        test t=new test();
        t.method2();
        t.method3();
        t.method();
    }
}
