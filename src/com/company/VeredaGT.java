package com.company;

public class VeredaGT implements Vehicle{
    private final int CARGA_MAXIMA = 100;
    private String matricula;
    private int maxEnergy = CARGA_MAXIMA;
    private float energy;
    private int movementCount = 0;
    private int energyDelta = 5;

    public VeredaGT(float energy) {
        this.energy = energy;
    }

    public int getCARGA_MAXIMA() {
        return CARGA_MAXIMA;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public int getMovementCount() {
        return movementCount;
    }

    public void setMovementCount(int movementCount) {
        this.movementCount = movementCount;
    }

    public int getEnergyDelta() {
        return energyDelta;
    }

    public void setEnergyDelta(int energyDelta) {
        this.energyDelta = energyDelta;
    }

    public VeredaGT(String matricula, int maxEnergy, int movementCount, int energyDelta) {
        this.matricula = matricula;
        this.maxEnergy = maxEnergy;
        this.movementCount = movementCount;
        this.energyDelta = energyDelta;


    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = CARGA_MAXIMA;

    }

    @Override
    public void move() {
        movementCount += 5;

    }

    @Override
    public String status() {
        return "El vehículo " +  matricula + " tiene un nivel de carga de: " +  energy +  " y se ha movido " +  movementCount + ".";
    }

}
