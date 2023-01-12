package transport.Classification;

public enum ClassificationPassengerCar {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    MINIVAN("Минивен"),
    VAN("Фургон"),
    OFF_ROAD_CAR("Внедорожник"),
    PICKUP_TRACK("Пикап"),
    CROSSOVER("Кроссовер");

    private final String bodyType;

    ClassificationPassengerCar(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyType;
    }
}
