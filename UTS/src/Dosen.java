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
    public void hitung(int gaji) {
//        super.hitung(a);
       setTotal(gaji);
    }

    public void hitung(int a, int sks, int normal) {
        int lebih=sks-normal;
        setTotal(a+(lebih*100000));
    }

    @Override
    public void cetak() {
//        super.cetak();
        System.out.println(" NIP Dosen        : "+getNip());
        System.out.println(" NIDN Dosen       : "+getNidn());
        System.out.println(" Nama Dosen       : "+getNama());
        System.out.println(" Jurusan          : "+getJurusan());
        System.out.println(" Total Gaji Dosen : "+getTotal());
    }
}
