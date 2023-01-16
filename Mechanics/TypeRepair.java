package Mechanics;

public enum TypeRepair {
    REPAIR_CAR("легковые"),
    REPAIR_TRUCK("грузовые"),
    REPAIR_BUS("транспортные");


    private final String typeMachineRepair;
    TypeRepair(String typeMachineRepair) {
        this.typeMachineRepair = typeMachineRepair;
    }

    @Override
    public String toString() {
        return typeMachineRepair + " машины."  ;
    }


}
