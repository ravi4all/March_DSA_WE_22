package ArrayProblems;

public class WaterTrappingProblem {
    public static void main(String[] args) {
        int pillars[] = {0,1,0,2,1,3,0,2};
        int n = pillars.length;
        if(n == 0) {
            System.out.println("No pillars exists...");
        }

        int []leftPillarsMax = new int[n];  // Prefix Max
        int []rightPillarsMax = new int[n]; // Suffix Max

        leftPillarsMax[0] = pillars[0];
        rightPillarsMax[n-1] = pillars[n-1];

        for (int i = 1; i < n; i++)  {
            leftPillarsMax[i] = Math.max(leftPillarsMax[i-1], pillars[i]);
        }

        for(int i = n - 2; i >= 0; i--) {
            rightPillarsMax[i] = Math.max(rightPillarsMax[i+1], pillars[i]);
        }

        int amount = 0;
        for(int i = 0; i < n; i++) {
            int currentPillar = pillars[i];
            int decidingHeight = Math.min(leftPillarsMax[i], rightPillarsMax[i]);
            if(decidingHeight > currentPillar) {
                amount += decidingHeight - currentPillar;
            }
        }

        System.out.println("Amount of water is :: " + amount);

    }
}
