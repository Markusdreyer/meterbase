public class Client {


    public static void main(String[] args) {

        MeterArchive m = new MeterArchive();
        m.meterList.add(new Clock("K1234", "R24H3", true, 0.001));
        m.meterList.add(new Weight("HM239", "R39H1", true, 1000, 0.1));
        m.meterList.add(new Thermometer("SM384", "R17H4", true, -273.15, 27));
        System.out.println("Overview of instruments:\n");
        m.showList();

    }
        //Uncomment any of the following methods for easy testing

        //m.addInstrument(new Clock("R1G41", "R34H21", false, 0.01));
        //m.deleteInstrument("K1234");
        //m.changeState("K1234", false);
        //m.changePlacement("HM239", "R3H7");
        //m.getInstrument("SM384");


        /*
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("clock.json"));
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(obj);
            for (Object o : jsonArray) {

                JSONObject instrument = (JSONObject) o;

                String strType = (String) instrument.get("type");
                System.out.println(strType);

                String strRegNr = (String) instrument.get("registrationNumber");
                System.out.println("Registration Number: " + strRegNr);

                String strPlacementId = (String) instrument.get("placementId");
                System.out.println("Placement Id: " + strPlacementId);

                boolean strIsWorking = (boolean) instrument.get("isWorking");
                System.out.println("Is Working: " + strIsWorking);

                double strAccuracy = (double) instrument.get("accuracy");
                System.out.println("Accuracy: " + strAccuracy);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }*/

}

