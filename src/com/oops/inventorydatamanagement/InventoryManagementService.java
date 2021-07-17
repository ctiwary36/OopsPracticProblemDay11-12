package com.oops.inventorydatamanagement;

public interface InventoryManagementService
{
    public void addInventoryItems(Items items);
    public void calculateValueOfInventory();
    public void printItemNames();
    public void printSelectedItemDetails(String userItemName);
    public void printAllItemsDetails();
}
