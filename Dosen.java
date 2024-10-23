import java.util.List;
import java.util.ArrayList;

public abstract class Dosen{
    private String departemen;
    private List<MatkulAjar> matkulAjar;

    protected Dosen(String departemen, List<MatkulAjar> matkulAjar){
        this.departemen = departemen;
        this.matkulAjar = matkulAjar;
    }

    protected Dosen(){
        departemen = "";
        matkulAjar = new ArrayList<MatkulAjar>();
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setMatkulAjar(List<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    public List<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

}
