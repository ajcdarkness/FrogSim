package com.company;

public class FrogRun {
    private int[] testhops;
    private int nextHopIndex;

    public static void main(String[] args){
        int[][] hopSequences = {{8,3,5,1,7},
        {2,4,56,7,8},
        {1,9,-2,4,6},{2,9,1,5,4}};

        FrogSimulation sim = new FrogSimulation(24,5);

        for(int i = 0; i < hopSequences.length; i++){
            sim.testHops = hopSequences[i];
            sim.nextHopIndex = 0;
            System.out.println("Simulation # " + i+1+ ": " + sim.simulate());
        }
        sim.testHops = hopSequences[0];
        sim.nextHopIndex = 0;
        System.out.println(sim.runSimulations(10));
    }
}
