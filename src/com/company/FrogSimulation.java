package com.company;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance(){

        int hoppy = (int)(Math.random() *10);
        return hoppy;
    }

    public boolean simulate(){

    }
    public double runSimulations(int num, FrogSimulation sim){

        int trues = 0;
        for (int i=0;i<=num;i++)
        {
            if (sim.simulate() = true)
            {
                trues++;
            }
        }
        double proportions = trues/num;
        return proportions;

    }



}
