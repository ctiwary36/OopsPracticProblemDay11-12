package com.oops.commercialdataprocessing;

public interface IStocksManagementServices {
    //Abstract methods.
    public void displayPresentCompanySharesDetails();
    public void buyStocks(CompanyShares companySharesDetails);
    public void sellStocks(String companySymbol);
    public void displayDetailPortFolio();
}
