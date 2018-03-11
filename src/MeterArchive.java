import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MeterArchive {
    private Meter meter = new Meter();
    List<Meter> meterList = new ArrayList<Meter>();


    public void testAddInstruments() {
        meterList.add(new Clock("K1234", "R24H3", true, 2.2));
        meterList.add(new Weight("HM239", "R39H1", true, 1000, 0.5));
        meterList.add(new Thermometer("SM384", "R17H4", true, -273.15, 27));
    }

    public void showList() {
        for(Meter m : meterList) {
            System.out.println(m.toString());
        }
    }


    public void getInstrument(String regNr){
        for(Meter m : meterList) {
            if(regNr == m.getRegNr()) {
                System.out.println(m.toString());
            }
        }
    }

    public boolean deleteInstrument(String regNr) {
        for(Meter m : meterList) {
            if (regNr == m.getRegNr()) {
                meterList.remove(m);
                System.out.println("Successfully deleted instrument with regNr " + regNr);
                return true;
            }
        }
        return false;
    }
}
