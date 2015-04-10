import java.util.*;

/**
 * 
 * @author fadli 
 */

public class ControllerAdmin{	

                //admin & loket
		int umur;		
                String nama,jenisKelamin,alamat,nomor_pegawai,jabatan;		
                //----
                //kereta api
                int jumlahGerbong,jumlahKursi;
                String namaKereta,rute;
                //---
                ArrayList<Admin> listAdmin;
                ArrayList<Loket> listLoket;
                ArrayList<KeretaApi> listKeretaApi;
                
                public ControllerAdmin(){
                    listAdmin = new ArrayList();
                    listLoket = new ArrayList();
                    listKeretaApi = new ArrayList();
                }		
	public void SimpanAdmin(String nomor_pegawai, String jabatan, String nama, int umur, String jenisKelamin, String alamat) {
        Admin adm = new Admin(nomor_pegawai,jabatan,nama,umur,jenisKelamin,alamat); 
        boolean already_exists = false; 
        for (Admin object : listAdmin) { 
            if (object.getnomorPegawai().equals(nomor_pegawai)) { 
                already_exists = true; 
                System.out.println("data sudah ada");
                break; 
            }
        }
        
        if (listAdmin.isEmpty()) { 
            listAdmin.add(adm); 
        }else if (!listAdmin.isEmpty() && !already_exists) { 
            listAdmin.add(adm); 
        }
    } 
       public void SimpanLoket(String nomor_pegawai, String jabatan, String nama, int umur, String jenisKelamin, String alamat) { //method untuk memasukkan data NIM, Nama, dan Jurusan ke dalam ArrayList
        Loket lkt = new Loket(nomor_pegawai,jabatan,nama,umur,jenisKelamin,alamat); 
        boolean already_exists = false; 
        for (Loket object : listLoket) { 
            if (object.getnomorPegawai().equals(nomor_pegawai)) { 
                already_exists = true; 
                System.out.println("data sudah ada");
                break; 
            }
        }
        
        if (listLoket.isEmpty()) { 
            listLoket.add(lkt); 
        }else if (!listLoket.isEmpty() && !already_exists) { 
            listLoket.add(lkt); 
        }
    }
       
      public void SimpanKereta(String nomorKereta,String namaKereta, String rute, int jumlahKursi, int jumlahGerbong) {
        KeretaApi krt = new KeretaApi(nomorKereta,namaKereta,rute,jumlahKursi,jumlahGerbong);        
        
        boolean already_exists = false; 
        for (KeretaApi object : listKeretaApi) { 
            if (object.getNomorKereta().equals(nomorKereta)) { 
                already_exists = true; 
                System.out.println("data sudah ada");
                break; 
            }
        }
        
        if (listKeretaApi.isEmpty()) { 
            listKeretaApi.add(krt); 
        }else if (!listLoket.isEmpty() && !already_exists) { 
            listKeretaApi.add(krt);
        }
    }
        
    public ArrayList<Admin> getAdmin() { 
        return listAdmin; 
    }
 
    public void deleteAdmin(int index) { 
        listAdmin.remove(index);
    }
    
    
    public ArrayList<Loket> getLoket() { 
        return listLoket; 
    }
 
    public void deleteLoket(int index) { 
        listLoket.remove(index);
    }
    
    public ArrayList<KeretaApi> getKereta() { 
        return listKeretaApi; 
    }
 
    public void deleteDataKereta(int index) { 
        listKeretaApi.remove(index);
    }	
}