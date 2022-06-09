/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.informationsystem;

/**
 *
 * @author Dipin
 */

public class GUIINFORMATIONSYSTEM {
    
private String hostel, address,email,Level,category;
private int price;
private long phone;
    /**
     * @param args the command line arguments
     */

public GUIINFORMATIONSYSTEM(String hostel,String address, long phone, String email,int price, String category,String Level){
    this.hostel=hostel;
   this.address = address;
   this.phone = phone;
   this.email = email;
   this.price = price;
   this.category= category;
   this.Level= Level;
}

public String getHostel(){
    return hostel;
}
public String getAddress(){
    return address;
}
public String getEmail(){
    return email;
}
public String getLevel(){
    return Level;
}
public String getCategory(){
    return category;
}
public int getPrice(){
    return price;
}
public long getPhone(){
    return phone;
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
