public class phone extends old_phone {
    private String functions;
    public String getFunctions() {
        return functions;}
    public void setFunctions(String functions) {
        this.functions = functions;}


    void cell_ring() {
        System.out.println("It has functions: " + functions);
    }
}
