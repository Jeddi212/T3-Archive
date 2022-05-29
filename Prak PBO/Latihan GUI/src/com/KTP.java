// Nim  : 1119023
// Nama : Jedediah Fanuel
package com;


public class KTP {
    private String NIK;
    private String Nama;
    private String TempatLahir;
    private String TanggalLahir;
    private String JenisKelamin;
    private String GolDarah;
    private String Alamat;
    private String RT;
    private String RW;
    private String KelDes;
    private String Kecamatan;
    private String Agama;
    private String StatusPerkawinan;
    private String Pekerjaan;
    private String Kewarganegaraaan;
    private String BerlakuHingga;
    private String KotaPembuatan;
    private String TanggalPembuatan;
    private String Title;
    private String pathPas;
    private String pathTandaTangan;


    public KTP(String NIK, String nama, String tempatLahir, String tanggalLahir, String jenisKelamin, String golDarah, String alamat, String RT, String RW, String kelDes, String kecamatan, String agama, String statusPerkawinan, String pekerjaan, String kewarganegaraaan, String berlakuHingga, String kotaPembuatan, String tanggalPembuatan, String title, String pathPas, String pathTandaTangan) {
        this.NIK = NIK;
        Nama = nama;
        TempatLahir = tempatLahir;
        TanggalLahir = tanggalLahir;
        JenisKelamin = jenisKelamin;
        GolDarah = golDarah;
        Alamat = alamat;
        this.RT = RT;
        this.RW = RW;
        KelDes = kelDes;
        Kecamatan = kecamatan;
        Agama = agama;
        StatusPerkawinan = statusPerkawinan;
        Pekerjaan = pekerjaan;
        Kewarganegaraaan = kewarganegaraaan;
        BerlakuHingga = berlakuHingga;
        KotaPembuatan = kotaPembuatan;
        TanggalPembuatan = tanggalPembuatan;
        Title = title;
        this.pathPas = pathPas;
        this.pathTandaTangan = pathTandaTangan;
    }

    public KTP() {
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getTempatLahir() {
        return TempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        TempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        TanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getGolDarah() {
        return GolDarah;
    }

    public void setGolDarah(String golDarah) {
        GolDarah = golDarah;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getRT() {
        return RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
    }

    public String getRW() {
        return RW;
    }

    public void setRW(String RW) {
        this.RW = RW;
    }

    public String getKelDes() {
        return KelDes;
    }

    public void setKelDes(String kelDes) {
        KelDes = kelDes;
    }

    public String getKecamatan() {
        return Kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        Kecamatan = kecamatan;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String agama) {
        Agama = agama;
    }

    public String getStatusPerkawinan() {
        return StatusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        StatusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        Pekerjaan = pekerjaan;
    }

    public String getKewarganegaraaan() {
        return Kewarganegaraaan;
    }

    public void setKewarganegaraaan(String kewarganegaraaan) {
        Kewarganegaraaan = kewarganegaraaan;
    }

    public String getBerlakuHingga() {
        return BerlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        BerlakuHingga = berlakuHingga;
    }

    public String getKotaPembuatan() {
        return KotaPembuatan;
    }

    public void setKotaPembuatan(String kotaPembuatan) {
        KotaPembuatan = kotaPembuatan;
    }

    public String getTanggalPembuatan() {
        return TanggalPembuatan;
    }

    public void setTanggalPembuatan(String tanggalPembuatan) {
        TanggalPembuatan = tanggalPembuatan;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPathPas() {
        return pathPas;
    }

    public void setPathPas(String pathPas) {
        this.pathPas = pathPas;
    }

    public String getPathTandaTangan() {
        return pathTandaTangan;
    }

    public void setPathTandaTangan(String pathTandaTangan) {
        this.pathTandaTangan = pathTandaTangan;
    }
}

