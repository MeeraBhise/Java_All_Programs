package AbstractionPractise;
 //abstract  => child class must provide implementation
    public interface B21{
        int a = 100;
        abstract int show();
        boolean showTrue();
    }

    abstract class BBBB{
        public int a = 100;
        protected abstract int show();
    }
     class TestInterfaceProgram {
        //whatever final, you can not change it's value
        //pi = 3.144
        static int nonFinal = 100;
        static final int finaVariable = 200;

        public static void main(String[] args) {
            nonFinal = 300;
          //  finaVariable = 400;
            nonFinal = 700;
        }

    }
