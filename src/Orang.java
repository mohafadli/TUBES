/**
 * 
 * @author ajie
 */
public class Orang{
	private String nama;
	private int umur;
	private String jenisKelamin;
	private String alamat;
	
       //public Orang(){}
        
	public Orang (String nama,int umur,String jenisKelamin,String alamat){
		this.nama=nama;
		this.umur = umur;
		this.jenisKelamin=jenisKelamin;
		this.alamat = alamat;
	}
	
        public  void setNama(String nama){
            this.nama = nama;
        }
        public  void setUmur(int umur){
            this.umur = umur;
        }
        public  void setJenisKelamin(String jenisKelamin){
            this.jenisKelamin = jenisKelamin;
        }
        public  void setAlamat(String Alamat){
            this.alamat = Alamat;
        }
	public String getNama() {
		return nama;
	}
	
	public int getUmur() {
		return umur;
	}
	
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	public String toString() {
                String temp = "nama : "+this.nama+"\n"+
                              ",umur: "+this.umur+"\n"+
                              ",jenis kelamin: "+this.jenisKelamin+"\n"+
                              ",alamat : "+this.alamat;
		return temp;		
	}	
}