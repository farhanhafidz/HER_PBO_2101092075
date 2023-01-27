/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafidzModel;

/**
 *
 * @author Hafidz
 */
public class Anggota {
    public String nobp;
    public String nama;
    public String alamat;

    public Anggota(String nobp, String nama, String alamat) {
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
    }

    public Anggota() {
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
