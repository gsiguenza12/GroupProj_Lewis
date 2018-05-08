package com.gsiguenza;

public class Currency {
    String coinName;
    String coinSymbol;
    double coinPriceHigh, coinPriceLow, coinOpenPrice, coinClosePrice, coinCirculating, coinMarket;
    public Currency(){

    }
    public Currency(String coinName, String coinSymbol, double coinPriceHigh, double coinPriceLow, double coinOpenPrice, double coinClosePrice,
                    double coinCirculating, double coinMarket){
        this.coinName = coinName;
        this.coinSymbol = coinSymbol;
        this.coinPriceHigh = coinPriceHigh;
        this.coinPriceLow = coinPriceLow;
        this.coinOpenPrice = coinOpenPrice;
        this.coinClosePrice = coinClosePrice;
        this.coinCirculating = coinCirculating;
        this.coinMarket = coinMarket;
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

}
