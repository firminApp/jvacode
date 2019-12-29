package tppoo;

/**
 * classe of phone
 * @param
 * @author firmin
 *
 */

public class Phone {

    private String mark;
    private int price;
    private int ram;

    /**
     * default constructor
     */
    public Phone(){

        System.out.print("Je suis le constructeur par defaut, je ne prend aucun paramettre");
    }

    /**
     * constructor with parameters
     * each params is initialize in this constructor
     * @param phoneMark
     * @param phonePrice
     * @param phoneRam
     */
    public Phone(String phoneMark,int phonePrice, int phoneRam){
        System.out.print("Je suis le constructeur avec paramettres? je prend axacteent paramettre");
        this.mark=phoneMark;
        this.price=phonePrice;
        this.ram=phoneRam;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public int somme(){
        return price+ram;
    }
}
