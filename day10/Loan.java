package day10;

public class Loan {
    private long loanNo;
    private int principle;
    private float roi;

    public Loan(long loanNo, int principle, float roi) {
        this.loanNo = loanNo;
        this.principle = principle;
        this.roi = roi;
    }

    public long getLoanNo() {
        return loanNo;
    }

    public int getPrinciple() {
        return principle;
    }

    public float getRoi() {
        return roi;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanNo=" + loanNo +
                ", principle=" + principle +
                ", roi=" + roi +
                '}';
    }
}
