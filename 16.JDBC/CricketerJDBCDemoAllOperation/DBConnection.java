import java.sql.*;
class DBConnection{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DBConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded Successfully");




            con = DriverManager.getConnection("jdbc:oracle:thin:@10.9.150.16:1521/atmiyadb", "c##22mca22", "m22");
            System.out.println("Connection Established");
        }catch(Exception e){
            System.out.println("Driver Failed");
        }
    }
    public void insert(int ccode, String cname, int score) throws Exception{
        ps = con.prepareStatement("INSERT INTO CRICKETER (CCODE, CNAME, SCORE) VALUES(?, ?, ?)");
        ps.setInt(1,ccode);
        ps.setString(2, cname);
        ps.setInt(3, score);
        ps.executeUpdate();
    }


    public void display() throws Exception{
        ps = con.prepareStatement("SELECT * FROM CRICKETER");
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s %-20s %10s",rs.getString(1),rs.getString(2),rs.getString(3));
            System.out.println();
        }
    }


    public void update(int ccode, String cname, int score) throws Exception{
        ps = con.prepareStatement("UPDATE CRICKETER SET CNAME = ?, SCORE = ? WHERE CCODE = ?");
        ps.setString(1,cname);
        ps.setInt(2,score);
        ps.setInt(3,ccode);
        ps.executeUpdate();
    }


    public  void delete(int ccode) throws Exception{
        ps = con.prepareStatement("DELETE FROM CRICKETER WHERE CCODE = ?");
        ps.setInt(1,ccode);
        ps.executeUpdate();
    }

    public void sortByName() throws Exception{
        ps = con.prepareStatement("SELECT * FROM CRICKETER ORDER BY CNAME");
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s %-20s %10s",rs.getString(1),rs.getString(2),rs.getString(3));
            System.out.println();
        }
    }

    public void sortByScore() throws Exception{
        ps = con.prepareStatement("SELECT * FROM CRICKETER ORDER BY SCORE");
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s %-20s %10s",rs.getString(1),rs.getString(2),rs.getString(3));
            System.out.println();
        }
    }

    public void searchByName(String cname) throws Exception{
        ps = con.prepareStatement("SELECT * FROM CRICKETER WHERE CNAME = ?");
        ps.setString(1,cname);
        rs = ps.executeQuery();
        if(rs.next()){
             System.out.printf("%-15s %-20s %10s",rs.getString(1),rs.getString(2),rs.getString(3));    
        }else{
            System.out.println("Record not found");
        }
    }

    public void searchByScore(int score) throws Exception{
        ps = con.prepareStatement("SELECT * FROM CRICKETER WHERE SCORE = ?");
        ps.setInt(1,score);
        rs = ps.executeQuery();
        if(rs.next()){
            do{
                System.out.printf("%-15s %-20s %10s",rs.getString(1),rs.getString(2),rs.getString(3));
                System.out.println();
            }while(rs.next());
        }
        else{
            System.out.println("Record Does Not Exist");
        }
    }

    public void close() throws Exception{
        con.close();
    }
} 
