import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class app {
    public static ArrayList<karyawan> datakaryawan = new ArrayList<>();

    public static void tampil(){
        for (int i = 0; i < datakaryawan.size(); i++){
            System.out.println("Karyawan ke-" + (i+1));
            System.out.println("Nama : " + datakaryawan.get(i).getNama());
            System.out.println("NIP : ");
            System.out.println(datakaryawan.get(i).getNIP());
            System.out.println("Jabatan : " + datakaryawan.get(i).getJabatan());
            System.out.println("----------------");
       } 
    } 
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
                tampil();
            }
            else if (menu.equals("3")){
                tampil();
                System.out.print("Masukkan NIP yang ingin diupdate : ");
                int updatenip = Integer.parseInt(br.readLine());
                for (int i = 0; i < datakaryawan.size(); i++){
                    if (datakaryawan.get(i).getNIP() == updatenip) {
                        System.out.println("Masukkan Nama baru : ");
                        datakaryawan.get(i).setNama(br.readLine());

                        System.out.println("Masukkan NIP baru : ");
                        datakaryawan.get(i).setNIP(Integer.parseInt(br.readLine()));

                        System.out.println("Masukkan Prodi baru : ");
                        datakaryawan.get(i).setJabatan(br.readLine());

                        break;
                    }
                    else {
                        System.out.println("Data tidak tersedia");
                    }
                }
            }
            else if (menu.equals("4")){
                tampil();
                System.out.println("Masukkan NIM yang ingin dihapus : ");
                int hapusNim = Integer.parseInt(br.readLine());
                for (int i = 0; i < datakaryawan.size(); i++){
                    if (datakaryawan.get(i).getNIP() == hapusNim){
                        datakaryawan.remove(i);
                        System.out.println("Data berhasil dihapus");
                    }
                    else {
                        System.out.println("Data tidak tersedia");
                    }
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
