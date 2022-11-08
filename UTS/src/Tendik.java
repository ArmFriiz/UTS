public class Tendik extends Karyawan{
    private int jam_kerja;

    public int getJam_kerja() {
        return jam_kerja;
    }

    public void setJam_kerja(int jam_kerja) {
        this.jam_kerja = jam_kerja;
    }

    @Override
    public int hitung(int a) {
//        super.hitung(a);
        int total=a;
        return total;
    }

    public int hitung(int a, int jam_kerja, int normal) {
        int lebih=jam_kerja-normal;
        int total=a+(lebih*50000);
        return total;
    }
}
