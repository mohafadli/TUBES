/**
 * 
 * @author ajie
 */
public class Gerbong{
	private String namaKereta;
        private int jumlahGerbong;    	
	public Gerbong(String namaKereta,int jumlahGerbong){
            this.namaKereta = namaKereta;
            this.jumlahGerbong = jumlahGerbong;
        }

        public void setNamaKereta(String namaKereta){
            this.namaKereta = namaKereta;
        }
        
        public void setKodeGerbong(String kodeGerbong){
            this.namaKereta = kodeGerbong;
        }
        
        public String getNamaKereta(){
		return this.namaKereta;
	}
        
	public int getKodeGerbong(){
		return this.jumlahGerbong;
	}		
        
        public String toString(){
		String temp = "Nama Kereta Api : "+this.namaKereta+"\n"+
			      ", kode gerbong : "+this.jumlahGerbong+"\n";
		return temp;
	}
}