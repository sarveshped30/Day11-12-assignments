package com.bridgelabz.StockAccountManagement;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    private String stockName;
    private int numberOfShares;
    private float sharePrice;

    public void setStockName(String sName) {
        this.stockName = sName;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public void setSharePrice(long sharePrice) {
        this.sharePrice = sharePrice;
    }


}

public class Main {
    static Logger logger = Logger.getLogger(Main.class);
    ArrayList<Stock> list = new ArrayList<Stock>();

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Stock stock = new Stock();
        Scanner sc = new Scanner(System.in);

        logger.info("Enter no of stocks");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            logger.info("Enter stocks name");
            String sName = sc.nextLine();

            logger.info("Enter no of shares");
            int numberOfShares = sc.nextInt();

            logger.info("Enter share price");
            long sharePrice = sc.nextLong();

            stock.setStockName(sName);
            stock.setNumberOfShares(numberOfShares);
            stock.setSharePrice(sharePrice);

        }
    }
}

//        stockname="abc";
//        stockprice=121;
//        noofshares=34;
//        shareprice=34456567;
//        453567776