/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tampilanbuku;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "laporan_buku")
@NamedQueries({
    @NamedQuery(name = "LaporanBuku.findAll", query = "SELECT l FROM LaporanBuku l"),
    @NamedQuery(name = "LaporanBuku.findByIsbn", query = "SELECT l FROM LaporanBuku l WHERE l.isbn = :isbn"),
    @NamedQuery(name = "LaporanBuku.findByJudulBuku", query = "SELECT l FROM LaporanBuku l WHERE l.judulBuku = :judulBuku"),
    @NamedQuery(name = "LaporanBuku.findByTahunTerbit", query = "SELECT l FROM LaporanBuku l WHERE l.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "LaporanBuku.findByPenerbit", query = "SELECT l FROM LaporanBuku l WHERE l.penerbit = :penerbit")})
public class LaporanBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "tahun_terbit")
    private Integer tahunTerbit;
    @Column(name = "penerbit")
    private String penerbit;

    public LaporanBuku() {
    }

    public LaporanBuku(String isbn) {
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public Integer getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Integer tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LaporanBuku)) {
            return false;
        }
        LaporanBuku other = (LaporanBuku) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tampilanbuku.LaporanBuku[ isbn=" + isbn + " ]";
    }
    
}
