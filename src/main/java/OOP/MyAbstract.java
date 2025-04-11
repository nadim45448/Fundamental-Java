package OOP;

public class MyAbstract {
    public static void main(String[] args) {
        Food rice = new Rice();
        rice.cookFood();

        Food biscuit = new Biscuit();
        biscuit.cookFood();
    }
}
abstract class Food{
    abstract void cookFood();

}

class Rice extends Food {
    @Override
    public void cookFood(){
        System.out.println("rice is cooking");
    }
}

class Biscuit extends Food{

    @Override
    void cookFood() {
        System.out.println("biscuit is not needed to cook");
    }
}
