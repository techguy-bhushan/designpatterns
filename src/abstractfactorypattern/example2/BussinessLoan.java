package abstractfactorypattern.example2;

/**
 * Created by bhushan on 20/3/17.
 */
public class BussinessLoan extends Loan {
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
