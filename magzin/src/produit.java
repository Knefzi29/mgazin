import java.util.Date;
public class produit {
    private int id ;
    private  String lib;
    private  String marque;
    private  double prix;
    private  Date dt;
    public produit(){}
    public produit(int id, String lib, String marque, double prix) {
        this.id = id;
        this.lib = lib;
        this.marque = marque;
        this.prix = prix;
    }
    public produit(int id, String lib, String marque) {
        this.id = id;
        this.lib = lib;
        this.marque = marque;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLib() {
        return lib;
    }
    public void setLib(String lib) {
        this.lib = lib;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Date getDt() {
        return this.dt;
    }
    public void setDt(Date dt) {
        this.dt = dt;
    }
    public void afficher(){
        System.out.println("id : " + id + " lib : " + lib + " marque : " + marque+" prix : " + prix+" dt : " + dt);
    }
   public String toString() {
       return "id:"+this.id+" lib:"+this.lib+" marque:"+this.marque+" prix:"+this.prix;
    }

}

