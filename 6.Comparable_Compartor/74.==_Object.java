class Student{
    int marks;
    Student(int marks){
        this.marks = marks;
    }
}

class StudentDemo{
    public static void main(String[] args) {
            // int i = 120, j = 121;
            // System.out.println(i == j);

        Student Raam = new Student(150);
        Student Laxman = new Student(150);

        System.out.println(Raam == Laxman);
    }
}
