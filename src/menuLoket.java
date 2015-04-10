
/**
 * @author fadli
 */
import java.util.*;

public class menuLoket{
	public void LoketOn(){
		ControllerLoket inputTransaksi = new ControllerLoket();
		int v=0;
		int jumlahKategori;
                int umur;
                String jenisKelamin,alamat;
		String nomorTransaksi,noKA,namaKA,tglBerangkat,stasiunAsal, stasiunTiba,kelas = null,nama,noIdentitas,tglPemesanan,noTempatDuduk,kategoriPenumpang;
		double Harga, biayaAdmin, jumlah = 0, jamPesan,total = 0;
                menuUtama mu = new menuUtama();
                menuLoket mlkt = new menuLoket();
		Scanner masuk = new Scanner(System.in);
		do{
			System.out.println("Loket");			
			System.out.println("Silahkan pilih menu");						
			System.out.println("1. Input Pemesanan tiket");			
                        System.out.println("2. cetak tiket");
			System.out.println("3. Keluar");			
			String milih = System.console().readLine();
			int pilihan = Integer.parseInt(milih);	
                        try{
                        switch(pilihan){
				case 1 :                                    
                                        Scanner masukLoket = new Scanner(System.in);
                                    try{
					System.out.println("Menu loket");
					System.out.println("Masukkan nomor transaksi: ");
					nomorTransaksi = masukLoket.next();
					System.out.println("Masukkan nomor kereta : ");
					 noKA = masukLoket.next();					
					System.out.println("Masukkan nama kereta : ");
					namaKA = masukLoket.next();
					System.out.println("Masukkan tanggal keberangkatan : ");
					tglBerangkat = masukLoket.next();
                                        System.out.println("Masukkan stasiun asal keberangkatan : ");
					stasiunAsal = masukLoket.next();
                                        System.out.println("Masukkan stasiun kedatangan : ");
					stasiunTiba = masukLoket.next();
                                        System.out.println("Masukkan kategori kelas penumpang  : ");
					kategoriPenumpang = masukLoket.next();
                                        System.out.println("Masukkan nama penumpang : ");
					nama = masukLoket.next();
                                        System.out.println("Masukkan nomor identitas penumpang : ");
					noIdentitas = masukLoket.next();
                                        System.out.println("Masukkan tanggal pemesanan : ");
					tglPemesanan = masukLoket.next();
                                        System.out.println("Masukkan jam pemesanan : ");
					jamPesan = masukLoket.nextDouble();
                                        System.out.println("Masukkan nomor tempat duduk : ");
					noTempatDuduk = masukLoket.next();
                                        System.out.println("Masukkan jumlah kelas kategori penumpang : ");
					jumlahKategori = masukLoket.nextInt();
                                        System.out.println("Masukkan harga tiket : ");
					Harga = masukLoket.nextDouble();                                        
                                        System.out.println("Masukkan biaya admin : ");                                        
					biayaAdmin = masukLoket.nextDouble();
					inputTransaksi.SimpanTransaksi(nomorTransaksi, noKA, namaKA, tglBerangkat, stasiunAsal, stasiunTiba,nama, noIdentitas, jamPesan, tglPemesanan, noTempatDuduk, kategoriPenumpang, jumlahKategori, Harga,biayaAdmin);
                                        } catch(Exception e){
                                            System.out.println("input biaya admin,harga,jam harus berupa angka");
                                        }
				break;
				case 2 :					
					System.out.println("--------------CETAK TIKET-----------------------------");
                                    for (Transaksi trs : inputTransaksi.getTransaksi()) { 
                                        System.out.println("Nomor kereta : " + trs.getNoKA()); 
                                        System.out.println("Nama kereta  : " + trs.getNamaKA());
                                        System.out.println("tanngal keberangkatan  : " + trs.getTglBerangkat());
                                        System.out.println("Stasiun keberangkatan    : " + trs.getStasiunAsal());
                                        System.out.println("Stasiun kedatangan    : " + trs.getStasiunTiba());                                        
                                        System.out.println("kelas    : " + trs.getKategoriPenumpang());                                        
                                        System.out.println("nama penumpang    : " + trs.getNama());
                                        System.out.println("nomor identitas    : " + trs.getNoIdentitas());
                                        System.out.println("jam pesan    : " + trs.getJamPesan());
                                        System.out.println("tanggal pemesanan    : " + trs.getTglPemesanan());
                                        System.out.println("nomor tempat duduk    : " + trs.getNoTempatDuduk());
                                        System.out.println("kategori penumpang    : " + trs.getKategoriPenumpang());
                                        System.out.println("jumlah Kategori    : " + trs.getJumlahKategori());                                        
                                        System.out.println("harga    : " + trs.getHarga());
                                        System.out.println("biaya admin    : " + trs.getBiayaAdmin());
                                        System.out.println("total biaya    : " + trs.getTotal());
                                    System.out.println("-----------------------------");
                                }
				break;
                                case 3 :                                    
                                    mu.mainMenu();
                                    break;
				default : System.out.println("menu tidak ada");
				break;
			}
                        }catch(Exception e){
                            System.out.println("harus input dengan angka");
                            mlkt.LoketOn();
                        }						
		}while(v!=3);
	}
}