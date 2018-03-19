public class Client {

    /*
     * Create a MeterArchive and populates it with MeterArchives populateList() method.
     *  Prints out the list using MeterArchives showList() method.
     *  additional methods are commented underneath for testing.
     */
    public static void main(String args[]) {
        MeterArchive m = new MeterArchive();
        m.populateList();
        System.out.println("Overview of instruments:\n");
        m.showList();
        System.out.println();

        //Uncomment any of the following methods for easy testing

        //m.addInstrument(new Clock("R1G41", "R34H21", false, 0.01));
        //m.deleteInstrument("K1234");
        //m.changeState("K1234", false);
        //m.changePlacement("HM239", "R3H7");
        //m.getInstrument("SM384");
    }
}

