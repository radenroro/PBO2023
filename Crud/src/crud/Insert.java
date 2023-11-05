/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Insert {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Sewa Film";
    static final String USER = "postgres";
    static final String PASS = "1234";
    static final String QUERY = "INSERT INTO pembayaran VALUES (?, ?, ?, ?, ?, ?)";
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner input = new Scanner(System.in);

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            pstmt = conn.prepareStatement(QUERY);

            System.out.print("ID_Pembayaran: ");
            int insert_ID_Pembayaran = input.nextInt();
            
            System.out.print("ID_Pelanggan: ");
            int insert_ID_Pelanggan = input.nextInt();
            
            System.out.print("ID_Staf: ");
            int insert_ID_Staf = input.nextInt();
            
            System.out.print("ID_Rental: ");
            int insert_ID_Rental = input.nextInt();
            
            System.out.print("Jumlah: ");
            int insert_Jumlah = input.nextInt();
            
            LocalDate date = LocalDate.now();
            java.sql.Date sqlDate = java.sql.Date.valueOf(date); 


            pstmt.setInt(1, insert_ID_Pembayaran);
            pstmt.setInt(2, insert_ID_Pelanggan);
            pstmt.setInt(3, insert_ID_Staf);
            pstmt.setInt(4,insert_ID_Rental);
            pstmt.setInt(5, insert_Jumlah);
            pstmt.setDate(6, sqlDate);

            int k = pstmt.executeUpdate();
            if (k > 0) {
                System.out.println("BERHASIL!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
