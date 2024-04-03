import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class app {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<karyawan> user = new ArrayList<>();
    static ArrayList<manager> mng = new ArrayList<>();
    static ArrayList<staff> stf = new ArrayList<>();
    static ArrayList<intern> intr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        while (true){
            System.out.println("""
                    Menu Pendataan Karyawan Perusahaan X : 
                    1. Create Karyawan
                    2. Read Karyawan
                    3. Update Karyawan
                    4  Delete Karyawan
                    0. Exit Program
                    """);

            System.out.print("Pilihan Menu : ");
            String menu = br.readLine();
            if (menu.equals("1")){
                create();
            } 
            else if (menu.equals("2")){
                read();
            }
            else if (menu.equals("3")){
                update();
            }
            else if (menu.equals("4")){
                delete();
            }
            else if (menu.equals("0")){
                System.out.println("Terima kasih atas kunjungannya!!");
                break;
            }
            else {
                System.out.println("Silakan input sesuai ketentuan");
            }
        }
    }

    public static void create() throws IOException {
        System.out.println("Pilih Menu : ");
        System.out.println("1. Tambah Manager");
        System.out.println("2. Tambah Staff");
        System.out.println("3. Tambah Intern");
        System.out.print("Input : ");
        String Pilih = br.readLine();
        if ("1".equals(Pilih)){
            System.out.println("1.Tambah Manager");
            System.out.print("Masukkan ID : ");
            int ID = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Nama : ");
            String Nama = br.readLine();
            System.out.print("Masukkan Departemen : ");
            String Departemen = br.readLine();
            System.out.print("Masukkan Jumlah Bawahan : ");
            int numberOfSubordinates = Integer.parseInt(br.readLine());            
            System.out.print("Masukkan Bonus : ");
            double bonus = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Level : ");
            String level = br.readLine();
            manager datamanager = new manager(Nama, Departemen, ID, bonus, level, numberOfSubordinates);
            mng.add(datamanager);
            System.out.println("--------------------------------");
        }
        else if ("2".equals(Pilih)){
            System.out.println("2.Tambah Staff");
            System.out.print("Masukkan ID : ");
            int ID = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Nama : ");
            String Nama = br.readLine();
            System.out.print("Masukkan Departemen : ");
            String Departemen = br.readLine();
            System.out.print("Masukkan Gaji : ");
            int salary = Integer.parseInt(br.readLine());            
            System.out.print("Masukkan Shift : ");
            String shift = br.readLine();
            staff datastaff = new staff (Nama, Departemen, ID, salary, shift);
            stf.add(datastaff);
            System.out.println("--------------------------------");
        }
        else if ("3".equals(Pilih)){
            System.out.println("3.Tambah Intern");
            System.out.print("Masukkan ID : ");
            int ID = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Nama : ");
            String Nama = br.readLine();
            System.out.print("Masukkan Departemen : ");
            String Departemen = br.readLine();
            System.out.print("Masukkan Durasi Magang : ");
            int duration = Integer.parseInt(br.readLine());            
            System.out.print("Masukkan Asal Instansi : ");
            String collegename = br.readLine();
            intern dataintern = new intern(Nama, Departemen, ID, duration, collegename);
            intr.add(dataintern);
            System.out.println("--------------------------------");
        }
    }

    public static void read () throws IOException{
        System.out.println("""
                Lihat Data
                1. Manager
                2. Staff
                3. Intern
                """);
        System.out.print("Input : ");
        String Pilih = br.readLine();
        if ("1".equals(Pilih)){
            System.out.println("Data Manager : ");
            if (mng.size() < 1 ) {
                System.out.println("Data Kosong");
            }
            else {
                for (int i = 0; i < mng.size(); i++){
                    System.out.println("--------------------------------");
                    System.out.println("Manager ke - " + (i+1));
                    System.out.println("ID             : " + mng.get(i).getID());
                    System.out.println("Nama           : " + mng.get(i).getNama());
                    System.out.println("Departemen     : " + mng.get(i).getDepartemen());
                    System.out.println("Bonus          : " + mng.get(i).getBonus());
                    System.out.println("Jumlah Bawahan : " + mng.get(i).getNumberOfSubordinates());
                    System.out.println("Level          : " + mng.get(i).getLevel());
                    System.out.println("--------------------------------");
                }
            }
        }
        else if ("2".equals(Pilih)) {
            System.out.println("Data Staff : ");
            if (stf.size() < 1 ) {
                System.out.println("Data Kosong");
            }
            else {
                for (int i = 0; i < stf.size(); i++){
                    System.out.println("--------------------------------");
                    System.out.println("Staff ke - " + (i+1));
                    System.out.println("ID         : " + stf.get(i).getID());
                    System.out.println("Nama       : " + stf.get(i).getNama());
                    System.out.println("Departemen : " + stf.get(i).getDepartemen());
                    System.out.println("Gaji       : " + stf.get(i).getSalary());
                    System.out.println("Shift      : " + stf.get(i).getShift());
                    System.out.println("--------------------------------");
                }
            }
        }
        else if ("3".equals(Pilih)) {
            System.out.println("Data Intern : ");
            if (intr.size() < 1 ) {
                System.out.println("Data Kosong");
            }
            else {
                for (int i = 0; i < intr.size(); i++){
                    System.out.println("--------------------------------");
                    System.out.println("Intern ke - " + (i+1));
                    System.out.println("ID            : " + intr.get(i).getID());
                    System.out.println("Nama          : " + intr.get(i).getNama());
                    System.out.println("Departemen    : " + intr.get(i).getDepartemen());
                    System.out.println("Durasi        : " + intr.get(i).getDuration());
                    System.out.println("Asal Instansi : " + intr.get(i).getCollegename());
                    System.out.println("--------------------------------");
                }
            }
        }
    }

    public static void delete () throws IOException {
        System.out.println("""
            Hapus Data
            1. Manager
            2. Staff
            3. Intern
            """);
    System.out.print("Input : ");
    String Pilih = br.readLine();
    if ("1".equals(Pilih)){
        System.out.println("Data Manager : ");
        if (mng.size() < 1 ) {
            System.out.println("Data Kosong");
        }
        else {
            for (int i = 0; i < mng.size(); i++){
                System.out.println("--------------------------------");
                System.out.println("Manager ke - " + (i+1));
                System.out.println("ID             : " + mng.get(i).getID());
                System.out.println("Nama           : " + mng.get(i).getNama());
                System.out.println("Departemen     : " + mng.get(i).getDepartemen());
                System.out.println("Bonus          : " + mng.get(i).getBonus());
                System.out.println("Jumlah Bawahan : " + mng.get(i).getNumberOfSubordinates());
                System.out.println("Level          : " + mng.get(i).getLevel());
                System.out.println("--------------------------------");
            }
        }
        System.out.print("Data yang ingin dihapus : ");
        int hapus = Integer.parseInt(br.readLine());
        mng.remove(hapus-1);
    }
    else if ("2".equals(Pilih)) {
        System.out.println("Data Staff : ");
        if (stf.size() < 1 ) {
            System.out.println("Data Kosong");
        }
        else {
            for (int i = 0; i < stf.size(); i++){
                System.out.println("--------------------------------");
                System.out.println("Staff ke - " + (i+1));
                System.out.println("ID         : " + stf.get(i).getID());
                System.out.println("Nama       : " + stf.get(i).getNama());
                System.out.println("Departemen : " + stf.get(i).getDepartemen());
                System.out.println("Gaji       : " + stf.get(i).getSalary());
                System.out.println("Shift      : " + stf.get(i).getShift());
                System.out.println("--------------------------------");
            }
        }
        System.out.print("Data yang ingin dihapus : ");
        int hapus = Integer.parseInt(br.readLine());
        stf.remove(hapus-1);
    }
    else if ("3".equals(Pilih)) {
        System.out.println("Data Intern : ");
        if (intr.size() < 1 ) {
            System.out.println("Data Kosong");
        }
        else {
            for (int i = 0; i < intr.size(); i++){
                System.out.println("--------------------------------");
                System.out.println("Intern ke - " + (i+1));
                System.out.println("ID            : " + intr.get(i).getID());
                System.out.println("Nama          : " + intr.get(i).getNama());
                System.out.println("Departemen    : " + intr.get(i).getDepartemen());
                System.out.println("Durasi        : " + intr.get(i).getDuration());
                System.out.println("Asal Instansi : " + intr.get(i).getCollegename());
                System.out.println("--------------------------------");
            }
        }
        System.out.print("Data yang ingin dihapus : ");
        int hapus = Integer.parseInt(br.readLine());
        intr.remove(hapus-1);
    }
    }

    public static void update() throws IOException {
        System.out.println("""
            Ubah Data
            1. Manager
            2. Staff
            3. Intern
            """);
        System.out.print("Input : ");
        String Pilih = br.readLine();
        if ("1".equals(Pilih)) {
            read();
            System.out.print("Data yang ingin diperbarui : ");
            int ubah = Integer.parseInt(br.readLine());
            int index = ubah - 1;
            if (index < 0 || index >= mng.size()) {
                System.out.println("Data tidak ditemukan");
            } else {
                String nama = "";
                System.out.print("Masukkan Nama Baru : ");
                nama = br.readLine();
                int ID;
                System.out.print("Masukkan ID Baru : ");
                ID = Integer.parseInt(br.readLine());
                String Departemen;
                System.out.print("Masukkan Departemen Baru : ");
                Departemen = br.readLine();
                double bonus;
                System.out.print("Masukkan Bonus Baru : ");
                bonus = Double.parseDouble(br.readLine());
                int numberOfSubordinates;
                System.out.print("Masukkan Jumlah Bawahan Baru : ");
                numberOfSubordinates = Integer.parseInt(br.readLine());
                String level;
                System.out.print("Masukkan Level Baru : ");
                level = br.readLine();
            
                manager datamanager = mng.get(index);
                datamanager.setNama(nama);
                datamanager.setID(ID);
                datamanager.setDepartemen(Departemen);
                datamanager.setBonus(bonus);
                datamanager.setLevel(level);
                System.out.println("Berhasil ubah data!");
                System.out.println("--------------------------------");
            }
        
        } else if ("2".equals(Pilih)) {
            read();
            System.out.print("Data yang ingin diperbarui : ");
            int ubah = Integer.parseInt(br.readLine());
            int index = ubah - 1;
            if (index < 0 || index >= stf.size()) {
                System.out.println("Data tidak ditemukan");
            } else {
                String nama = "";
                System.out.print("Masukkan Nama Baru : ");
                nama = br.readLine();
                int ID;
                System.out.print("Masukkan ID Baru : ");
                ID = Integer.parseInt(br.readLine());
                String Departemen;
                System.out.print("Masukkan Departemen Baru : ");
                Departemen = br.readLine();
                int salary;
                System.out.print("Masukkan Gaji Baru : ");
                salary = Integer.parseInt(br.readLine());
                String shift;
                System.out.print("Masukkan Shift Baru : ");
                shift = br.readLine();
            
                staff dataStaff = stf.get(index);
                dataStaff.setNama(nama);
                dataStaff.setID(ID);
                dataStaff.setDepartemen(Departemen);
                dataStaff.setSalary(salary);
                dataStaff.setShift(shift);
                System.out.println("Berhasil ubah data!");
                System.out.println("--------------------------------");
            }

        }
        else if ("3".equals(Pilih)){
            read();
            System.out.print("Data yang ingin diperbarui : ");
            int ubah = Integer.parseInt(br.readLine());
            int index = ubah - 1;
            if (index < 0 || index >= intr.size()) {
                System.out.println("Data tidak ditemukan");
            } else {
                String nama = "";
                System.out.print("Masukkan Nama Baru : ");
                nama = br.readLine();
                int ID;
                System.out.print("Masukkan ID Baru : ");
                ID = Integer.parseInt(br.readLine());
                String Departemen;
                System.out.print("Masukkan Departemen Baru : ");
                Departemen = br.readLine();
                int duration;
                System.out.print("Masukkan Durasi Magang Baru : ");
                duration = Integer.parseInt(br.readLine());
                String collegename;
                System.out.print("Masukkan Asal Instansi Baru : ");
                collegename = br.readLine();
            
                intern dataIntern = intr.get(index);
                dataIntern.setNama(nama);
                dataIntern.setID(ID);
                dataIntern.setDepartemen(Departemen);
                dataIntern.setDuration(duration);
                dataIntern.setCollegename(collegename);
                System.out.println("Berhasil ubah data!");
                System.out.println("--------------------------------");
            }
        } 
    }
}
