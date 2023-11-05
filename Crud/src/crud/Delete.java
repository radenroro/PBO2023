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
public class Delete {
    /**
     * @param args the command line arguments
     */
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Sewa Film";
    static final String USER = "postgres";
    static final String PASS = "1234";
    static final String QUERY = "DELETE FROM pembayaran WHERE \"ID_Pembayaran\" = ?";
   public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            pstmt = conn.prepareStatement(QUERY);
            System.out.println("Masukkan id yang hendak dihapus: ");
            Scanner in = new Scanner(System.in);
            String hapus = in.nextLine();
            int hapusID = Integer.parseInt(hapus);
            pstmt.setInt(1, hapusID);
            int k = pstmt.executeUpdate();
            if (k > 0) {
                System.out.println("Hapus id " + hapus + " BERHASIL !!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (Exception e) {
            }
        }
    }

}