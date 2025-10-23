import java.util.Date;
public class Main {
    public static void main(String[] args) {
        produit p=new produit();
        System.out.println(p.getDt());
        produit p1=new produit(1021,"lait","delice");
        produit p2=new produit(2510,"yaourt","vitalait");
        produit p3=new produit(3250,"tomate","sicam",1.200);
        p.afficher();
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p1.setId(1021);
        p1.setLib("lait");
        p1.setMarque("deleice");
        p1.setPrix(0.700);
        p1.afficher();
        p1.setDt(new Date(2025,01,20));
        p2.setId(2510);
        p2.setLib("yaourt");
        p2.setMarque("vitalait");
        p2.setPrix(0.500);
        p2.afficher();
        System.out.println(p1.getDt());
    }
}