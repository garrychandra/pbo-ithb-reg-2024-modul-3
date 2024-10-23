public class MatkulPilihan extends MataKuliah {
    private static int counter;
    private int jumlahMinimum;

    public MatkulPilihan(int kode, int sks, String nama, int jumlahMinimum) {
        super(kode, sks, nama);
        this.jumlahMinimum = jumlahMinimum;
        counter++;
    }

    public MatkulPilihan(){
        super();
        jumlahMinimum = 0;
        counter++;
    }
    
    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }

    public int getJumlahMinimum() {
        return jumlahMinimum;
    }

}
