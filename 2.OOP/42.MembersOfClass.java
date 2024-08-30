class Employee{
    final static String CricketBoard = "India";   // Class Variable
    int empNo;  // Instance Variable
    String empName; // Instance Variable
    int empSal; // Instance Variable

    Employee(){
        System.out.println("Default Constructor Called");
    }
    Employee(int empNo, String empName, int empSal){
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }
    static void display(){      // Class Method , Static Method
        System.out.println(CricketBoard);
    }
    void showEmployee(){    //Method , Non-static Method
        System.out.println("Employee ID : " + empNo + "\nEmployee Name : " + empName + "\nEmployee Salary : " + empSal);    
    }

    static{     // Class Initializer Block
        System.out.println("Class Initializer Block will be called only once whenever class is loaded");
    }

    {   // Initializer Block
        System.out.println("Initializer Block will be executed everytime just before constructor is called");
    }
}

class EmployeeDemo4 {
    public static void main(String[] args) {
        Employee.display();
        System.out.println("Employee : 1");
        Employee e1 = new Employee(101,"Virat",100000);
        e1.showEmployee();
       
        System.out.println("\nEmployee : 2");
        Employee e2 = new Employee(102,"M S Dhoni",150000);
        e2.showEmployee();

        Employee e3 = new Employee();
    }
}
