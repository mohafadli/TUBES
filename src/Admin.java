//import java.util.ArrayList;

/**
 * 
 * @author fadli
 */

public class Admin extends Orang{

    private String nomor_pegawai;
    private String jabatan;    
    
    /*public Admin(String nama, int umur, String jenisKelamin, String alamat) {
        super(nama, umur, jenisKelamin, alamat);
    } */

    public Admin(String nomor_pegawai, String jabatan, String nama, int umur, String jenisKelamin, String alamat) {
        super(nama, umur, jenisKelamin, alamat);
        this.nomor_pegawai = nomor_pegawai;
        this.jabatan = jabatan;
    }
           
    
    
    public void setNomorPegawai(String nomor){
        this.nomor_pegawai = nomor;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public String getnomorPegawai(){
        return nomor_pegawai;
    }
    
    public String getJabatan(){
        return jabatan;
    }   
    
    @Override
    public String toString(){
    return super.toString();
    }

//LAGU LAMA
	/*ArrayList<Orang> listAdmin;
	ArrayList<Orang> listLoket;
	//ArrayList<KeretaApi> listKeretaApi;
		
	public Admin(){		
		listAdmin = new ArrayList();
		listLoket = new ArrayList();
		//listKeretaApi = new ArrayList();
	}
	
	public void simpanAdmin(String nama, int umur,String jenisKelamin, String alamat){
		Orang admin = new Orang(nama,umur,jenisKelamin,alamat);
		listAdmin.add(admin);
	}
	
	public ArrayList<Orang> getALL() { //method untuk mengambil data yang disimpan dalam ArrayList listmahasiswa
        return listAdmin; //mengembalikan nilai dari variabel listmahasiswa
    }
 
    public void deleteData(int index) { //method untuk menghapus data di ArrayList berdasarkan index Arraynya
        listAdmin.remove(index);
    }*/
			
}