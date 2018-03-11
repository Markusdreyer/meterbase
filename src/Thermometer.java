public class Thermometer extends Meter {
    private double lowestTemp;
    private double highestTemp;

    public Thermometer(String regNr, String placementId, boolean isWorking, double lowestTemp, double highestTemp) {
        super(regNr, placementId, isWorking);
        this.lowestTemp = lowestTemp;
        this.highestTemp = highestTemp;
    }

    public Thermometer() {

    }

    public double getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(double highestTemp) {
        this.highestTemp = highestTemp;
    }

    public double getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(double lowestTemp) {
        this.lowestTemp = lowestTemp;
    }

    @Override
    public String toString() {
        return "Registration Number: " + getRegNr() + "\nPlacement Id: " + getPlacementId() + "\nIs Working: " + getIsWorking() + "\nLowest Temperature: " + lowestTemp + "\nHighest Temperature: " + highestTemp + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thermometer that = (Thermometer) o;

        if (Double.compare(that.lowestTemp, lowestTemp) != 0) return false;
        return Double.compare(that.highestTemp, highestTemp) == 0;
    }
}
