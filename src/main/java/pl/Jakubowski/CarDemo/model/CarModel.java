package pl.Jakubowski.CarDemo.model;

import java.time.LocalDate;
import java.util.Date;

public class CarModel {
    private Long id;
    private String model;
    private String marka;
    private String kolor;
    private String typNadwozia;
    private double cena;
    private LocalDate rocznik;

    public CarModel(){}
    public CarModel(Long id, String model, String marka, String kolor, String typNadwozia, double cena, LocalDate rocznik) {
        this.id = id;
        this.model = model;
        this.marka = marka;
        this.kolor = kolor;
        this.typNadwozia = typNadwozia;
        this.cena = cena;
        this.rocznik = rocznik;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getTypNadwozia() {
        return typNadwozia;
    }

    public void setTypNadwozia(String typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public LocalDate getRocznik() {
        return rocznik;
    }

    public void setRocznik(LocalDate rocznik) {
        this.rocznik = rocznik;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                ", typNadwozia='" + typNadwozia + '\'' +
                ", cena=" + cena +
                ", rocznik=" + rocznik +
                '}';
    }
}
