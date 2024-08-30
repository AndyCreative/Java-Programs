class Student{
    String sName;
    int total_marks;
    int total_subject;

    void setStudent(String name, int marks, int subjects){
        sName = name;
        total_marks = marks;
        total_subject = subjects;
    }

    double calculateAvg(){
        double avg = total_marks / total_subject;
        return avg;
    }
}
class StudentDemo4{
    public static void main(String[] args) {
        Student ram = new Student();
        ram.setStudent("Raam Mehta",550,6);
        System.out.println("\nStudent 1 :");
        System.out.println("Student Name : " + ram.sName + "\nTotal Marks :  " + ram.total_marks + "\nTotal Subjects : " + ram.total_subject);
        double avg= ram.calculateAvg();
        System.out.println("Average :" + avg);

        Student laxman = new Student();
        laxman.setStudent("Laxman Mehta",480,6);
        System.out.println("\nStudent 2 :");
        System.out.println("Student Name : " + laxman.sName + "\nTotal Marks :  " + laxman.total_marks +"\nTotal Subjects : " + laxman.total_subject);
        System.out.println("Average :" + laxman.calculateAvg());
    }
}
