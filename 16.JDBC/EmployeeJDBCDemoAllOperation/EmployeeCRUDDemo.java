import java.io.*;
class EmployeeCrudDemo{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DBConnection con = new DBConnection();
        int choice = -1;
        do{
            System.out.println();
            System.out.println("0 - Exit");
            System.out.println("1 - Insert Record");
            System.out.println("2 - Display Record");
            System.out.println("3 - Update Record");
            System.out.println("4 - Delete Record");
            System.out.println("5 - Sorting Record");
            System.out.println("6 - Searching Record by Id");
            System.out.println("7 - Searching Record by Name");
            System.out.print("Enter your choice:");
            choice = Integer.parseInt(br.readLine());
           
            switch(choice){
                case 1:
                    System.out.print("Enter the employee id : ");
                    int id = Integer.parseInt(br.readLine());
           
                    System.out.print("Enter the employee name : ");
                    String name = br.readLine();


                    System.out.print("Enter the employee salary : ");
                    int salary = Integer.parseInt(br.readLine());


                    System.out.print("Enter the employee city : ");
                    String city = br.readLine();


                    System.out.print("Enter the employee contact : ");
                    Long contact = Long.parseLong(br.readLine());


                    con.insert(id,name,salary,city,contact);
                    break;
                case 2:
                    con.display();
                    break;
                case 3:
                    System.out.print("Enter the employee id to update : ");
                    id = Integer.parseInt(br.readLine());
           
                    System.out.print("Enter the employee name to update : ");
                    name = br.readLine();


                    System.out.print("Enter the employee salary to update : ");
                    salary = Integer.parseInt(br.readLine());


                    System.out.print("Enter the employee city to update : ");
                    city = br.readLine();


                    System.out.print("Enter the employee contact to update : ");
                    contact = Long.parseLong(br.readLine());
                   
                    con.update(id,name,salary,city,contact);
                    break;
                case 4:
                    System.out.print("Enter the employee id for delete the record : ");
                    id = Integer.parseInt(br.readLine());


                    con.delete(id);
                    break;
                case 5:
                    System.out.print("Select the column for sorting the records : ");
                    String sor = br.readLine();
                    if(sor.equals("name")){
                        con.sortByName();
                        break;
                    }
                    else{
                        con.display();
                        break;
                    }
                case 6:
                    System.out.print("Enter the employee id for searching the record : ");
                    id= Integer.parseInt(br.readLine());

                    con.searchById(id);
                    break;
                case 7:
                    System.out.println("Enter the employee name for searching the record :");
                    name = br.readLine();

                    con.searchByName(name);
                    break;
                case 0:
                    con.close();
                    break;
            }
        }
        while(choice != 0);
    }
}

