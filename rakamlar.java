/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romarakamları;

public class rakamlar {
    private String romaRakami;
    private int normalSayi;

    public String getRomaRakami() {
        return romaRakami;
    }

    public void setRomaRakami(String romaRakami) {
        this.romaRakami = romaRakami;
    }

    public void setNormalSayi(int normalSayi) {
        this.normalSayi = normalSayi;
    }

    public int getNormalSayi() {
        return normalSayi;
    }
    
    rakamlar(String romaRakami){
        this.romaRakami = romaRakami;
    }
    
    rakamlar(){
        
    }
    
    public int harfiSayiyaDonustur(char karakter){
        if(karakter == 'I'){
            return 1;
        } else if(karakter == 'V'){
            return 5;
        }else if(karakter == 'X'){
            return 10;
        }else if(karakter == 'L'){
            return 50;
        }else if(karakter == 'C'){
            return 100;
        }else if(karakter == 'D'){
            return 500;
        }else if(karakter == 'M'){
            return 1000;
        } else{
            return 0;
        }
    }
    
    public int normalSayiyaDonustur(String romaRakami){
        
        int normalSayi = 0;
        
        for(int i=0; i<romaRakami.length(); i++){
            int ilkHarf = harfiSayiyaDonustur(romaRakami.charAt(i));
            if(i+1<romaRakami.length()){
              int ikinciHarf = harfiSayiyaDonustur(romaRakami.charAt(i+1));
              if(ilkHarf >= ikinciHarf){
                  normalSayi = normalSayi + ilkHarf;
              } else{
                  normalSayi = normalSayi + ikinciHarf - ilkHarf;
                  i++;
              } 
            } else{
                normalSayi = normalSayi + ilkHarf;
            }
        }
        this.normalSayi = normalSayi;
        return normalSayi;
    }
    
    public String romaRakaminaDonustur(int normalSayi){
        
        String romaRakami = "";
        
        while(normalSayi>=1000){
            romaRakami+= "M";
            normalSayi-= 1000;
        }
        while(normalSayi>=900){
            romaRakami+= "CM";
            normalSayi-= 900;
        }
        while(normalSayi>=500){
            romaRakami+= "D";
            normalSayi-= 500;
        }
        while(normalSayi>=400){
            romaRakami+= "CD";
            normalSayi-= 400;
        }
        while(normalSayi>=100){
            romaRakami+= "C";
            normalSayi-= 100;
        }        
        while(normalSayi>=90){
            romaRakami+= "XC";
            normalSayi-= 90;
        }        
        while(normalSayi>=50){
            romaRakami+= "L";
            normalSayi-= 50;
        }   
        while(normalSayi>=40){
            romaRakami+= "XL";
            normalSayi-= 40;
        }        
        while(normalSayi>=10){
            romaRakami+= "X";
            normalSayi-= 10;
        }    
        while(normalSayi>=9){
            romaRakami+= "IX";
            normalSayi-= 9;
        }    
        while(normalSayi>=5){
            romaRakami+= "V";
            normalSayi-= 5;
        }    
        while(normalSayi>=4){
            romaRakami+= "IV";
            normalSayi-= 4;
        }        
        while(normalSayi>=1){
            romaRakami+= "I";
            normalSayi-= 1;
        }
        return romaRakami;
    }
    
    public String romaRakamlariTopla(String rokaRakami, String romaRakami2){
        
        int normalToplam = normalSayiyaDonustur(romaRakami) + normalSayiyaDonustur(romaRakami2);
        
        return romaRakaminaDonustur(normalToplam);
        
    }

    public boolean kurallar(String romaRakami){
        
     
        
       if(romaRakami.length()>3){
           for(int i=0;i<romaRakami.length()-3;i++){
               if(romaRakami.charAt(i)==romaRakami.charAt(i+1) && romaRakami.charAt(i+1)== romaRakami.charAt(i+2) && romaRakami.charAt(i+2)==romaRakami.charAt(i+3)){
                   System.out.println("Bir rakam en fazla 3 kez yan yana yazılabilir");
                   return false;
               }else 
                   return true;
           }
           
           return true;
           
       } else 
           return true ;
           
    }
}
