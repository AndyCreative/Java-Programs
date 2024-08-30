class Student{
    String name;
    int total_marks;
    int total_subject;
    double calculateAvg(){
        double avg = total_marks / total_subject;
        return avg;
    }
}

class StudentDemo3{
    public static void main(String[] args) {
        Student ram = new Student();
        ram.name = "Ram Mehta";
        ram.total_marks = 555;
        ram.total_subject = 6;
        System.out.println("\nStudent 1 :");
        System.out.println("Student Name : " + ram.name + "\nTotal Marks :  " + ram.total_marks + "\nTotal Subjects : " + ram.total_subject);
        double avg= ram.calculateAvg();
        System.out.println("Average :" + avg);

        Student laxman = new Student();
        laxman.name = "Laxman Mehta";
        laxman.total_marks = 495;
        laxman.total_subject = 6;
        System.out.println("\nStudent 2 :");
        System.out.println("Student Name : " + laxman.name + "\nTotal Marks :  " + laxman.total_marks +"\nTotal Subjects : " + laxman.total_subject);
        System.out.println("Average :" + laxman.calculateAvg());
    }
}
