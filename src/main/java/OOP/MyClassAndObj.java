package OOP;

public class MyClassAndObj {
    public static void main(String[] args) {
        // class and object
        Teacher teacher = new Teacher("nadim", 0122222222);
//        teacher.name="nadim";
//        teacher.phone = 0122222222;

//        System.out.println("name: "+ " "+ teacher.name);
//        System.out.println("phone: "+ " "+ teacher.phone);
//        teacher.setInfo("nadim", 01222222200);
        teacher.display();

//        Fruits fruits = new Fruits();
//        fruits.name="Apple";

    }
}
class Teacher{
    String name;
    int phone;
    Teacher(String n, int p){
        name = n;
        phone = p;
    }
    void display(){
        System.out.println("name: "+ " "+ name);
        System.out.println("phone: "+ " "+ phone);
    }
//    void setInfo(String name, int phone){
//        this.name= name;
//       this.phone = phone;
//
//    }
}

class Fruits{
    String name;
}