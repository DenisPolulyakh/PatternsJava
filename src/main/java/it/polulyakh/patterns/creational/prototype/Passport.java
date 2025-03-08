package it.polulyakh.patterns.creational.prototype;

public class Passport implements Cloneable{
    private String number;
    private String series;

    public Passport(String number, String series) {
        this.number = number;
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Passport clone() throws CloneNotSupportedException {
        return (Passport) super.clone();
    }
}
