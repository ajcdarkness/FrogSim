package com.company;
public class FrogSimulation
{
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;

    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;
    public int[] testHops;
    public int nextHopIndex;
    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;

    }

    /** Returns an integer representing the distance, in inches, to be moved when the frog hops.
     */
    public int hopDistance()
    {
        if(nextHopIndex < testHops.length){
            int y = testHops[nextHopIndex];
            nextHopIndex++;
            return y;
        }else{
            return 0;
        }
    }

/********************** Part (a) *************************/

    /** Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the simulation;
     * false otherwise.
     */
    public boolean simulate()
    {
        int hopCount = 0;
        int Distance = 0;
        while(hopCount <= maxHops && Distance >= 0 && Distance <= goalDistance){
            Distance += hopDistance();
            hopCount++;
        }
        return (Distance >= goalDistance);
    }

/********************** Part (b) *************************/

    /** Runs num simulations and returns the proportion of simulations in which the frog
     * successfully reached or passed the goal.
     * Precondition: num > 0
     */
    public double runSimulations(int num)
    {
        int trues = 0;
        for (int i=0;i<num;i++)
        {
            if (simulate())
            {
                trues++;
            }
        }
        double proportions = trues/num;
        return proportions;
    }

}
