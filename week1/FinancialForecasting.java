public class FinancialForecasting {
    public static void main(String[] args) {
        double[] revenue = {10000, 12000, 14000, 16000, 18000};
        double forecast = linearForecast(revenue);
        System.out.printf("Next Month Forecast: %.2f\n", forecast);
    }

    public static double linearForecast(double[] revenue) {
        int n = revenue.length;
        double sum = 0, weight = 1, totalWeight = 0;

        for (int i = 0; i < n; i++) {
            sum += revenue[i] * weight;
            totalWeight += weight;
            weight++;
        }
        return sum / totalWeight; 
    }
}
