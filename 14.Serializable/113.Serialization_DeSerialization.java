import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Employee implements Serializable{
    int empId;
    String name;
    int salary;
    Employee(){}

    Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return empId + " " + name + " " + salary;
    }
}

class SerializableDemo{
    public static void main(String[] args) throws Exception{
        Employee e1 = new Employee(101, "Happy", 50000);
        Employee e2 = new Employee(102, "Richa", 60000);
        Employee e3 = new Employee(103, "Janki", 50000);

        // Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(args[0]));
        oos.writeObject(e1);
        oos.writeObject(e2);
        oos.writeObject(e3);
        oos.flush();
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(args[0]));
        Employee e4 = (Employee) ois.readObject();
        Employee e5 = (Employee) ois.readObject();
        Employee e6 = (Employee) ois.readObject();
       
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
    }
}
