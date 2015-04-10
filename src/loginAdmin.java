/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kelompokkreta
 */
public class loginAdmin {
    public void loginAdmin(String nama, String jabatan, String passw){              
        menuAdmin ma = new menuAdmin();
        menuUtama mu = new menuUtama();
        
        if ("aries".equals(nama) && "ajie".equals(nama) && "rangga".equals(nama) && "fadli".equals(nama) && "admin".equals(jabatan) && "adm".equals(passw)) {
            ma.AdminOn();
        } else {
            System.out.println("salah, masukkan lagi data");
            mu.mainMenu();
        }
        
    }   
}
