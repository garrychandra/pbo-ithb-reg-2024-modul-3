import java.util.List;
import java.util.ArrayList;

public class Karyawan extends Staff{
    int salary;
    List<PresensiStaff> presensiStaff;

    public Karyawan(String nama, String alamat, String ttl, int noTelp, int nik, int salary, List<PresensiStaff> presensiStaff){
        super(nama, alamat, ttl, noTelp, nik);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public Karyawan(){
        super();
        salary = 0;
        presensiStaff = new ArrayList<PresensiStaff>();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }


}
