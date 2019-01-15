/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan53.rabbit;

/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripsi Program : program ini berisi tentang profil dari seekor binatang
 */
public class PBO6K10116228Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Rabbit rabbit = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, his name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "+rabbit.isiVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}