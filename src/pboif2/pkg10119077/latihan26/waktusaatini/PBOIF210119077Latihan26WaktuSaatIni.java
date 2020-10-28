/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan26.waktusaatini;

import java.util.*;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Menampilkan Waktu Saat Ini
 */
public class PBOIF210119077Latihan26WaktuSaatIni {


    public static void main(String[] args) {
        int detik,menit,jam,tanggal,bulan,tahun,hari;
        
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[]={"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        String namahari[]={"Sabtu","Minggu","Senin","Selasa","Rabu","Kamis","Jumat"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam =  date.get(Calendar.HOUR_OF_DAY);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        hari = date.get(Calendar.DAY_OF_WEEK);
        
        System.out.println("Hari ini adalah hari : "+namahari[hari]+", "+tanggal+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
    }
    
}
