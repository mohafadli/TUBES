/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klompokKreta
 */
public class loginLoket {
    public void loginLoket(String nama, String jabatan, String passw){              
        menuLoket mlkt = new menuLoket();
        menuUtama mu = new menuUtama();
        
        if ("aries".equals(nama) && "ajie".equals(nama) && "rangga".equals(nama) && "fadli".equals(nama) && "admin".equals(jabatan) && "adm".equals(passw)) {
            mlkt.LoketOn();
        } else {
            System.out.println("salah, masukkan lagi data");
            mu.mainMenu();
        }
        
    }
}
