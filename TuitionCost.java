public class TuitionCost {
    public static void main(String[] args) {

        // Name of the university
        String university = "Massachusetts Institute of Technology";

        // Base tuition cost for the 2019-2020 academic year
        double tuition = 53790.0;

        // Annual tuition increase rate (6%)
        double rate = 0.06;

        // Starting year and ending year for the calculation
        int startYear = 2019;
        int endYear = 2029;  // We want to find tuition for 2029-2030

        // Use a for loop to calculate tuition increase each year
        for (int year = startYear; year < endYear; year++) {
            tuition = tuition * (1 + rate);  // Increase tuition by 6% each year
        }

        // Display the projected tuition cost for 2029-2030
        System.out.println(university + " tuition in the year " + endYear + "-" + (endYear + 1) + " will be: $" + tuition);
    }
}
