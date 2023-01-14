package transport.Classification;

public enum ClassificationFreightCar {
    N1(null, 3.5F), //по заданию, нам неизвестна нижняя граница :)
    N2(3.6F, 12.0F),
    N3(12.1F, null); //неограниченная грузоподъёмность :)

    private final Float loadCapacityMin;
    private final Float loadCapacityMax;

    ClassificationFreightCar(Float loadCapacityMin, Float loadCapacityMax) {
        this.loadCapacityMin = loadCapacityMin;
        this.loadCapacityMax = loadCapacityMax;
    }

    public Float getLoadCapacityMin() {
        return loadCapacityMin;
    }

    public Float getLoadCapacityMax() {
        return loadCapacityMax;
    }

    @Override
    public String toString() {
        if (getLoadCapacityMax() != null) {
            return "Минимальная грузоподъёмность " + loadCapacityMin +
                    " т., максимальна грузоподъёмность " + loadCapacityMax + " т.";
        } else {
            return "Грузоподъёмность от " + loadCapacityMin + " т.";
        }

    }
}
