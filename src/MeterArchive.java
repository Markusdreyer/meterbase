import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MeterArchive {
    private Meter meter = new Meter();
    List<Meter> meterList = new ArrayList<Meter>();


    public void testAddInstruments() {

    }

    public void showList() {
        for(Meter m : meterList) {
            System.out.println(m.toString());
        }
    }


    public String getInstrument(String regNr){
        for(Meter m : meterList) {
            if(regNr == m.getRegNr()) {
                return m.toString();
            }
        }
        return null;
    }

    public boolean deleteInstrument(String regNr) {
        for(Meter m : meterList) {
            if (regNr == m.getRegNr()) {
                meterList.remove(m);
                return true;
            }
        }
        return false;
    }

    public boolean changePlacement(String regNr, String placementId) {
        for(Meter m : meterList) {
            if(regNr == m.getRegNr()) {
                m.setPlacementId(placementId);
                return true;
            }
        }
        return false;
    }

    public boolean changeState(String regNr, boolean isWorking) {
        for(Meter m : meterList) {
            if(regNr == m.getRegNr()) {
                m.setIsWorking(isWorking);
                return true;
            }
        }
        return false;
    }
}
