package com.gsiguenza;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/****************************************************************************
 * AUTHORS: Gabriel Siguenza, Michael Fogel, Steven Peter Molina
 * COURSE: CS 113
 * Monday 5:30 PM - 9:20 PM
 * Assignment: Final Project
 * PROJECT #: Currency.java
 * LAST MODIFIED: 05/07/2018
 *****************************************************************************/

/**
 * A class to hold digital currency values.
 */
public class Currency implements Comparator<Currency> {
    public static final String DEFAULT_NAME = "no name";
    public static final String DEFAULT_SYMBOL = "NUL";
    public static final double DEFAULT_HIGH = 0.0;
    public static final double DEFAULT_LOW = 0.0;
    public static final double DEFAULT_OPEN = 0.0;
    public static final double DEFAULT_CLOSE = 0.0;
    public static final double DEFAULT_CIRCULATING = 0.0;
    public static final double DEFAULT_MARKET = 0.0;

    private String coinName;
    private String coinSymbol;
    private double coinPriceHigh;
    private double coinPriceLow;
    private double coinOpenPrice;
    private double coinClosePrice;
    private double coinCirculating;
    private double coinMarket;
    private double fluctuate;
    private Date date;

    public Currency() {
        setAll(DEFAULT_NAME, DEFAULT_SYMBOL, DEFAULT_HIGH, DEFAULT_LOW, DEFAULT_OPEN, DEFAULT_CLOSE, new Date());
    }

    public Currency(String coinName, double coinPriceHigh, double coinPriceLow, double coinOpenPrice, double coinClosePrice,
                    double coinCirculating, double coinMarket, Date theDate) {
        setAll(coinName, coinSymbol, coinPriceHigh, coinPriceLow, coinOpenPrice, coinClosePrice, theDate);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //getters
    public String getCoinName() {
        return coinName;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public double getCoinPriceHigh() {
        return coinPriceHigh;
    }

    public double getCoinPriceLow() {
        return coinPriceLow;
    }

    public double getCoinOpenPrice() {
        return coinOpenPrice;
    }

    public double getCoinClosePrice() {
        return coinClosePrice;
    }

    //setters
    public void setAll(String coinName, String coinSymbol, double coinPriceHigh, double coinPriceLow, double coinOpenPrice,
                       double coinClosePrice, Date date) {
        this.coinName = coinName;
        this.coinSymbol = coinSymbol;
        this.coinPriceHigh = coinPriceHigh;
        this.coinPriceLow = coinPriceLow;
        this.coinOpenPrice = coinOpenPrice;
        this.coinClosePrice = coinClosePrice;
        this.date = date;

    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol;
    }

    public void setCoinPriceHigh(double coinPriceHigh) {
        this.coinPriceHigh = coinPriceHigh;
    }

    public void setCoinPriceLow(double coinPriceLow) {
        this.coinPriceLow = coinPriceLow;
    }

    public void setCoinOpenPrice(double coinOpenPrice) {
        this.coinOpenPrice = coinOpenPrice;
    }

    public void setCoinClosePrice(double coinClosePrice) {
        this.coinClosePrice = coinClosePrice;
    }

    public String toString() {
        return  "\nCoin name:" + getCoinName() + "\nCoin Symbol:" + getCoinSymbol() + "\nDate: " + getDate()
                + "\nCoin price at high:" + getCoinPriceHigh() + "\nCoin price at low:" + getCoinPriceLow()
                + "\nCoin price at open:" + getCoinOpenPrice() + "\nCoin price at close:" + getCoinClosePrice();
    }
    //method to get fluctuation
    public double setFluctuate(){
        fluctuate = (coinPriceHigh - coinOpenPrice);
        return fluctuate;
    }

    //method to check if its a good investment, if the high price of the day is less than the fluctuation
    public boolean goodinvestment(){
        if (coinPriceHigh < fluctuate){
            return true;
        }
        else
            return false;
    }

    /****************************************************************************
     * Comparator implementation
     ****************************************************************************/


    /**
     * Compare two itesm using either a Comparator object's compare method or their natural ordering using method compare to.
     *
     * @param o1
     * @param o2
     * @return
     */
    //TODO: Need to implement to be able to specify different sorting order.
    @Override
    public int compare(Currency o1, Currency o2) {


        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Double.compare(currency.getCoinPriceHigh(), getCoinPriceHigh()) == 0 &&
                Double.compare(currency.getCoinPriceLow(), getCoinPriceLow()) == 0 &&
                Double.compare(currency.getCoinOpenPrice(), getCoinOpenPrice()) == 0 &&
                Double.compare(currency.getCoinClosePrice(), getCoinClosePrice()) == 0 &&
                Objects.equals(getCoinName(), currency.getCoinName()) &&
                Objects.equals(getCoinSymbol(), currency.getCoinSymbol());
    }

}
