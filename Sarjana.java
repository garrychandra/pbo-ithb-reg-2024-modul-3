import java.util.List;
import java.util.ArrayList;

public class Sarjana extends Mahasiswa{
    private List<MatkulAmbil> matkul;

    public Sarjana(String nama, String alamat, String ttl, int noTelp, int nim, String jurusan, List<MatkulAmbil>  matkul) {
        super(nama, alamat, ttl, noTelp, nim, jurusan);
        this.matkul = matkul;
    }

    public Sarjana(){
        super();
        matkul = new ArrayList<MatkulAmbil>();
    }

    public List<MatkulAmbil>  getMatkul() {
        return matkul;
    }

    public void setMatkul(List<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }

    @Override
    public String toString() {
        return super.toString() + " " + matkul.toString();
    }


}
