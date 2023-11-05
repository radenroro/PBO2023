/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Update {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Sewa Film";
    static final String USER = "postgres";
    static final String PASS = "1234";
    static final String QUERY = "UPDATE pembayaran SET \"Jumlah\" = ? WHERE \"ID_Pembayaran\" = ?";
   public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scanner = new Scanner(System.in);
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            pstmt = conn.prepareStatement(QUERY);

            System.out.print("Masukkan Jumlah baru: ");
            Integer new_Jumlah = scanner.nextInt();

            System.out.print("Masukkan ID_Pembayaran yang ingin diubah: ");
            Integer ID_Pembayaran = scanner.nextInt();

            pstmt.setInt(1, new_Jumlah);
            pstmt.setInt(2, ID_Pembayaran);
            
            int k = pstmt.executeUpdate();
            if (k > 0) {
                System.out.println("BERHASIL !!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}