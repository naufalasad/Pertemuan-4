import java.util.*;
public class os1 {
  public static void main (String [] naufal){
  Scanner sc=new Scanner(System.in);  

    int []os;
    
    int rim=0;
    int ios=0;
    int android=0;
    int windows=0;
    int total;
    String simpan="RIM";
    String simpan1="RIM";
    
    System.out.print("Masukan jumlah survei :");
     int survei=sc.nextInt();
     os=new int[survei];
     
    for (int i=0;i<os.length;i++){
    System.out.println("Pilihan Sistem Operasi:");
    System.out.println("1.RIM");
    System.out.println("2.Ios");
    System.out.println("3.Android");
    System.out.println("4.Windows Phone");

      System.out.print("Masukan Sistem Operasi :");
      os[i]=sc.nextInt();
      if (os[i]==1){
        rim+=1;}
      else
      {if(os[i]==2){
        ios+=1;}
      else{if(os[i]==3){
      android+=1;}
      else if (os[i]==4){
       windows+=1;}
      else {
        System.out.println("Gak Niat Mencet");
        }
      }
      }
      }
    
    //cetak array
    for(int i=0;i<os.length;i++){
      switch (os[i]){
       case 1:
      System.out.println("Data Ke-"+(i+1)+" Menggunakan OS RIM");
      break;
       case 2:
      System.out.println("Data Ke-"+(i+1)+" Menggunakan OS iOS");
      break;
       case 3:
      System.out.println("Data Ke-"+(i+1)+" Menggunakan OS Android");
      break;
       case 4:
      System.out.println("Data Ke-"+(i+1)+" Menggunakan OS Windows Phone");
      break;
        default:
          System.out.println("Data Ke-"+(i+1)+" Menggunakan OS Terjadi Kesalahan Saat Input!!");
      }
    }
      System.out.println("==============================================================");
    
      System.out.println("Pengguna OS RIM Sebanyak : "+rim+" Orang");
      System.out.println("Pengguna OS IOS Sebanyak : "+ios+" Orang");
      System.out.println("Pengguna OS Android Sebanyak : "+android+" Orang");
      System.out.println("Pengguna OS Windows Phone Sebanyak : "+windows+" Orang");
      
    //terbesar
    int max=rim;
    if(max<ios){
    max=ios;
    simpan="iOS";}
    if(max<android){
    max=android;
    simpan="Android";}
    if(max<windows){
    max=windows;
    simpan="Windows Phone";}
    //terkecil
    int min=rim;
    if(min>ios){
    min=ios;
    simpan1="iOS";}
    if(min>android){
    min=android;
    simpan1="Android";}
    if(min>windows){
    min=windows;
    simpan1="Windows Phone";}
    
    System.out.println("========================================================================================");
    System.out.println("Sistem Operasi Yang Paling Banyak Digunakan User Adalah "+simpan+" Total Pemakai: "+max);
    System.out.println("Sistem Operasi Yang Paling Sedikit Digunakan User Adalah "+simpan1+" Total Pemakai: "+min);
    /*
    if(max>rim){}
    else{
    if (max>ios){
      max=ios;
      simpan="ios";}
    else if (max>android){
      max=android;
      simpan="android";}
    else if (max>windows){
      max=windows; 
      simpan="windows";}}
    */
    
    
    /*  
    if (rim>ios){
      total=rim;
      System.out.println("Pengguna Terbanyak : " +total+ "rim");}
    
     else if (ios>rim){
      total=ios;
      System.out.println("Pengguna Terbanyak : " +total+"ios");}
    
    else if (android>ios){
    total=android;
    System.out.println("Pengguna Terbanyak : " +total +"Android");}
    
    else if (ios>android){
      total=ios;
      System.out.println("Pengguna Terbanyak : " +total+ "Ios");}
    
    else if (android>windows){
      total=android;
      System.out.println("Pengguna Terbanyak : " +total +"Android");}  
    
    else if (windows>android){
      total=windows;
      System.out.println("Pengguna Terbanyak : " +total +"Adalah Windows");} 
  */
      
    
      //System.out.println("Pengguna Gak Payu : "+min);
 
} 

}

