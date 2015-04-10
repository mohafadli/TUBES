/**
 * 
 * @author rangga
 */

public class KeretaApi{	
	private String nomorKereta;
        private String namaKereta;        
	private String rute;
        private int jumlahGerbong;
        private int jumlahKursi;

	public KeretaApi(String nomorKereta,String namaKereta, String rute, int jumlahGerbong, int jumlahKursi){
		this.nomorKereta = nomorKereta;
                this.namaKereta = namaKereta;
                this.rute = rute;				
                this.jumlahGerbong = jumlahGerbong;
                this.jumlahKursi = jumlahKursi;
	}
        
        public KeretaApi(){}
        
        public void setNamaKereta(String namaKereta){
            this.namaKereta = namaKereta;
        }
        
        public void setJumlahKursi(int jumlahKursi){
            this.jumlahKursi = jumlahKursi;
        }
        
        public void setJumlahGerbong(int jumlahGerbong){
            this.jumlahGerbong = jumlahGerbong;
        }
        
	public int getJumlahGerbong(){
		return this.jumlahGerbong;
	}
        
        public void setRute(String rute){
            this.rute = rute;
        }
        
	public String getNamaKereta(){
		return this.namaKereta;
	}

	public String getRute(){
		return this.rute;
	}                
        
        public int getJumlahKursi(){
		return this.jumlahKursi;
	}

    public String getNomorKereta() {
        return nomorKereta;
    }
        
			
	public String toString(){
		String temp = "Nomor Kereta Api : "+this.nomorKereta+"\n"
                             + "Nama kereta api : "+this.namaKereta+"\n"+
			      ", Rute : "+this.rute+"\n"+
                               ", jumlah gerbong : "+this.jumlahGerbong+"\n"+
                                ", jumlah kursi : "+this.jumlahKursi;
		return temp;
	}
}