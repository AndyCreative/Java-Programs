class Student{
    String sName;
    int total_marks;
    int total_subject;

    Student(){      //Default Constructor
        sName = "Siya Mehta";
        total_marks = 500;
        total_subject = 6;
    }

    Student(String sName, int total_marks, int total_subject){ 	//Parameterized Constructor
        this.sName = sName;
        this.total_marks = total_marks;
        this.total_subject = total_subject;
    }

    void setStudent(String sName, int total_marks, int total_subject){
        this.sName = sName;
        this.total_marks = total_marks;
        this.total_subject = total_subject;
    }

    double calculateAvg(){
        double avg = total_marks / total_subject;
        return avg;
    }
}

class StudentDemo7{
    public static void main(String[] args) {
        Student siya = new Student();
        System.out.println("\nStudent 1 :");
        System.out.println("Student Name : " + siya.sName + "\nTotal Marks :  " + siya.total_marks + "\nTotal Subjects : " + siya.total_subject);
        double avg= siya.calculateAvg();
        System.out.println("Average :" + avg);

        Student ram = new Student("Raam Mehta", 550,6);
        System.out.println("\nStudent 2 :");
        System.out.println("Student Name : " + ram.sName + "\nTotal Marks :  " + ram.total_marks + "\nTotal Subjects : " + ram.total_subject);
        avg= ram.calculateAvg();
        System.out.println("Average :" + avg);

        Student laxman = new Student("Laxman Mehta",480,6);
        System.out.println("\nStudent 3 :");
        System.out.println("Student Name : " + laxman.sName + "\nTotal Marks :  " + laxman.total_marks +"\nTotal Subjects : " + laxman.total_subject);
        System.out.println("Average :" + laxman.calculateAvg());

        laxman.setStudent("Bharat Mehta", 450,6);
         System.out.println("\nStudent 4 :");
        System.out.println("Student Name : " + laxman.sName + "\nTotal Marks :  " + laxman.total_marks +"\nTotal Subjects : " + laxman.total_subject);
        System.out.println("Average :" + laxman.calculateAvg());
    }
}
