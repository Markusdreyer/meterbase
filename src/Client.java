public class Client {


    public static void main(String[] args) {
        MeterArchive m = new MeterArchive();
        m.meterList.add(new Clock("K1234", "R24H3", true, 0.001));
        m.meterList.add(new Weight("HM239", "R39H1", true, 1000, 0.1));
        m.meterList.add(new Thermometer("SM384", "R17H4", true, -273.15, 27));
        m.showList();
    }
}
