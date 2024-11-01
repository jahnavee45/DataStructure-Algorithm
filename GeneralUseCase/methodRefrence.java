package GeneralUseCase;

interface Welcome {
    void print();
}

class HelloWorld{
    void printHello(){
        System.out.println("Hello World!");
    }
}
class methodRefrence {
     public static void main(String args[])
    {
        int a = 5;
        Welcome w = HelloWorld::printHello();
        w.print();
    }
}
