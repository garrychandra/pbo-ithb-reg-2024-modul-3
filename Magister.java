import java.util.Arrays;

public class Magister extends Mahasiswa{

    private MataKuliah [] matkul;
    private String judulPenelitian;

    public Magister(String nama, String alamat, String ttl, int noTelp, int NIM, String jurusan, MataKuliah[] matkul, String judulPenelitian) {
        
        super(nama, alamat, ttl, noTelp, NIM, jurusan);
        this.matkul = matkul;
        this.judulPenelitian = judulPenelitian;
    }

    public Magister(){
        super();
        matkul = new MataKuliah[0];
        judulPenelitian = "";
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
