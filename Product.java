package Inventory;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Product {
    Scanner input = new Scanner(System.in);
    int total;
    
    int[]idbarang = new int[100];
    String[]nama = new String[100];
    int[]harga = new int[100];
    int[]stok = new int[100];
    int[]nilai = new int[100];
    
    public Product(){
        
    }
    
    private void inputData(){
        try{
            for(int i = 0; i < total; i++){
                System.out.println("Produk nomor -"+(i+1));
                System.out.println("produk nama, tekan 0 untuk batal : ");
                
                input.nextLine();
                idbarang[i]= i+1;
                nama[i]=input.nextLine();
                
                if(nama[i].equals("0")){
                    break;
                }
                
                System.out.println("Harga Produk : ");
                harga[i] = input.nextInt();
                System.out.println("Stok Produk : ");
                stok[i] = input.nextInt();
                nilai[i] = stok[i]*harga[i];
            }
        }catch(InputMismatchException e){
            System.out.println("Input anda harus angka");
            input.nextLine();
            menu();
        }
    }
    
    public void menu(){
        do{
            System.out.println("Masukkan jumlah produk : ");
            total = input.nextInt();
            
            if(total <= 0){
                System.out.println("Masukkan lebih dari 0");
            }else{
                inputData();
            }
        }while(total <= 0);
    }
    
    public void getNilaiData(){
        for(int i = 0; i < total; i++){
            System.out.println("Id Barang : "+ idbarang[i]);
            System.out.println("Nama Produk : "+ nama[i]);
            System.out.println("Harga Produk : "+ harga[i]);
            System.out.println("Stok Produk : "+ stok[i]);
            System.out.println("Nilai Produk : "+ nilai[i]);
        }
    }
}
