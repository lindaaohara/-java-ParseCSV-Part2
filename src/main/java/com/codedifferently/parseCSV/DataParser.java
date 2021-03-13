package com.codedifferently.parseCSV;

import java.util.ArrayList;

public class DataParser {

    public ArrayList<SaleData> parseDataIntoObjects(String data){
        String[] lines = data.split("\n");
        ArrayList<SaleData> regions = new ArrayList<>();
        for(int i=1; i<lines.length; i++) {
            SaleData saleData = new SaleData();
            String[] regionData = lines[i].split(",");
            saleData.setRegion(regionData[0]);
            saleData.setCountry(regionData[1]);
            saleData.setItem(regionData[2]);
            saleData.setSalesChannel(regionData[3]);
            saleData.setOrderPriority(regionData[4]);
            saleData.setOrderDate(regionData[5]);
            saleData.setOrderId(Integer.parseInt(regionData[6]));
            saleData.setShipDate(regionData[7]);
            saleData.setUnitsSold(Integer.parseInt(regionData[8]));
            saleData.setUnitPrice(Double.valueOf(regionData[9]));
            saleData.setUnitCost(Double.valueOf(regionData[10]));
            saleData.setTotalRevenue(Double.valueOf(regionData[11]));
            saleData.setTotalCost(Double.valueOf(regionData[12]));
            saleData.setTotalProfit(Double.valueOf(regionData[13]));
            regions.add(saleData);
        }

        return regions;
    }
}
