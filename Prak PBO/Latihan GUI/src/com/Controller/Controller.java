package com.Controller;

import com.KTP;
import com.Perekaman;
import com.DatabaseHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    // SELECT ALL from table dataKTP
    public static ArrayList<KTP> getAllKTP() {
        ArrayList<KTP> listKTP = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM dataKTP";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                KTP ktp = new KTP();
                ktp.setNIK(rs.getString("NIK"));
                ktp.setNama(rs.getString("Nama"));
                ktp.setTempatLahir(rs.getString("TempatLahir"));
                ktp.setTanggalLahir(rs.getString("TanggalLahir"));
                ktp.setJenisKelamin(rs.getString("JenisKelamin"));
                ktp.setGolDarah(rs.getString("GolDarah"));
                ktp.setAlamat(rs.getString("Alamat"));
                ktp.setRT(rs.getString("RT"));
                ktp.setRW(rs.getString("RW"));
                ktp.setKelDes(rs.getString("KelDes"));
                ktp.setKecamatan(rs.getString("Kecamatan"));
                ktp.setAgama(rs.getString("Agama"));
                ktp.setStatusPerkawinan(rs.getString("StatusPerkawinan"));
                ktp.setPekerjaan(rs.getString("Pekerjaan"));
                ktp.setKewarganegaraaan(rs.getString("Kewarganegaraan"));
                ktp.setBerlakuHingga(rs.getString("BerlakuHingga"));
                ktp.setKotaPembuatan(rs.getString("KotaPembuatan"));
                ktp.setTanggalPembuatan(rs.getString("TanggalPembuatan"));
                ktp.setTitle(rs.getString("Title"));
                ktp.setPathPas(rs.getString("pathPas"));
                ktp.setPathTandaTangan(rs.getString("pathTandaTangan"));
                listKTP.add(ktp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listKTP);
    }

    // SELECT WHERE
    public static KTP getKTP(String NIK) {
        conn.connect();
        String query = "SELECT * FROM dataKTP WHERE NIK='" + NIK + "'";
        KTP ktp = new KTP();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                ktp.setNIK(rs.getString("NIK"));
                ktp.setNama(rs.getString("Nama"));
                ktp.setTempatLahir(rs.getString("TempatLahir"));
                ktp.setTanggalLahir(rs.getString("TanggalLahir"));
                ktp.setJenisKelamin(rs.getString("JenisKelamin"));
                ktp.setGolDarah(rs.getString("GolDarah"));
                ktp.setAlamat(rs.getString("Alamat"));
                ktp.setRT(rs.getString("RT"));
                ktp.setRW(rs.getString("RW"));
                ktp.setKelDes(rs.getString("KelDes"));
                ktp.setKecamatan(rs.getString("Kecamatan"));
                ktp.setAgama(rs.getString("Agama"));
                ktp.setStatusPerkawinan(rs.getString("StatusPerkawinan"));
                ktp.setPekerjaan(rs.getString("Pekerjaan"));
                ktp.setKewarganegaraaan(rs.getString("Kewarganegaraan"));
                ktp.setBerlakuHingga(rs.getString("BerlakuHingga"));
                ktp.setKotaPembuatan(rs.getString("KotaPembuatan"));
                ktp.setTanggalPembuatan(rs.getString("TanggalPembuatan"));
                ktp.setTitle(rs.getString("Title"));
                ktp.setPathPas(rs.getString("pathPas"));
                ktp.setPathTandaTangan(rs.getString("pathTandaTangan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (ktp);
    }

    public static boolean checkKTP(String NIK) {
        boolean isThere = false;
        conn.connect();
        String query = "SELECT * FROM dataKTP";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (NIK.equals(rs.getString("NIK"))) {
                    isThere = true;
                }
            }
        } catch (SQLException e) {
            isThere = false;
            e.printStackTrace();
        }
        return (isThere);
    }

    // INSERT
    public static boolean insertNewKTP(KTP ktp) {
        conn.connect();
        String query = "INSERT INTO dataKTP VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, ktp.getNIK());
            stmt.setString(2, ktp.getNama());
            stmt.setString(3, ktp.getTempatLahir());
            stmt.setString(4, ktp.getTanggalLahir());
            stmt.setString(5, ktp.getJenisKelamin());
            stmt.setString(6, ktp.getGolDarah());
            stmt.setString(7, ktp.getAlamat());
            stmt.setString(8, ktp.getRT());
            stmt.setString(9, ktp.getRW());
            stmt.setString(10, ktp.getKelDes());
            stmt.setString(11, ktp.getKecamatan());
            stmt.setString(12, ktp.getAgama());
            stmt.setString(13, ktp.getStatusPerkawinan());
            stmt.setString(14, ktp.getPekerjaan());
            stmt.setString(15, ktp.getKewarganegaraaan());
            stmt.setString(16, ktp.getBerlakuHingga());
            stmt.setString(17, ktp.getKotaPembuatan());
            stmt.setString(18, ktp.getTanggalPembuatan());
            stmt.setString(19, ktp.getTitle());
            stmt.setString(20, ktp.getPathPas());
            stmt.setString(21, ktp.getPathTandaTangan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE
    public static boolean updateKTP(KTP ktp) {
        conn.connect();
        String query = "UPDATE dataKTP SET " +
                "Nama='" + ktp.getNama() + "', " +
                "TempatLahir='" + ktp.getTempatLahir() + "', " +
                "TanggalLahir='" + ktp.getTanggalLahir() + "', " +
                "JenisKelamin='" + ktp.getJenisKelamin() +"', " +
                "GolDarah='" + ktp.getGolDarah() + "', " +
                "Alamat='" + ktp.getAlamat() + "', " +
                "RT='" + ktp.getRT() + "', " +
                "RW='" + ktp.getRW() + "', " +
                "KelDes='" + ktp.getKelDes() + "', " +
                "Kecamatan='" + ktp.getKecamatan() + "', " +
                "Agama='" + ktp.getAgama() + "', " +
                "StatusPerkawinan='" + ktp.getStatusPerkawinan() + "', " +
                "Pekerjaan='" + ktp.getPekerjaan() + "', " +
                "Kewarganegaraan='" + ktp.getKewarganegaraaan() + "', " +
                "BerlakuHingga='" + ktp.getBerlakuHingga() + "', " +
                "KotaPembuatan='" + ktp.getKotaPembuatan() + "', " +
                "TanggalPembuatan='" + ktp.getTanggalPembuatan() + "', " +
                "Title='" + ktp.getTitle() + "', " +
                "pathPas='" + ktp.getPathPas() + "', " +
                "pathTandaTangan='" + ktp.getPathTandaTangan() + "' " +
                " WHERE NIK='" + ktp.getNIK() + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // DELETE
    public static boolean deleteKTP(String nik) {
        conn.connect();

        String query = "DELETE FROM dataKTP WHERE NIK='" + nik + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
