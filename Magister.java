import java.util.List;
import java.util.ArrayList;

public class Magister extends Mahasiswa{

    private List<MataKuliah> matkul;
    private String judulPenelitian;

    public Magister(String nama, String alamat, String ttl, int noTelp, int nim, String jurusan, List<MataKuliah> matkul, String judulPenelitian) {
        
        super(nama, alamat, ttl, noTelp, nim, jurusan);
        this.matkul = matkul;
        this.judulPenelitian = judulPenelitian;
    }

    public Magister(){
        super();
        matkul = new ArrayList<MataKuliah>();
        judulPenelitian = "";
    }

    public List<MataKuliah> getMatkul() {
        return matkul;
    }

    public void setMatkul(List<MataKuliah> matkul) {
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
        return super.toString() + " " + matkul.toString() + " " + judulPenelitian;
    }
}
