class Employee{
    private int empNo;
    private String empName;
    private int empSal;

    Employee(){
        empNo = 101;
        empName = "Raam";
        empSal = 50000;
    }
}

class EmployeeDemo1{
    public static void main(String[] args){
        Employee e1 = new Employee();
        System.out.println("\nEmployee : 1");
        System.out.println("Employee No : " + e1.empNo + "\nEmployee Name :  " + e1.empName + "\nEmployee Salary : " + e1.empSal);

        e1.empNo = 102;
        e1.empName = "Siya";
        e1.empSal = 55000;
        System.out.println("\nEmployee : 1");
        System.out.println("Employee No : " + e1.empNo + "\nEmployee Name :  " + e1.empName + "\nEmployee Salary : " + e1.empSal);
    }
}
