package bank.management.system;

import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    public Conn() {
        try {
//            Class.forName(com.mysql.cj.jdbc.Driver);
<<<<<<< HEAD
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Luc@#$2004");
=======
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "YOUR_PASSWORD");
>>>>>>> a49d08bd1abf7112431805e3b6f25774db1a5ba7
            s = c.createStatement();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
