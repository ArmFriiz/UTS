public class Dosen extends Karyawan{
    private String jurusan;
    private int sks;
    private int nidn;

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public int hitung(int a) {
//        super.hitung(a);
        int total=a;
        return total;
    }

    public int hitung(int a, int sks, int normal) {
        int lebih=sks-normal;
        int total=a+(lebih*100000);
        return total;
    }
}
