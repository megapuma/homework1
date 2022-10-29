public class old_phone {
    private String color;
    private String model;
    public String getColor() {
        return color;}
    public String getModel() {
        return model;}
    public void setColor(String color) {
        this.color = color;}
    public void setModel(String model) {
        this.model = model;}
    void ring() {
        System.out.println("RING! It is " + color + " telephone, " + model);}
}