/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rangga
 */
import java.util.*;

public class ControllerLoket {
     //loket
                double jamPesan,Harga,jumlah,biayaAdmin,total;
		String noTransaksi,noKA,namaKA,tglBerangkat,stasiunAsal,stasiunTiba,kelas,nama,noIdentitas,tglPemesanan,noTempatDuduk,kategoriPenumpang;
                int jumlahKategori;
                //---                
                ArrayList<Transaksi> listTransaksi;                
                
                public ControllerLoket(){
                    listTransaksi = new ArrayList();                    
                }		
	public void SimpanTransaksi(String noTransaksi,String noKA,String namaKA,String tglBerangkat,String stasiunAsal,String stasiunTiba,String nama,String noIdentitas,double jamPesan,String tglPemesanan,String noTempatDuduk,String kategoriPenumpang,int jumlahKategori,double Harga,double biayaAdmin) {
        Transaksi trs = new Transaksi(noTransaksi,noKA,namaKA,tglBerangkat,stasiunAsal,stasiunTiba,nama,noIdentitas,jamPesan,tglPemesanan,noTempatDuduk,kategoriPenumpang,jumlahKategori,Harga,biayaAdmin); 
        boolean already_exists = false; 
        for (Transaksi object : listTransaksi) { 
            if (object.getNoTransaksi().equals(noTransaksi)) { 
                already_exists = true; 
                System.out.println("data sudah ada");
                break; 
            }
        }
        
        
        
        if (listTransaksi.isEmpty()) { 
            listTransaksi.add(trs);
        }else if (!listTransaksi.isEmpty() && !already_exists) { 
            listTransaksi.add(trs);
        }
    }        
             
        
    public ArrayList<Transaksi> getTransaksi() { 
        return listTransaksi; 
    }
 
    public void deleteTransaksi(String nama) { 
        listTransaksi.remove(nama);
    }
            
}
