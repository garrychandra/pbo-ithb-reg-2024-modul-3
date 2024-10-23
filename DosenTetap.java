import java.util.List;

public class DosenTetap extends Dosen {
    private int salary;

    public DosenTetap(String departemen, List<MatkulAjar> matkulAjar, int salary){
        super(departemen, matkulAjar);
        this.salary = salary;
    }

    public DosenTetap(){
        super();
        salary = 0;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
