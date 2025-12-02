package Problems;

class MaximumPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        int[] yearCount = new int[2051]; // Covers range up to 2050

        // Step 1: Apply difference array technique
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];

            yearCount[birth] += 1; // Person alive starting birth year
            yearCount[death] -= 1; // Person not alive in death year
        }

        // Step 2: Prefix sum + track max population
        int maxPopulation = 0;
        int year = 1950; // Given constraint: years ≥ 1950
        int currentPopulation = 0;

        for (int i = 1950; i <= 2050; i++) {
            currentPopulation += yearCount[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                year = i; // store earliest max year
            }
        }
        return year;
    }

    public static void main(String[] args) {
        // Example Input
        int[][] logs = {
                { 1950, 1961 },
                { 1960, 1971 },
                { 1970, 1981 }
        };

        int result = maximumPopulation(logs);
        System.out.println("Earliest year with maximum population: " + result);
    }
}
