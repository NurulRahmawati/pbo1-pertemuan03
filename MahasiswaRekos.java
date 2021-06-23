public class MahasiswaRekos extends Mahasiswa{

    public String npm;
    public String nomorHp;
    public int semester;

    public void mengikutiRekos(){

    }

    public void selesaiRekos(){

    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void menerimaNilai(80) {
    }

    @Override
    public void melakukanPenelitian(90) {
    }
}
