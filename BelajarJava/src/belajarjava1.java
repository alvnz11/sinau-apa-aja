package src;
/**
 * belajarjava1
 */
public class belajarjava1 {

    public static void main(String[] args) {

        int nilaiMat = 100; //variabel tipe data int

        System.out.println("Aku Belajar Java"); //ln = 1 line
        System.out.print("ini adalah print biasa"); //print biasa tidak pakai enter
        System.out.println("ini baris ke-3"); 
        System.out.println("ini adalah baris ke empat pakai enter \n"); //memakai \n untuk menambah enter
        System.out.printf("ini adalah baris yang memakai format ==> nilai matematikaku adalah %s dan nilai bahasa inggrisku adalah %d \n" ,nilaiMat, 90); //print memakai format
        
        System.out.println("Baris 1 " + args[0]); /*memakai args harus dicompile
        System.out.println("Baris 2 " + args[1]); harus dijalankan di terminal dan ditambahi kata katanya 
                                                  contoh : java belajarjava1 alvan rega
                                                  output : baris 1 alvan 
                                                           baris 2 rega */

        
    }

}