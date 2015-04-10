/**
 * 
 * @author aries
 */

public class Kursi{
	private String namaKereta;
        private String jumlahKursi;
	
	public Kursi(String namaKereta, String jumlahKursi){
            this.namaKereta = namaKereta;
            this.jumlahKursi = jumlahKursi;
        }
        
        public void setNamaKereta(String namaKereta){
            this.namaKereta = namaKereta;
        }
	
        public void setJumlahKursi(String jumlahKursi){
            this.jumlahKursi = jumlahKursi;
        }
        
	public String getJumlahKursi(){
		return this.jumlahKursi;
	}
	
	public String toString(){
		String temp = "Nama Kereta Api : "+this.namaKereta+
			      ", nomor kursi : "+this.jumlahKursi;
		return temp;
	}
}