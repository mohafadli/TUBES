/**
 * 
 * @author rangga
 */

public class Loket extends Orang{

    private String nomor_pegawai;
    private String jabatan;

    public Loket(String nomor_pegawai,String jabatan,String nama, int umur, String jenisKelamin, String alamat) {
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
    return "nomor pegawai loket : "+ nomor_pegawai +"\n"
            + "jabatan pegawai loket: "+ jabatan +"\n"
            +super.toString();
    }      
}		