import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Mahasiswa Uyuy = new Mahasiswa();
        Mahasiswa Ema = new Mahasiswa(1,"15","Ema",
                new Date(), new Date(),"Teknik Informatika","Teknologi Informasi",2022);
        Mahasiswa Uma = new Mahasiswa(5,"17","Uma");

        Mahasiswa Desy = new Mahasiswa();
        Mahasiswa Acha = new Mahasiswa(7,"81","Acha",
                new Date(), new Date(), "Manajemen","Ekonomi",2021);
        Mahasiswa Zizah = new Mahasiswa(8,"32","Zizah");
    }
}
