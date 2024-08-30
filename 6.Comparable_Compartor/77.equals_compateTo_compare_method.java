class Student{
    int marks;
    Student(){}

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
    public int compareTo(Object o){
        return this.marks - ((Student)o).marks;
    }

    public int compare(Object o1, Object o2){
        return ((Student)o1).marks - ((Student)o2).marks;
    }
}


class StudentDemo{
    public static void main(String[] args) {
            // int i = 120, j = 121;
            // System.out.println(i == j);

        Student Raam = new Student(150);
        Student Laxman = new Student(160);

        System.out.println("== : " + (Raam == Laxman));
        System.out.println("equals method : " + Raam.equals(Laxman));
        System.out.println("compareTo method : " + Raam.compareTo(Laxman));
        System.out.println("compareTo method : " + Laxman.compareTo(Raam));

        Student Bharat = new Student();
        System.out.println("compare method : " +
Bharat.compare(Raam,Laxman));
    }
}
