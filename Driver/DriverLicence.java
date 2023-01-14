package Driver;

public enum DriverLicence {
    B("B"),
    C("C"),
    D("D");

    private final String driveCategory;
    DriverLicence(String driveCategory) {
        this.driveCategory = driveCategory;
    }

    public String getDriveCategory() {
        return driveCategory;
    }

    @Override
    public String toString() {
        return "Категория лицензии водителя - " + driveCategory;
    }
}
