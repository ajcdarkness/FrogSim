package com.company;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
        int hopCount = 1;
        int frogPos = 0;
    }
    private int hopDistance(){

        int hoppy = (int)(Math.random() *10);
        return hoppy;
    }

    public boolean simulate(){
        while(frogPos < goalDistance || hopCount <= maxHops || frogPos < 0){
            frogPos = frogPos + hopDistance();
            if(frogPos < 0){
                return false;
            }else if(frogPos >= goalDistance)
            { return true;
            }if(hopCount == maxHops && frogPos < goalDistance){
                return false;
            } hopCount++;
        }
        return false;
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
