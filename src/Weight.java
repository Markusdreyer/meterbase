public class Weight extends Meter {
    private double maximumLoad;
    private double minimumLoad;

    public Weight(String regNr, String placementId, boolean isWorking, double maximumLoad, double minimumLoad) {
        super(regNr, placementId, isWorking);
        this.maximumLoad = maximumLoad;
        this.minimumLoad = minimumLoad;
    }

    public Weight() {

    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public double getMinimumLoad() {
        return minimumLoad;
    }

    public void setMinimumLoad(double minimumLoad) {
        this.minimumLoad = minimumLoad;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +  "\nRegistration Number: " + getRegNr() + "\nPlacement Id: " + getPlacementId() + "\nIs Working: " + getIsWorking() + "\nMaximum Load: " + maximumLoad + " gram" + "\nMinimum Load: " + minimumLoad + " gram" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weight weight = (Weight) o;

        if (Double.compare(weight.maximumLoad, maximumLoad) != 0) return false;
        return Double.compare(weight.minimumLoad, minimumLoad) == 0;
    }
}
