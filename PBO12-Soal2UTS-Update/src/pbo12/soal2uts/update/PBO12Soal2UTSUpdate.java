/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12.soal2uts.update;

/**
 *
 * @author user
 */
public class PBO12Soal2UTSUpdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fr.setPaketFitnes(Paket.getSelectedValue().toString());
        //System.out.print(fr.getPaketFitnes());
       String biaya ;
       if (Paket.getSelectedIndex()==0){
           biaya ="450000";
       }else if (Paket.getSelectedIndex()==1){
           biaya ="300000";
       }else if (Paket.getSelectedIndex()==2){
           biaya ="750000";
       }else
           biaya ="1000000";
   //
       cek.setText(" No KTP :"+fr.getNoKtp()+
               "\n Nama : "+fr.getNama()+"\n Jenis Kelamin : "+fr.getJenkel()
               +"\n Handuk : "+fr.getHanduk()+ "\n Cabang : "+fr.getCabang()
               +"\n Paket Fitnes : "+fr.getPaketFitnes()
               +"\n Biaya : "+biaya
    }
    
}
