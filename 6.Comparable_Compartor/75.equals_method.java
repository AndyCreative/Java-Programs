class Student{
    int marks;
    Student(int marks){
        this.marks = marks;
    }

    public boolean equals(Object o){
        if(!(o instanceof Student))
            return false;
        if(this.marks != ((Student)o).marks){   //Casting , Here o is a object and Student is given value to the a
            return false;
        }    
        return true;
    }
}

class StudentDemo{
    public static void main(String[] args) {
            // int i = 120, j = 121;
            // System.out.println(i == j);
        Student Raam = new Student(150);
        Student Laxman = new Student(150);

        System.out.println(Raam == Laxman);
        System.out.println(Raam.equals(Laxman));
    }
}
