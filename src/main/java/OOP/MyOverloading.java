package OOP;

public class MyOverloading {
    public static void calculateSalary(int workingHour, int salaryPerHour){
        System.out.println(workingHour * salaryPerHour);

    }

    public static void calculateSalary(int workingHour, int salaryPerHour, int overtime){
        System.out.println((workingHour * salaryPerHour) + (salaryPerHour * overtime));

    }

    public static void main(String[] args) {
        calculateSalary(5, 200);
        calculateSalary(7, 200, 2);

//         if we do not use static keyword we have to create obj
//         Myoverloading salary = new Myoverloading();
//        salary.calculateSalary();
    }
}
