class Student{
    String name;
    int total_marks;
    int total_subject;
    void calculateAvg(){
        double avg;
        avg = total_marks / total_subject;
        System.out.println("Average : " + avg);
    }
}

class StudentDemo2{
    public static void main(String[] args) {
        Student ram = new Student();
        ram.name = "Ram Mehta";
        ram.total_marks = 555;
        ram.total_subject = 6;
        System.out.println("\nStudent 1 :");
        System.out.println("Student Name : " + ram.name + "\nTotal Marks :  " + ram.total_marks + "\nTotal Subjects : " + ram.total_subject);
        ram.calculateAvg();


        Student laxman = new Student();
        laxman.name = "Laxman Mehta";
        laxman.total_marks = 495;
        laxman.total_subject = 6;
        System.out.println("\nStudent 2 :");
        System.out.println("Student Name : " + laxman.name + "\nTotal Marks :  " + laxman.total_marks +"\nTotal Subjects : " + laxman.total_subject);
        laxman.calculateAvg();
    }
}
