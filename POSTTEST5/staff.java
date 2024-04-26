public class staff extends karyawan {
    private int salary;
    private String shift;

    public staff(String Nama, String Departemen, int ID, int salary, String shift) {
        super(Nama, Departemen, ID);
        this.salary = salary;
        this.shift = shift;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void display() {
        System.out.println("Nama: " + getNama());
        System.out.println("ID: " + getID());
        System.out.println("Departemen: " + getDepartemen());
        System.out.println("Gaji: " + salary);
        System.out.println("Shift: " + shift);
    }
}
