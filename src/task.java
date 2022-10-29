public class task {
    public static void main(String[] args ) {
        old_phone old_phone = new old_phone();
        old_phone.setColor("White");
        old_phone.setModel("VEF TA-68" + '\n');
        old_phone.ring();
        phone cell_phone = new phone();
        cell_phone.setColor("Black");
        cell_phone.setModel("NOKIA 3310");
        cell_phone.setFunctions("Calls, SMS, Timer, Calculator" + '\n' );
        cell_phone.ring();
        cell_phone.cell_ring();
        smartphone smartphone = new smartphone();
        smartphone.setColor("Graphite");
        smartphone.setModel("Samsung Galaxy S22+");
        smartphone.setFunctions("Calls, SMS, 5G, Fast Charging & much more!" + '\n');
        smartphone.setModules("Camera, S Pen (Stylus), DualSIM, and that's not all!" + '\n');
        smartphone.ring();
        smartphone.smart_ring();








    }
}











