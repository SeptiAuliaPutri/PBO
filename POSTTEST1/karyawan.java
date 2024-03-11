public class karyawan {
    String Nama, Jabatan;
    int NIP;

    public karyawan(String Nama, String Jabatan, int NIP) {
        this.Nama = Nama;
        this.Jabatan = Jabatan;
        this.NIP = NIP;
    }

    void tampil(){
        System.out.println("NIP : " + "" + this.NIP);
        System.out.println("Nama : " + this.Nama);
        System.out.println("Jabatan : " + this.Jabatan);
    }
}