
package finalodevim1;
public class HesapOlusturma {
    
    String isim;
    int yasim;

    public static void main (String[] args) {
        HesapOlusturma girdi = new HesapOlusturma();
        girdi.setisim("Ertuğrul Kocagöz");
        girdi.setyasim(20);
        System.out.println(girdi.getisim());      
        System.out.println(girdi.getyasim());      
        girdi.Ayrintilar();       
        
    }
    public void setisim(String isim){
    
    this.isim=isim;
    
    }
    public void setyasim(int yasim){
    this.yasim=yasim;
    }
    public String getisim(){
    return this.isim;
    }
    public Integer getyasim(){
    return this.yasim;
}

    
   public void Ayrintilar(){

       System.out.println(isim+","+yasim);
}
}
