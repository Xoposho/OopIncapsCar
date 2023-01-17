package Mechanics;

import transport.Transport;

import java.util.Objects;

public class Mechanics {

    private String fullName;
    private TypeRepair typeCarRepair1;
    private TypeRepair typeCarRepair2;
    private TypeRepair typeCarRepair3;
    private String comp;

    public Mechanics(String fullName, String comp, TypeRepair typeCarRepair1) {
        this.fullName = fullName;
        this.typeCarRepair1 = typeCarRepair1;
        this.comp = comp;
    }

    public Mechanics(String fullName, String comp, TypeRepair typeCarRepair1, TypeRepair typeCarRepair2) {
        this.fullName = fullName;
        this.typeCarRepair1 = typeCarRepair1;
        this.typeCarRepair2 = typeCarRepair2;
        this.comp = comp;

    }

    public Mechanics(String fullName, String comp, TypeRepair typeCarRepair1, TypeRepair typeCarRepair2, TypeRepair typeCarRepair3) {
        this.fullName = fullName;
        this.typeCarRepair1 = typeCarRepair1;
        this.typeCarRepair2 =typeCarRepair2;
        this.typeCarRepair3 =typeCarRepair3;
        this.comp = comp;
    }

    public void startTO(){
        System.out.println(getFullName() + " из компании " + getComp() + " проводит техобслуживание.");
    }

    public void repairMachine(){
        System.out.println(getFullName() + " из компании " + getComp() + " чинит автомобиль.");
    }

    @Override
    public String toString() {
        return "Механик " + fullName +
                ". Работает в компании - " + comp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(fullName, mechanics.fullName) && typeCarRepair1 == mechanics.typeCarRepair1 && typeCarRepair2 == mechanics.typeCarRepair2 && typeCarRepair3 == mechanics.typeCarRepair3 && Objects.equals(comp, mechanics.comp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, typeCarRepair1, typeCarRepair2, typeCarRepair3, comp);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public TypeRepair getTypeCarRepair1() {
        return typeCarRepair1;
    }

    public void setTypeCarRepair1(TypeRepair typeCarRepair1) {
        this.typeCarRepair1 = typeCarRepair1;
    }

    public TypeRepair getTypeCarRepair2() {
        return typeCarRepair2;
    }

    public void setTypeCarRepair2(TypeRepair typeCarRepair2) {
        this.typeCarRepair2 = typeCarRepair2;
    }

    public TypeRepair getTypeCarRepair3() {
        return typeCarRepair3;
    }

    public void setTypeCarRepair3(TypeRepair typeCarRepair3) {
        this.typeCarRepair3 = typeCarRepair3;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

}
