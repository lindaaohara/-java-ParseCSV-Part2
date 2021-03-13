package com.codedifferently.parseCSV;

import com.codedifferently.parseCSV.data.Source;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DataParserTest {

    private String csvRawData;

    @Before
    public void setUp(){
        csvRawData = Source.csvData;
    }

    @Test
    public void parseSaleDataIntoObjectTest(){
        DataParser dataParser = new DataParser();
        ArrayList<SaleData> regions = dataParser.parseDataIntoObjects(csvRawData);
        String expected = "region: Europe\n" +
                "country: Russia\n" +
                "item: Office Supplies\n" +
                "salesChannel: Offline\n" +
                "orderPriority: L\n" +
                "orderDate: 5/2/2014\n" +
                "orderId: 341417157\n" +
                "shipDate: 5/8/2014\n" +
                "unitsSold: 1779\n" +
                "unitPrice: 651.21\n" +
                "unitCost: 524.96\n"+
                "totalRevenue: 1158502.59\n" +
                "totalCost: 933903.84\n" +
                "totalProfit: 224598.75";
        String actual = regions.get(2).toString();
        Assert.assertEquals(expected,actual);

    }
}
