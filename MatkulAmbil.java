import java.util.List;

public class MatkulAmbil {
    private MataKuliah mataKuliah;
    private List<Presensi> presensi;
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(int kode, int sks, String nama, List<Presensi> presensi, int n1, int n2, int n3) {
        mataKuliah = new MataKuliah(kode, sks, nama);
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n2;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<Presensi> presensi) {
        this.presensi = presensi;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN2() {
        return n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN3() {
        return n3;
    }

}