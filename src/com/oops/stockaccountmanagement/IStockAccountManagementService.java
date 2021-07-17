package com.oops.stockaccountmanagement;

public interface IStockAccountManagementService
{
    public void insertStocksDetails(Stocks stocks);
    public void printStocksNames();
    public void printSelectedStockReport(String userStockName);
    public void calculateValueOfPoertFolio();
    public void displayDetailPortFolio();
}