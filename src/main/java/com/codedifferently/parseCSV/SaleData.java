package com.codedifferently.parseCSV;

public class SaleData {
    private String region;
    private String country;
    private String item;
    private String salesChannel;
    private String orderPriority;
    private String orderDate;
    private Integer orderId;
    private String shipDate;
    private Integer unitsSold;
    private Double unitPrice;
    private Double unitCost;
    private Double totalRevenue;
    private Double totalCost;
    private Double totalProfit;

    public SaleData(){

    }

    public SaleData(String region, String country, String item, String salesChannel, String orderPriority, String orderDate, Integer orderId, String shipDate, Integer unitsSold, Double unitPrice, Double unitCost, Double totalRevenue, Double totalCost, Double totalProfit) {
        this.region = region;
        this.country = country;
        this.item = item;
        this.salesChannel = salesChannel;
        this.orderPriority = orderPriority;
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.shipDate = shipDate;
        this.unitsSold = unitsSold;
        this.unitCost = unitCost;
        this.unitPrice = unitPrice;
        this.totalRevenue = totalRevenue;
        this.totalCost = totalCost;
        this.totalProfit = totalProfit;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public String getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(String orderPriority) {
        this.orderPriority = orderPriority;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public Integer getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(Integer unitsSold) {
        this.unitsSold = unitsSold;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public String toString() {
        return
                "region: " + region + '\n' +
                "country: " + country + '\n' +
                "item: " + item + '\n' +
                "salesChannel: " + salesChannel + '\n' +
                "orderPriority: " + orderPriority + '\n'+
                "orderDate: " + orderDate + '\n'+
                "orderId: " + orderId + '\n' +
                "shipDate: " + shipDate + '\n' +
                "unitsSold: " + unitsSold + '\n'+
                "unitPrice: " + unitPrice + '\n' +
                "unitCost: " + unitCost + '\n' +
                "totalRevenue: " + totalRevenue + '\n'+
                "totalCost: " + totalCost + '\n' +
                "totalProfit: " + totalProfit;

    }
}
