class Employee{
    private int empNo;
    private String empName;
    private int empSal;

    Employee(){
        empNo = 101;
        empName = "Raam";
        empSal = 50000;
    }

    Employee(int empNo, String empName, int empSal){
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }

    void setEname(String empName){
        this.empName = empName;
    }

    void showEmployee(){
        System.out.println("Employee No : " + empNo + "\nEmployee Name :  " + empName + "\nEmployee Salary : " + empSal);
    }
}

class EmployeeDemo2{
    public static void main(String[] args){
        Employee e1 = new Employee(101,"Raam",50000);
        System.out.println("\nEmployee : 1");
        e1.showEmployee();        

        e1.setEname("Laxman");
        System.out.println("\nEmployee : 2");
        e1.showEmployee();

        Employee e2 = new Employee(103,"Siya",65000);
        System.out.println("\nEmployee : 3");
        e2.showEmployee();
    }
}
