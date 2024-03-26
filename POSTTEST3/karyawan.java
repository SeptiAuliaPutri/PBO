public class karyawan {
    protected String Nama, Departemen;
    protected int ID;

    public karyawan(String Nama, String Departemen, int ID) {
        this.Nama = Nama;
        this.Departemen = Departemen;
        this.ID = ID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getDepartemen() {
        return Departemen;
    }

    public void setDepartemen(String Departemen) {
        this.Departemen = Departemen;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}