import java.sql.*;
class DBConnection{
        Connection connection;
        PreparedStatement ps;
        ResultSet rs;
    DBConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded Successfully");

            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.9.150.16:1521/atmiyadb", "c##22mca22","m22");
            System.out.println("Connection Established");
        }
        catch(Exception e){
            System.out.println("Driver Failed to Load");
        }
    }

    public void insert(int id, String name, int salary, String city, long contact) throws Exception{
        ps = connection.prepareStatement("INSERT INTO EMPLOYEE(EMP_ID,EMP_NAME,SALARY, CITY, CONTACT) VALUES(?,?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, salary);
        ps.setString(4, city);
        ps.setLong(5, contact);
        ps.executeUpdate();
    }

    public void display() throws Exception{
        ps = connection.prepareStatement("SELECT * FROM EMPLOYEE");
        rs = ps.executeQuery();

        System.out.printf("%s %15s %15s %20s %20s", "EMP_ID" ,"EMP_NAME" ,"SALARY" ,"CITY" ,"CONTACT" );
        System.out.println("\n----------------------------------------------------------------------------------");

        while(rs.next()){
            System.out.printf("%s %15s %20s %20s %20s",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            System.out.println();
        }
    }

    public void update(int id, String name, int salary, String city, long contact) throws Exception{
        ps = connection.prepareStatement("UPDATE EMPLOYEE SET EMP_NAME = ?, SALARY = ?, CITY = ?, CONTACT = ? WHERE EMP_ID = ?");
        ps.setString(1, name);
        ps.setInt(2, salary);
        ps.setString(3, city);
        ps.setLong(4, contact);
        ps.setInt(5,id);
        ps.executeUpdate();
    }

    public void delete(int id) throws Exception{
        ps = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EMP_ID = ?");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public void sortByName() throws Exception{
        ps = connection.prepareStatement("SELECT * FROM EMPLOYEE ORDER BY EMP_NAME");
        rs = ps.executeQuery();

        System.out.printf("%s %15s %15s %20s %20s", "EMP_ID" ,"EMP_NAME" ,"SALARY" ,"CITY" ,"CONTACT" );
            System.out.println("Sorting records by Employee Name : \n");
        System.out.println("\n----------------------------------------------------------------------------------");

        while(rs.next()){
            System.out.printf("%s %15s %20s %20s %20s",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            System.out.println();
        }
    }

    public void searchById(int id) throws Exception{
        ps = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMP_ID = ?");
        ps.setInt(1,id);
        rs = ps.executeQuery();
        System.out.printf("%s %15s %15s %20s %20s", "EMP_ID" ,"EMP_NAME" ,"SALARY" ,"CITY" ,"CONTACT" );
        System.out.println("\n----------------------------------------------------------------------------------");

        while(rs.next()){
            System.out.printf("%s %15s %20s %20s %20s",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            System.out.println();
        }
    }

    public void searchByName(String name) throws Exception{
        ps = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMP_NAME = ?");
        ps.setString(1,name);
        rs = ps.executeQuery();

        System.out.printf("%s %15s %15s %20s %20s", "EMP_ID" ,"EMP_NAME" ,"SALARY" ,"CITY" ,"CONTACT" );
        System.out.println("\n----------------------------------------------------------------------------------");

            if(rs.next()){
                do{
                    System.out.printf("%s %15s %20s %20s %20s",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                    System.out.println();
                }while(rs.next());
            }
            else{
                System.out.println("Record Does Not Exist");
            }
    }

    public void close() throws Exception{
        connection.close();
    }
}
