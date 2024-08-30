class Employee{
    final static String CricketBoard = "India";   // Class Variable

    int empNo;  // Instance Variable
    String empName; // Instance Variable
    int empSal; // Instance Variable
}
class EmployeeDemo3{
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.empNo = 101;
        e1.empName = "Virat";
        e1.empSal = 50000;

        System.out.println("Employee ID : " + e1.empNo + "\nEmployee Name : " + e1.empName + "\nEmployee Salary : " + e1.empSal + "\n" + Employee.CricketBoard);
    }
}
