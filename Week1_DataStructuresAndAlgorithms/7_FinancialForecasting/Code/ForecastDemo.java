public class ForecastDemo {
    public static void main(String[] args) {
        FinancialForecaster forecaster = new FinancialForecaster();

        double presentValue = 10000.0; 
        double growthRate = 0.10;      
        int years = 5;

        double futureValue = forecaster.predictFutureValue(presentValue, growthRate, years);
        System.out.printf("Predicted Future Value after %d years: Rs. %.2f%n", years, futureValue);
    }
}
