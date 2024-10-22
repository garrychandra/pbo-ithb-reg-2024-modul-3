

public abstract class SIA{
    private String nama;
    private String alamat;
    private String ttl;
    private int noTelp;

    
    public SIA(String nama, String alamat, String ttl, int noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.noTelp = noTelp;
    }

    public SIA(){
        nama = "";
        alamat = "";
        ttl = "";
        noTelp = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }


}