public class Clock extends Meter {
    private double accuracy;

    public Clock(String regNr, String placementId, boolean isWorking, double accuracy) {
        super(regNr, placementId, isWorking);
        this.accuracy = accuracy;
    }

    public Clock() {

    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "Registration Number: " + getRegNr() + "\nPlacement Id: " + getPlacementId() + "\nIs Working: " + getIsWorking() + "\nAccuracy : " + accuracy + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Clock clock = (Clock) o;

        return Double.compare(clock.accuracy, accuracy) == 0;
    }
}
