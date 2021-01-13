import java.sql.*;



/**
 *
 * @author micojasmin
 */
public class Connection_DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/StudentsInformation";
        String uname = "root" ;
        String pw= "1234";
        String query = "SELECT * FROM TableName";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, uname, pw);//this creates connection and get the parameters
        Statement stat = con.createStatement();// this creates a statement for sql query
        ResultSet rs = stat.executeQuery(query); // resultset use to display bunch of data and this line execute our query
        String data ;
        
     
while(rs.next()){
      data = rs.getString(1) + " : " +  rs.getString(2);
        System.out.println(data);
        
}
        stat.close();
        con.close();
    }
    
}
