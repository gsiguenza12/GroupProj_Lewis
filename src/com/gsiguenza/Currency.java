package com.gsiguenza;

import java.util.Objects;

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
public class Currency {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
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

    public Currency(){
        setAll(DEFAULT_NAME,DEFAULT_SYMBOL,DEFAULT_HIGH,DEFAULT_LOW,DEFAULT_OPEN,DEFAULT_CLOSE,DEFAULT_CIRCULATING,DEFAULT_MARKET);
    }

    public Currency(String coinName, String coinSymbol, double coinPriceHigh, double coinPriceLow, double coinOpenPrice, double coinClosePrice,
                    double coinCirculating, double coinMarket){
        setAll(coinName,coinSymbol,coinPriceHigh,coinPriceLow,coinOpenPrice,coinClosePrice,coinCirculating,coinMarket);
    }

    //getters
    public String getCoinName()
    {
        return coinName;
    }
    public String getCoinSymbol()
    {
        return coinSymbol;
    }
    public double getCoinPriceHigh()
    {
        return coinPriceHigh ;
    }
    public double getCoinPriceLow()
    {
        return coinPriceLow;
    }
    public double getCoinOpenPrice()
    {
        return coinOpenPrice;
    }
    public double getCoinClosePrice()
    {
        return coinClosePrice;
    }
    public double getCoinCirculating()
    {
        return coinCirculating;
    }
    public double getCoinMarket()
    {
        return coinMarket;
    }

    //setters
    public void setAll(String coinName, String coinSymbol, double coinPriceHigh, double coinPriceLow, double coinOpenPrice, double coinClosePrice,
                       double coinCirculating, double coinMarket) {
        this.coinName = coinName;
        this.coinSymbol = coinSymbol;
        this.coinPriceHigh = coinPriceHigh;
        this.coinPriceLow = coinPriceLow;
        this.coinOpenPrice = coinOpenPrice;
        this.coinClosePrice = coinClosePrice;
        this.coinCirculating = coinCirculating;
        this.coinMarket = coinMarket;
    }

    public void setCoinName(String coinName)
    {
        this.coinName =  coinName;
    }
    public void setCoinSymbol(String coinSymbol)
    {
        this.coinSymbol = coinSymbol;
    }
    public void setCoinPriceHigh(double coinPriceHigh)
    {
        this.coinPriceHigh = coinPriceHigh;
    }
    public void setCoinPriceLow(double coinPriceLow)
    {
        this.coinPriceLow = coinPriceLow;
    }
    public void setCoinOpenPrice(double coinOpenPrice)
    {
        this.coinOpenPrice = coinOpenPrice;
    }
    public void setCoinClosePrice(double coinClosePrice)
    {
        this.coinClosePrice = coinClosePrice;
    }
    public void setCoinCirculating(double coinCirculating)
    {
        this.coinCirculating = coinCirculating;
    }
    public void  setCoinMarket(double coinMarket)
    {
        this.coinMarket = coinMarket;
    }

    public String toString()
    {
        return "Coin name:"+getCoinName()+"\n Coin Symbol:"+getCoinSymbol()
                +"\n Coin price at high:"+getCoinPriceHigh()+"\n Coin price at low:"+getCoinPriceLow()
                +"\n Coin price at open:"+getCoinOpenPrice() +"\n Coin price at close:"+getCoinClosePrice()
                +"\n Coins in circulating:"+getCoinCirculating() +"\n Coins in the market:"+getCoinMarket();
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
                Double.compare(currency.getCoinCirculating(), getCoinCirculating()) == 0 &&
                Double.compare(currency.getCoinMarket(), getCoinMarket()) == 0 &&
                Objects.equals(getCoinName(), currency.getCoinName()) &&
                Objects.equals(getCoinSymbol(), currency.getCoinSymbol());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCoinName(), getCoinSymbol(), getCoinPriceHigh(), getCoinPriceLow(), getCoinOpenPrice(), getCoinClosePrice(), getCoinCirculating(), getCoinMarket());
    }
}
