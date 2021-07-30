package models;

public class Movements {

    private String detail;
    private Float amount;

    public Movements() {
        this.detail = "Algun movimiento";
        this.amount = 541.22f;
    }

    public Movements(String detail, Float amount) {
        this.detail = detail;
        this.amount = amount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Movements{" +
                "detail='" + detail + '\'' +
                ", amount=" + amount +
                '}';
    }
}
