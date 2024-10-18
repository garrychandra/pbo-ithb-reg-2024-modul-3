import java.util.Arrays;

public class Magister extends Mahasiswa{

    MataKuliah [] matkul;
    String judulPenelitian;

    public Magister(int NIM, String jurusan,MataKuliah[] matkul, String judulPenelitian) {
        super(NIM, jurusan);
        this.matkul = matkul;
        this.judulPenelitian = judulPenelitian;
    }

    public MataKuliah[] getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah[] matkul) {
        this.matkul = matkul;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    @Override
    public String toString() {
        return super.toString() + " " + Arrays.toString(matkul) + " " + judulPenelitian;
    }
}
