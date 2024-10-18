

public abstract class Mahasiswa extends SIA{

    private int NIM;
    private String jurusan;

    public Mahasiswa(int NIM, String jurusan) {
        NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public int getNIM() {
        return NIM;
    }

    @Override
    public String toString(){
        return NIM + " " + jurusan;
    }
}