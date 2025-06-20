public class FinancialForecaster {

    public double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return predictFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }
}
