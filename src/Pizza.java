public class Pizza {
    String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough){ this.dough = dough; }
    public void setSauce(String sauce){ this.sauce = sauce; }
    public void setTopping(String topping){ this.topping = topping; }

    @Override
    public String toString() {
        return "Ciasto: " + dough +  " / Sos: " + sauce + " / Dodatki: " + topping;
    }
}
