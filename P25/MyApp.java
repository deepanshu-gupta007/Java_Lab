import java.sql.*;
class MyApp {
    public static void main(String s[]) {
        int mcode, msal; 
        String mname, mdesig;
        try {
            Connection conn; 
            Statement stmt; 
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kukretidb","roo t","root");
            stmt=conn.createStatement(); 
            rs=stmt.executeQuery("SELECT * FROM emp"); 
            while(rs.next()) {
                mname=rs.getString(1); 
                mcode=rs.getInt(2); 
                mdesig=rs.getString(3); 
                msal=rs.getInt(4);
                System.out.println(mcode+"	"+mname+"	"+mdesig+"	"+msal);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException w) {
            w.printStackTrace();
        }
    }
}