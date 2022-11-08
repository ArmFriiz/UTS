public class Karyawan {
   private String nama;
    private String alamat;
    private String tanggal_lahir;
    private String jenis_kelamin;

    private int tahun_masuk;
    private int nip;
    private int gaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public int getTahun_masuk() {
        return tahun_masuk;
    }

    public void setTahun_masuk(int tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int hitung(int a){
        System.out.println("-");
        return a;
    }

}