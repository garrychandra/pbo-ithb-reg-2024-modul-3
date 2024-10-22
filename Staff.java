public abstract class Staff extends SIA {
    private int NIK;
    
    public Staff(){
        NIK = 0;
    }

    public Staff(int NIK){
        this.NIK = NIK;
    }

    public void setNIK(int nIK) {
        NIK = nIK;
    }

    public int getNIK() {
        return NIK;
    }
}
