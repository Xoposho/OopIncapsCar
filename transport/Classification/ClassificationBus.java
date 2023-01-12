package transport.Classification;

public enum ClassificationBus {
    ESPECIALLY_SMALL(0,10),
    SMALL(10,25),
    MEDIUM(40, 50),
    BIG(60, 80),
    ESPECIALLY_BIG(100, 120);


    private final int seatCountMin;
    private final int seatCountMax;


    ClassificationBus(Integer sitCountMin, Integer sitCountMax) {
        this.seatCountMin = sitCountMin;
        this.seatCountMax = sitCountMax;
    }

    public int getSitCountMin() {
        return seatCountMin;
    }

    public int getSitCountMax() {
        return seatCountMax;
    }

    @Override
    public String toString() {
            return "Минимальное количество мест - " + seatCountMin +
                    ", максимальное еоличество мест - " + seatCountMax;
    }
}
