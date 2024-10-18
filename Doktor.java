public class Doktor extends Mahasiswa{
    String judulPenelitian;
    int sidang1;
    int sidang2;
    int sidang3;

    public Doktor(int nim, String jurusan, String judulPenelitian, int sidang1, int sidang2, int sidang3) {
        super(nim,jurusan);
        this.judulPenelitian = judulPenelitian;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }

    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }

    
}
