public abstract class Meter {
    private String regNr;
    private String placementId;
    private boolean isWorking;

    public Meter(String regNr, String placementId, boolean isWorking) {
        this.regNr = regNr;
        this.placementId = placementId;
        this.isWorking = isWorking;
    }

    public Meter() {

    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getPlacementId() {
        return placementId;

    }

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    public boolean getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        return "Registration Number: '" + regNr + "\nPlacement Id: " + placementId + "\nIs Working: " + isWorking + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter = (Meter) o;

        if (isWorking != meter.isWorking) return false;
        if (regNr != null ? !regNr.equals(meter.regNr) : meter.regNr != null) return false;
        return placementId != null ? placementId.equals(meter.placementId) : meter.placementId == null;
    }
}
