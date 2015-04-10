
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fadli
 */
public class menuAdmin {
   public void AdminOn(){
       ControllerAdmin inputAdmin = new ControllerAdmin();      
       ControllerAdmin inputLoket = new ControllerAdmin();      
       ControllerAdmin inputKeretaApi = new ControllerAdmin();		
       menuUtama mu = new menuUtama();
       menuAdmin madm = new menuAdmin();
		int v=0;
                int i=0;
		int umur,jumlahGerbong,jumlahKursi;
		String nomor_pegawai,jabatan,nama,jenisKelamin,alamat,nomorKereta,namaKereta,rute;                		
		do{
                    try{
                    System.out.println("Menu admin");			
			System.out.println("Silahkan pilih menu");			
			System.out.println("1. Input admin");
			System.out.println("2. lihat data admin");			
                        System.out.println("3. hapus data admin");
                        System.out.println("4. Input data pengelola loket");
                        System.out.println("5. lihat data pengelola loket");
                        System.out.println("6. hapus data pengelola loket");
                        System.out.println("7. Input kereta api");
                        System.out.println("8. lihat data kereta api");
                        System.out.println("9. hapus data kereta api");
			System.out.println("10. Kembali");
                        System.out.println("Pilihan anda :");
			String milih = System.console().readLine();
			int pilihan = Integer.parseInt(milih);			
			switch(pilihan){
				case 1 :			
                                        Scanner masukAdmin = new Scanner(System.in);
					System.out.println("Menu admin");
					System.out.print("Masukkan nomor pegawai : ");
					nomor_pegawai = masukAdmin.next();
					System.out.print("Masukkan jabatan : ");
					jabatan = masukAdmin.next();
					System.out.println("Masukkan nama : ");
					nama = masukAdmin.next();
                                        System.out.print("Masukkan umur : ");
					umur = masukAdmin.nextInt();
                                        System.out.print("Masukkan jenis kelamin : ");
					jenisKelamin = masukAdmin.next();
					System.out.println("Masukkan alamat : ");
					alamat = masukAdmin.next();
					inputAdmin.SimpanAdmin(nomor_pegawai,jabatan,nama,umur,jenisKelamin,alamat);
				break;
				case 2 :					                                    
                                    System.out.println("--------------DATA ADMIN---------------");
                                    for (Admin adm : inputAdmin.getAdmin()) { //input.getALL() berisi list data objek mahasiswa
                                        System.out.println("Nomor pegawai : " + adm.getnomorPegawai()); 
                                        System.out.println("Jabatan : " + adm.getJabatan());
                                        System.out.println("Nama    : " + adm.getNama());
                                        System.out.println("Umur    : " + adm.getUmur());
                                        System.out.println("Jenis kelamin    : " + adm.getJenisKelamin());
                                        System.out.println("alamat           : " + adm.getAlamat());
                                    System.out.println("-----------------------------");
                                }
				break;
                                case 3 :					                                    
                                    System.out.println("--------------HAPUS DATA ADMIN---------------");
                                    inputAdmin.deleteAdmin(i);
                                    inputAdmin.getAdmin().stream().map((adm) -> {
                                        
                                        System.out.println("Nomor pegawai : " + adm.getnomorPegawai());
                        return adm;
                                    }).map((adm) -> {
                                        System.out.println("Jabatan : " + adm.getJabatan());
                                        return adm;
                                    }).map((adm) -> {
                                        System.out.println("Nama    : " + adm.getNama());
                                        return adm;
                    }).map((adm) -> {
                        System.out.println("Umur    : " + adm.getUmur());
                        return adm;
                    }).map((adm) -> {
                        System.out.println("Jenis kelamin    : " + adm.getJenisKelamin());
                        return adm;
                    }).map((adm) -> {
                        System.out.println("alamat           : " + adm.getAlamat());
                        return adm;
                    }).forEach((_item) -> {
                        System.out.println("-----------------------------");
                    });
                                    System.out.println("data terhapus");
				break;        
                                case 4: 
                                    Scanner masukLoket = new Scanner(System.in);
					System.out.println("Menu loket");
					System.out.print("Masukkan nomor pengelola loket : ");
					nomor_pegawai = masukLoket.next();
					System.out.print("Masukkan jabatan : ");
					jabatan = masukLoket.next();
					System.out.println("Masukkan nama pengelola loket : ");
					nama = masukLoket.next();
                                        System.out.print("Masukkan umur pengelola loket : ");
					umur = masukLoket.nextInt();
                                        System.out.print("Masukkan jenis kelamin : ");
					jenisKelamin = masukLoket.next();
					System.out.println("Masukkan alamat : ");
					alamat = masukLoket.next();
					inputLoket.SimpanLoket(nomor_pegawai,jabatan,nama,umur,jenisKelamin,alamat);
                                break;
                                case 5 :
                                    System.out.println("--------------LOKET---------------");
                                    for (Loket lkt : inputLoket.getLoket()) { 
                                        System.out.println("Nomor pegawai : " + lkt.getnomorPegawai()); 
                                        System.out.println("Jabatan : " + lkt.getJabatan());
                                        System.out.println("Nama    : " + lkt.getNama());
                                        System.out.println("Umur    : " + lkt.getUmur());
                                        System.out.println("Jenis kelamin    : " + lkt.getJenisKelamin());
                                        System.out.println("alamat           : " + lkt.getAlamat());
                                    System.out.println("-----------------------------");
                                }
                                break;
                                case 6 :					                                    
                                    System.out.println("--------------HAPUS DATA LOKET---------------");                                                                        
                                    System.out.println("tulis data yang akan dihapus :");
                                    inputLoket.deleteLoket(i);                                   
                                    System.out.println("data terhapus");
				break;    
                                case 7: 
                                    Scanner masukKereta = new Scanner(System.in);
					System.out.println("Menu input Kereta Api");
					System.out.print("Masukkan nomor kereta api : ");
					nomorKereta = masukKereta.next();
					System.out.print("Masukkan nama kereta api : ");
					namaKereta = masukKereta.next();
					System.out.println("Masukkan rute kereta api : ");
					rute = masukKereta.next();
                                        System.out.print("Masukkan jumlah gerbong : ");
                                        jumlahGerbong = masukKereta.nextInt();
                                        System.out.print("Masukkan jumlah kursi : ");
					jumlahKursi = masukKereta.nextInt();					
					inputKeretaApi.SimpanKereta(nomorKereta, namaKereta, rute, jumlahKursi, jumlahGerbong);
                                break;
                                case 8 :
                                    System.out.println("--------------KERETA API---------------");
                                    for (KeretaApi krt : inputKeretaApi.getKereta()) { 
                                        System.out.println("Nomor kereta : " + krt.getNomorKereta()); 
                                        System.out.println("Nama kereta  : " + krt.getNamaKereta());
                                        System.out.println("rute kereta  : " + krt.getRute());
                                        System.out.println("Jumlah gerbong    : " + krt.getJumlahGerbong());
                                        System.out.println("Jumlah kursi    : " + krt.getJumlahKursi());                                        
                                    System.out.println("-----------------------------");
                                }
                                break;
                                  case 9 :					                                    
                                    System.out.println("--------------HAPUS DATA KERETA API---------------");
                                    inputKeretaApi.deleteDataKereta(i);
                                    System.out.println("data terhapus");
				break;      
                                case 10 :
                                    mu.mainMenu();
                                    break;
				default : System.out.println("menu tidak ada");
				break;
			}
                    }catch(Exception e){
                        System.out.println("eror, harusnya input angka");
                        madm.AdminOn();
                    }						
		}while(v!=8);
   }
}
