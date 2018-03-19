import java.util.ArrayList;
import java.util.List;


public class MeterArchive {
    List<Meter> meterList = new ArrayList<Meter>();

    /*
     * Adds different kind of instruments to meterList
     */
    public void populateList() {
        meterList.add(new Clock("K1234", "R24H3", true, 0.001));
        meterList.add(new Weight("HM239", "R39H1", true, 1000, 0.1));
        meterList.add(new Thermometer("SM384", "R17H4", true, -273.15, 27));
    }


    /*
     * Add instrument
     */
    public void addInstrument(Meter obj) {
        meterList.add(obj);
    }


    /*
     * A foreach loop that runs through all the elements and prints out each element
     */
    public void showList() {
        for(Meter m : meterList) {
            System.out.println(m.toString());
        }
    }

    /*
     * Print out a given instrument with regNr.
     * Returns null if the regNr isn't in the list
     */
    public String getInstrument(String regNr){
        for(Meter m : meterList) {
            if(regNr.equals(m.getRegNr())) {
                return m.toString();
            }
        }
        return null;
    }

    /*
     * Delete instrument using regNr
     * Returns false if regNr isn't in the list
     */
    public boolean deleteInstrument(String regNr) {
        for (Meter m : meterList) {
            if (regNr.equals(m.getRegNr())) {
                meterList.remove(m);
                return true;
            }
        }
        return false;
    }

    /*
     * Changes the placement of an instrument
     * Uses regNr to find a give instrument, and placementId to change it's placement
     */
    public boolean changePlacement(String regNr, String placementId) {
        for(Meter m : meterList) {
            if(regNr.equals(m.getRegNr())) {
                m.setPlacementId(placementId);
                return true;
            }
        }
        return false;
    }

    /*
    * Changes the working state of an instrument.
    * Uses regNr to find a given instrument, and isWorking to change its state
    */
    public boolean changeState(String regNr, boolean isWorking) {
        for(Meter m : meterList) {
            if(regNr.equals(m.getRegNr())) {
                m.setIsWorking(isWorking);
                return true;
            }
        }
        return false;
    }
}
