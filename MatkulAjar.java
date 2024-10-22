import java.util.List;

public class MatkulAjar extends MataKuliah{
    private List<PresensiStaff> presensi;

    public MatkulAjar(int kode, int sks, String nama, List<PresensiStaff> presensi){
        super(kode, sks, nama);
        this.presensi = presensi;
    }

    public List<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<PresensiStaff> presensi) {
        this.presensi = presensi;
    }
}
