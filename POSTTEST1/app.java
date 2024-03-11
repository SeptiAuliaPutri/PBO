import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class app {
    public static void main(String[] args) throws IOException {
        ArrayList<karyawan> datakaryawan = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true){
            System.out.println("""

                    Menu Pendataan Karyawan Perusahaan X : 
                    1. Create Karyawan
                    2. Read Karyawan
                    3. Update Karyawan
                    4  Delete Karyawan
                    5. Exit Program
                    """);

            System.out.print("Pilihan Menu : ");
            String menu = br.readLine();
            if (menu.equals("1")){
                System.out.print("Masukkan Nama : ");
                String Nama = br.readLine();
                System.out.print("Masukkan NIP : ");
                int NIP = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Jabatan : ");
                String Jabatan = br.readLine();

                karyawan kryBaru = new karyawan(Nama, Jabatan, NIP);
                datakaryawan.add(kryBaru);
            } 

            else if (menu.equals("2")){
                for (int i = 0; i < datakaryawan.size(); i++){
                    datakaryawan.get(i).tampil();
                    System.out.println("--------------------------------");
                }

            }
            else if (menu.equals("3")){
                for (int i = 0; i < datakaryawan.size(); i++){
                    System.out.println("Karyawan ke-" + i);
                    datakaryawan.get(i).tampil();
                    System.out.println("--------------------------------");
                }
                System.out.print("Update data ke-? : ");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= datakaryawan.size()) {
                    System.out.print("Masukkan Nama baru : ");
                    datakaryawan.get(ubah).Nama = br.readLine();
                    System.out.print("Masukkan NIP baru : ");
                    datakaryawan.get(ubah).NIP = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Jabatan baru : ");
                    datakaryawan.get(ubah).Jabatan = br.readLine();
                    System.out.println("Data berhasil diubah");
                }
                else {
                    System.out.println("Data tidak tersedia");
                }
            }
            else if (menu.equals("4")){
                for (int i = 0; i < datakaryawan.size(); i++){
                    System.out.println("Karyawan ke" + i);
                    datakaryawan.get(i).tampil();
                    System.out.println("--------------------------------");
                }
                System.out.print("Hapus data ke-? : ");
                int hapus = Integer.parseInt(br.readLine());

                if (hapus <= datakaryawan.size()) {
                    datakaryawan.remove(hapus);
                    System.out.println("Data berhasil dihapus");
                }
                else {
                    System.out.println("Data tidak tersedia");
                }
            }
            else if (menu.equals("0")){
                break;
            }
            else {
                System.out.println("Silakan input sesuai ketentuan");
            }
    }
}
}
