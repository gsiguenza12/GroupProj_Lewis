package com.gsiguenza;

public class Currency {
    String coinName;
    String coinSymbol;
    double coinPriceHigh, coinPriceLow, coinOpenPrice, coinClosePrice, coinCirculating, coinMarket;
    public Currency(){

    }
    public Currency(String name, String symbol, double priceHigh, double priceLow, double openPrice, double closePrice,
                    double circulatingSupply, double marketCap){
        coinName = name;
        coinSymbol = symbol;
        coinPriceHigh = priceHigh;
        coinPriceLow = priceLow;
        coinOpenPrice = openPrice;
        coinClosePrice = closePrice;
        coinCirculating = circulatingSupply;
        coinMarket = marketCap;
    }
}
