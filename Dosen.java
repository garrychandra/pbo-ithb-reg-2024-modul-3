import java.util.ArrayList;
import java.util.List;

public abstract class Dosen{
    String departemen;
    List<MatkulAjar> matkulAjar;
    
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
