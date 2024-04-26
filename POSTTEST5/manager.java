public class manager extends karyawan {
    private double bonus;
    private int numberOfSubordinates;
    private String level;

    public manager (String Nama, String Departemen, int ID, double bonus, String level, int numberOfSubordinates) {
        super(Nama, Departemen, ID);
        this.bonus = bonus;
        this.numberOfSubordinates = numberOfSubordinates ;
        this.level = level;
    }

    // Overloading
    public manager (String Nama, String Departemen, int ID) {
        super(Nama, Departemen, ID);
        this.bonus = 0.0;
        this.numberOfSubordinates = 0 ;
        this.level = "";
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    @Override
    public void display() {
        System.out.println("Nama: " + getNama());
        System.out.println("ID: " + getID());
        System.out.println("Departemen: " + getDepartemen());
        System.out.println("Bonus          : " + bonus);
        System.out.println("Jumlah Bawahan : " + numberOfSubordinates);
        System.out.println("Level          : " + level);
    }

}

