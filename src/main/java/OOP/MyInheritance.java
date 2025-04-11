package OOP;

public class MyInheritance {
    public static void main(String[] args) {
//        Bird eagle = new Bird();
//        eagle.canFly();

//        Eagle eagle = new Eagle();
//        eagle.canFly();

//        Bird eagle = new Eagle();
//        eagle.canFly();

        // not override
//        Penguin penguin = new Penguin();
//        penguin.canFly();

        // override
        Bird penguin = new Penguin();
        penguin.canFly();
    }
}

class Bird{
    public void canFly(){
        System.out.println("Birds can fly");
    }
}
class Eagle extends Bird{
    // canFly()
}

class Penguin extends Bird{
    // canFly() : from Bird class
    public void canFly(){
        // method override
        System.out.println("Penguin cannot fly");
    }
}
