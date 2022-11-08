import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih;
        int normal;

        String nama;
        String alamat;
        String tanggal_lahir;
        String jenis_kelamin;

        int tahun_masuk;
        int nip;
        int gaji;
        int total;

        Scanner in=new Scanner(System.in);

        System.out.println(" Masukkan janis karyawan yang ingin dimasukkan : ");
        System.out.println(" 1.Dosen");
        System.out.println(" 2.Tendik ");
        System.out.print(" Pilihan : ");
        pilih=in.nextInt();

        System.out.println();

        switch(pilih){
            case 1:

            String jurusan;
            int sks;
            int nidn;

            normal=16;
            // Maksimal sks dosen

            Dosen dosen1=new Dosen();

            dosen1.setGaji(5000000);

            System.out.print(" Masukkan NIP Dosen             : ");
            nip= in.nextInt();
            dosen1.setNip(nip);

            System.out.print(" Masukkan NIDN Dosen            : ");
            nidn= in.nextInt();
            dosen1.setNidn(nidn);

            // Menghindari error
            in.nextLine();

            System.out.print(" Masukkan Nama Dosen            : ");
            nama=in.nextLine();
            dosen1.setNama(nama);

            System.out.print(" Masukkan Alamat Dosen          : ");
            alamat=in.nextLine();
            dosen1.setAlamat(alamat);

            System.out.print(" Masukkan Tanggal Lahir Dosen   : ");
            tanggal_lahir=in.nextLine();
            dosen1.setTanggal_lahir(tanggal_lahir);

            System.out.println(" Masukkan Jenis Kelamin Dosen ");
            System.out.println(" 1.Laki-Laki");
            System.out.println(" 2.Perempuan");
            System.out.print(" Pilihan : ");
            pilih=in.nextInt();
            if(pilih==1){
                dosen1.setJenis_kelamin("Laki-Laki");
            }else {
                dosen1.setJenis_kelamin("Perempuan");
            }

            System.out.print(" Tahun Masuk                    : ");
            tahun_masuk= in.nextInt();
            dosen1.setTahun_masuk(tahun_masuk);
            in.nextLine();

            System.out.print(" Jurusan                        : ");
            jurusan= in.nextLine();
            dosen1.setJurusan(jurusan);

            System.out.print(" Total SKS                      : ");
            sks= in.nextInt();
            dosen1.setSks(sks);

            if(sks>normal){
                total=dosen1.hitung(dosen1.getGaji(), sks, normal);
//                System.out.println(total);
            }else {
                total=dosen1.hitung(dosen1.getGaji());
            }
                break;

            case 2:

            int jam_kerja;
            normal=(8*5)*4;
            // (jam*hari kerja)*jumlah minggu 1 bulan ( 28 hari ) jika diganti menjadi 29, 30, dll
            // Tambahkan jam dikalikan sisa hari dan berikan kurung contoh 28 menjadi 30 = normal=((8*5)*4)+8*2;

            Tendik tendik1=new Tendik();

            tendik1.setGaji(2000000);

            System.out.print(" Masukkan NIP Tendik             : ");
            nip= in.nextInt();
            tendik1.setNip(nip);

            // Menghindari error
            in.nextLine();

            System.out.print(" Masukkan Nama Tendik            : ");
            nama=in.nextLine();
            tendik1.setNama(nama);

            System.out.print(" Masukkan Alamat Tendik          : ");
            alamat=in.nextLine();
            tendik1.setAlamat(alamat);

            System.out.print(" Masukkan Tanggal Lahir Tendik   : ");
            tanggal_lahir=in.nextLine();
            tendik1.setTanggal_lahir(tanggal_lahir);

            System.out.println(" Masukkan Jenis Kelamin Tendik ");
            System.out.println(" 1.Laki-Laki");
            System.out.println(" 2.Perempuan");
            System.out.print(" Pilihan : ");
            pilih=in.nextInt();
            if(pilih==1){
                tendik1.setJenis_kelamin("Laki-Laki");
            }else {
                tendik1.setJenis_kelamin("Perempuan");
            }

            System.out.print(" Tahun Masuk                      : ");
            tahun_masuk= in.nextInt();
            tendik1.setTahun_masuk(tahun_masuk);

            System.out.print(" Total Jam Kerja                : ");
            jam_kerja= in.nextInt();
            if(jam_kerja>normal){
                total=tendik1.hitung(tendik1.getGaji(), jam_kerja, normal);
            }else{
                total=tendik1.hitung(tendik1.getGaji());
            }
                break;

            default:
                break;
        }
    }
}