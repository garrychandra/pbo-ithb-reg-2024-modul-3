import java.util.Arrays;

public class Sarjana extends Mahasiswa{
    MataKuliah [] matkul;

    public Sarjana(int nim, String jurusan, MataKuliah[] matkul) {
        super(nim,jurusan);
        this.matkul = matkul;
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
