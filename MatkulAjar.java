import java.util.List;
import java.util.ArrayList;

public class MatkulAjar{
    private MataKuliah mataKuliah;
    private List<PresensiStaff> presensi;

    public MatkulAjar(int kode, int sks, String nama, List<PresensiStaff> presensi){
        mataKuliah = new MataKuliah(kode, sks, nama);
        this.presensi = presensi;
    }

    public MatkulAjar(){
        mataKuliah = new MataKuliah();
        presensi = new ArrayList<PresensiStaff>();
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<PresensiStaff> presensi) {
        this.presensi = presensi;
    }
}
