package GeneralUseCase;

class Welcome {
    void print(){
        System.out.println("Welcome");
    }
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
        Welcome w = new Welcome() ;
        w.print();
    }
}
