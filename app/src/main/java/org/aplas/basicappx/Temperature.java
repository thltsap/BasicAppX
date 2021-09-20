package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    public Temperature(){
        this.celcius = 0;
    }

    public void setCelcius(double celcius) {

        this.celcius = celcius;
    }

    public void setFahrenheit(double celcius) {

        this.celcius = (celcius - 32) / 9 * 5;
    }

    public void setKelvins(double celcius) {

        this.celcius = celcius - 273.15;
    }

    public double getCelcius() {

        return celcius;
    }

    public double getFahrenheit() {

        return celcius * 9 / 5 + 32;
    }

    public double getKelvins() {

        return celcius + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "°C":
                setCelcius(value);
                break;
            case "°F":
                setFahrenheit(value);
                break;
            case "K":
                setKelvins(value);
                break;
        }

        double result = 0;
        switch (convUnit) {
            case "°C":
                result = getCelcius();
                break;
            case "°F":
                result = getFahrenheit();
                break;
            case "K":
                result = getKelvins();
                break;
        }

        return result;
    }
}