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
    public Currency(double high, double low ){
        coinPriceHigh = high;
        coinPriceLow = low;
    }
    //
    public Currency(double open, double close, String coinSymbol){
    coinOpenPrice = open;
    coinClosePrice = close;
    this.coinSymbol = null;
    }

    /**
     * retrieve data
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * will set the date
     * @param object data
     */
    public void setDate(Date date) {
        this.date = date;
    }

    //getters

    /**
     * retrieve coin name
     * @return String name
     */
    public String getCoinName() {
        return coinName;
    }

    /**
     *retrieve coin shymbol
     * @return String  of coin symbol
     */
    public String getCoinSymbol() {
        return coinSymbol;
    }

    /**
     * retrieve coin price @ high
     * @return double coin price high
     */
    public double getCoinPriceHigh() {
        return coinPriceHigh;
    }
    /**
     * retrieve coin price @ low
     * @return double coin price low
     */
    public double getCoinPriceLow() {
        return coinPriceLow;
    }
    /**
     * retrieve coin price @ open price
     * @return double coin open price
     */
    public double getCoinOpenPrice() {
        return coinOpenPrice;
    }
    /**
     * retrieve coin price @ close price
     * @return double coin close price
     */
    public double getCoinClosePrice() {
        return coinClosePrice;
    }

    /**
     * This will be able to set all at once
     * @param coinName
     * @param coinSymbol
     * @param coinPriceHigh
     * @param coinPriceLow
     * @param coinOpenPrice
     * @param coinClosePrice
     * @param date
     */
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

    /**
     * will set cion name
     * @param coinName
     */
    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    /**
     * set the coin Symbol
     * @param coinSymbol
     */
    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol;
    }

    /**
     * set the coin of the cion @ high
     * @param coinPriceHigh
     */
    public void setCoinPriceHigh(double coinPriceHigh) {
        this.coinPriceHigh = coinPriceHigh;
    }

    /**
     * set the price od the coin @ low
     * @param coinPriceLow
     */
    public void setCoinPriceLow(double coinPriceLow) {
        this.coinPriceLow = coinPriceLow;
    }

    /**
     * set the price of the coin @ opne
     * @param coinOpenPrice
     */
    public void setCoinOpenPrice(double coinOpenPrice) {
        this.coinOpenPrice = coinOpenPrice;
    }

    /**
     * set coin price at low
     * @param coinClosePrice
     */

    public void setCoinClosePrice(double coinClosePrice) {
        this.coinClosePrice = coinClosePrice;
    }

    /**will return a string of the data of the coin
     * @return name, symbol, data , coin price at high , coin price at low, coin price at open,
     * coin price at close
     */
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



    /**
     *  method to check if its a good investment, if the high price of the day is less than the fluctuation
     * @return
     */
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
     * @return o
     */
    //TODO: Need to implement to be able to specify different sorting order.
    @Override
    public int compare(Currency o1, Currency o2) {


        return 0;
    }

    /**
     *
     * @param o
     * @return
     */
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
