/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Lenovo
 */
public class Select {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/Sewa Film";
    static final String USER = "postgres";
    static final String PASS = "1234";
    static final String QUERY = "SELECT * FROM Pembayaran";

    public static void main(String[] args) {
        // Open a connection
        try ( Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);  
                Statement stmt = conn.createStatement();  
                ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                //Display values
                System.out.print("ID_Pembayaran: " + String.valueOf(rs.getObject(1)));
                System.out.print("              ");
                System.out.print("ID_Pelanggan: " + String.valueOf(rs.getObject(2)));
                System.out.print("              ");
                System.out.print("ID_Staf " + String.valueOf(rs.getObject(3)));
                System.out.print("              ");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}  
