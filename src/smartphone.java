public class smartphone extends phone {
    private String functions;
    private String modules;

    @Override
    public String getFunctions() {
        return functions;
    }
    public String getModules() {
        return modules;
    }
    public void setModules(String modules) {
        this.modules = modules;
    }
    @Override
    public void setFunctions(String functions) {
        this.functions = functions;
    }

    void smart_ring() {
        System.out.println("It has " + modules + "It has functions: " + functions);
    }
}