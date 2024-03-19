public class karyawan {
    private String Nama, Jabatan;
    private int NIP;

    public karyawan(String Nama, String Jabatan, int NIP) {
        this.Nama = Nama;
        this.Jabatan = Jabatan;
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String jabatan) {
        Jabatan = jabatan;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int nIP) {
        NIP = nIP;
    }
}