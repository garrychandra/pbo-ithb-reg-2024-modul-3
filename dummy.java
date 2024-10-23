import java.util.ArrayList;
import java.sql.Date;

public class dummy {
    public static void main(String[] args) {
        MatkulAmbil matkulAmbil = new MatkulAmbil(12345, 4, "pbo",100, 100, 100);
        matkulAmbil.getPresensi().add(new Presensi(new Date(0), Status.HADIR));
        matkulAmbil.getPresensi().add(new Presensi(new Date(1), Status.ALPHA));
        
        Sarjana sarjana = new Sarjana("garry", "dipatiukur", "jakarta 2 desember 1900", 123456, 654321, "informatika");
        sarjana.getMatkul().add(matkulAmbil);
        
        Magister magister = new Magister();
        Doktor doktor = new Doktor();
        DosenTetap dosenTetap = new DosenTetap();
        DosenHonorer dosenHonorer = new DosenHonorer();
        Karyawan karyawan = new Karyawan();
        MataKuliah mataKuliah = new MataKuliah();
        MatkulPilihan matkulPilihan = new MatkulPilihan();

        MatkulAjar matkulAjar = new MatkulAjar();
        Presensi presensi = new Presensi();
        PresensiStaff presensiStaff = new PresensiStaff();

        System.out.println("Sarjana\n" + sarjana +
                "\nMagister\n" + magister +
                "\nDoktor\n" + doktor +
                "\nDosen Tetap\n" + dosenTetap +
                "\nDosen Honorer\n" + dosenHonorer +
                "\nKaryawan\n" + karyawan +
                "\nMata Kuliah\n" + mataKuliah +
                "\nMata Kuliah Pilihan\n" + matkulPilihan +
                "\nMata Kuliah Diajar\n" + matkulAjar +
                "\nMata Kuliah Diambil\n" + matkulAmbil +
                "\nPresensi\n" + presensi +
                "\nPresensi Staff\n" + presensiStaff);

    }
}
