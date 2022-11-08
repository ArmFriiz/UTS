public class Tendik extends Karyawan{
    private int jam_kerja;

    public int getJam_kerja() {
        return jam_kerja;
    }

    public void setJam_kerja(int jam_kerja) {
        this.jam_kerja = jam_kerja;
    }

    @Override
    public void hitung(int gaji) {
//        super.hitung(a);
        setTotal(gaji);
    }

    public void hitung(int a, int jam_kerja, int normal) {
        int lebih=jam_kerja-normal;
        setTotal(a+(lebih*50000));
    }

    @Override
    public void cetak() {
//        super.cetak();
        System.out.println(" NIP Tendik        : "+getNip());
        System.out.println(" Nama Tendik       : "+getNama());
        System.out.println(" Total Gaji Tendik : "+getTotal());
    }
}
