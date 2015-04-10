/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klompok kreta
 */
import java.util.*;
public class menuUtama {
    public void mainMenu(){		
		int v=0;				
                String nama,jabatan,passw;
                loginAdmin logadm = new loginAdmin();
                loginLoket loglkt = new loginLoket();
                menuUtama mnUtama = new menuUtama();
                try{
		do{
			System.out.println("SISTEM INFORMASI PEMESANAN TIKET");			
			System.out.println("Silahkan login untuk melanjutkan");						
			System.out.println("1.Login Admin");			
                        System.out.println("2.Login Loket");
			System.out.println("3. Keluar");			
			String milih = System.console().readLine();
			int pilihan = Integer.parseInt(milih);	                       
                        switch(pilihan){
				case 1 :
                                    
                                    Scanner masukAdmin = new Scanner(System.in);
					System.out.println("Masuk admin");
					System.out.println("Masukkan nama  : ");
					nama = masukAdmin.next();
					System.out.println("Masukkan jabatan : ");
					 jabatan = masukAdmin.next();					
					System.out.println("Masukkan password : ");
					passw = masukAdmin.next();					
                                        logadm.loginAdmin(nama, jabatan, passw);                                                                    
				break;
				case 2 :					
					Scanner masukLoket = new Scanner(System.in);
					System.out.println("login petugas loket");
					System.out.println("Masukkan nama  : ");
					nama = masukLoket.next();
					System.out.println("Masukkan jabatan : ");
					 jabatan = masukLoket.next();					
					System.out.println("Masukkan password : ");
					passw = masukLoket.next();					
					loglkt.loginLoket(nama, jabatan, passw);
				break;
                                case 3 :
                                    System.exit(0);
                                    System.out.println("TERIMA KASIH :) ");
                                    break;
				default : System.out.println("menu tidak ada");
				break;
			}                        						
		}while(v!=3);
                }catch(Exception e){
                            System.out.println("harus menggunakan angka dalam input menu !");
                            mnUtama.mainMenu();
                        }
	}
}
