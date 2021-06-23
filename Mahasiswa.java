import java.util.Date;

public class Mahasiswa {
    private int id;
    private String nidn;
    private String namaLengkap;
    private Date tanggalLahir;
    private Date tanggalDiterima;
    private String Jurusan;
    private String Fakultas;
    private int tahunLulus;

    public void belajar(){

    }

    public void melakukanPenelitian(){

    }

    public void melakukanPerundingan(){

    }

    public void menerimaNilai(){

    }

    public Mahasiswa() {
    }

    public Mahasiswa(int id, String nidn, String namaLengkap, Date tanggalLahir, Date tanggalDiterima, String jurusan, String fakultas, int tahunLulus) {
        this.id = id;
        this.nidn = nidn;
        this.namaLengkap = namaLengkap;
        this.tanggalLahir = tanggalLahir;
        this.tanggalDiterima = tanggalDiterima;
        Jurusan = jurusan;
        Fakultas = fakultas;
        this.tahunLulus = tahunLulus;
    }

    public Mahasiswa(int id, String nidn, String namaLengkap) {
        this.id = id;
        this.nidn = nidn;
        this.namaLengkap = namaLengkap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalDiterima() {
        return tanggalDiterima;
    }

    public void setTanggalDiterima(Date tanggalDiterima) {
        this.tanggalDiterima = tanggalDiterima;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String fakultas) {
        Fakultas = fakultas;
    }

    public int getTahunLulus() {
        return tahunLulus;
    }

    public void setTahunLulus(int tahunLulus) {
        this.tahunLulus = tahunLulus;
    }
}
