import java.io.*;
class CricketerJdbcDemo{
    public static void main(String[] args) throws Exception{
        DBConnection con = new DBConnection();
        int choice = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        do{
            System.out.println();
            System.out.println("0. Exit");
            System.out.println("1. Insert");
            System.out.println("2. Display All");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Sort By Name");
            System.out.println("6. Sort By Score");
            System.out.println("7. Search By Name");
            System.out.println("8. Search By Score");
            System.out.print("Enter your choice : ");
            choice = Integer.parseInt(br.readLine());
           
            switch(choice){
                case 1:
                    System.out.print("Enter the ccode : ");
                    int ccode = Integer.parseInt(br.readLine());

                    System.out.print("Enter the cname : ");
                    String cname = br.readLine();

                    System.out.print("Enter the score : ");
                    int score = Integer.parseInt(br.readLine());

                    con.insert(ccode,cname,score);
                    break;
                case 2:
                    con.display();
                    break;
                case 3:
                    System.out.print("Enter the ccode : ");
                    ccode = Integer.parseInt(br.readLine());

                    System.out.print("Enter the cname : ");
                    cname = br.readLine();

                    System.out.print("Enter the score : ");
                    score = Integer.parseInt(br.readLine());

                    con.update(ccode,cname,score);
                    break;
                case 4:
                    System.out.print("Enter the ccode : ");
                    ccode = Integer.parseInt(br.readLine());

                    con.delete(ccode);
                    break;
                case 5:
                    con.sortByName();
                    break;
                case 6:
                    con.sortByScore();
                    break;
                case 7:
                    System.out.print("Enter the cname for search : ");
                    cname = br.readLine();

                    con.searchByName(cname);
                    break;
                case 8:
                    System.out.print("Enter the score for search : ");
                    score = Integer.parseInt(br.readLine());

                    con.searchByScore(score);
                    break;
                case 0:
                    con.close();
                    System.out.println("Connection closed successfully");
                    System.out.println("Thank You!!");
            }
        }while(choice != 0);
    }
}