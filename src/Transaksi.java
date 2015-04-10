/**
 * 
 * @author ajie
 */
public class Transaksi{
                private String noTransaksi;

    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }
		private String noKA;
		private String namaKA;	
		private String tglBerangkat;
		private String stasiunAsal;
		private String stasiunTiba;		
		private String nama;
		private String noIdentitas;
                private double jamPesan;
		private String tglPemesanan;		
		private String noTempatDuduk;
		private String kategoriPenumpang;		
		private int jumlahKategori;
		private double Harga;
		private double jumlah;
		private double biayaAdmin;		 		
		private double total;    

    public String getNoKA() {
        return noKA;
    }

    public void setNoKA(String noKA) {
        this.noKA = noKA;
    }

    public String getNamaKA() {
        return namaKA;
    }

    public void setNamaKA(String namaKA) {
        this.namaKA = namaKA;
    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public void setTglBerangkat(String tglBerangkat) {
        this.tglBerangkat = tglBerangkat;
    }

    public String getStasiunAsal() {
        return stasiunAsal;
    }

    public void setStasiunAsal(String stasiunAsal) {
        this.stasiunAsal = stasiunAsal;
    }

    public String getStasiunTiba() {
        return stasiunTiba;
    }

    public void setStasiunTiba(String stasiunTiba) {
        this.stasiunTiba = stasiunTiba;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    public double getJamPesan() {
        return jamPesan;
    }

    public void setJamPesan(double jamPesan) {
        this.jamPesan = jamPesan;
    }

    public String getTglPemesanan() {
        return tglPemesanan;
    }

    public void setTglPemesanan(String tglPemesanan) {
        this.tglPemesanan = tglPemesanan;
    }

    public String getNoTempatDuduk() {
        return noTempatDuduk;
    }

    public void setNoTempatDuduk(String noTempatDuduk) {
        this.noTempatDuduk = noTempatDuduk;
    }

    public String getKategoriPenumpang() {
        return kategoriPenumpang;
    }

    public void setKategoriPenumpang(String kategoriPenumpang) {
        this.kategoriPenumpang = kategoriPenumpang;
    }

    public int getJumlahKategori() {
        return jumlahKategori;
    }

    public void setJumlahKategori(int jumlahKategori) {
        this.jumlahKategori = jumlahKategori;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }

    public double getJumlah() {
        return jumlahKategori * Harga;
    }    
        
    
    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public double getTotal() {
        return getJumlah() + biayaAdmin;
    }    																
		public Transaksi(String noTransaksi,String noKA,String namaKA,String tglBerangkat,String stasiunAsal,String stasiunTiba,String nama,String noIdentitas,double jamPesan,String tglPemesanan,String noTempatDuduk,String kategoriPenumpang,int jumlahKategori,double Harga,double biayaAdmin) {
					this.noTransaksi = noTransaksi;
                                        this.noKA=noKA;
					this.namaKA=namaKA;
					this.tglBerangkat = tglBerangkat;
					this.stasiunAsal = stasiunAsal;
					this.stasiunTiba = stasiunTiba;					
					this.nama = nama;
					this.noIdentitas = noIdentitas;
					this.jamPesan = jamPesan;
					this.tglPemesanan = tglPemesanan;					
					this.noTempatDuduk = noTempatDuduk;
					this.kategoriPenumpang = kategoriPenumpang;
					this.jumlahKategori = jumlahKategori;
					this.Harga = Harga;					
					this.biayaAdmin = biayaAdmin;										
                }		
		/*public String toString () {
					return "  nama : "+nama+"   jeniskelamin: "+jeniskelamin+"   umur: "+umur;
					}*/
}