package AbstractionPractise;
//Why java does not support multiple inheritance?
//because of ambiguity   =>
//you have 2 parent classes which are having same method
//now compiler will get confused, which parent class method child class should use
//that is why in Java, 1 class can not extends more than 1 class
//there is a contract between interface and class, class should provide implementation to interface methods.
    //If you want to achieve multiple inheritance you can use interface
    public interface NNNN {
        void eat();  //declare
    }

    interface MMMM{
        void eat();
    }

    class MultipleInheritanceUisngInterface implements NNNN, MMMM{

        @Override
        public void eat()
        {
            System.out.println("Eat method implemented");
        }
    }

