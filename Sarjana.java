import java.util.Arrays;

public class Sarjana extends Mahasiswa{
    private MataKuliah [] matkul;

    public Sarjana(String nama, String alamat, String ttl, int noTelp, int nim, String jurusan, MataKuliah[] matkul) {
        super(nama, alamat, ttl, noTelp, nim, jurusan);
        this.matkul = matkul;
    }

    public Sarjana(){
        super();
        matkul = new MataKuliah[0];
    }

    public MataKuliah[] getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah[] matkul) {
        this.matkul = matkul;
    }

    @Override
    public String toString() {
        return super.toString() + " " + Arrays.toString(matkul);
    }


}
