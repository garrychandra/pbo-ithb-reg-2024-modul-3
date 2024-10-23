import java.util.List;

public class DosenHonorer extends Dosen {
    private int honorPerSKS;
    
    public DosenHonorer(String departemen, List<MatkulAjar> matkulAjar, int honorPerSKS){
        super(departemen, matkulAjar);
        this.honorPerSKS = honorPerSKS;
    }

    public DosenHonorer(){
        super();
        honorPerSKS = 0;
    }
    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }
}
