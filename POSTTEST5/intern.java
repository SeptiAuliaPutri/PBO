 public class intern extends karyawan {
    private int duration;
    private String collegename;

    public intern (String Nama, String Departemen, int ID, int duration, String collegename) {
        super(Nama, Departemen, ID);
        this.duration = duration;
        this.collegename = collegename;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    @Override
    public void display() {
        System.out.println("Nama: " + getNama());
        System.out.println("ID: " + getID());
        System.out.println("Departemen: " + getDepartemen());
        System.out.println("Durasi: " + duration);
        System.out.println("Asal Instansi: " + collegename);
    }

}