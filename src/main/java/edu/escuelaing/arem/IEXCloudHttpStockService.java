package edu.escuelaing.arem;

public class IEXCloudHttpStockService extends HttpStockService{


    @Override
    public String getURL(String timeSeries, String stock) {

        return "https://cloud.iexapis.com/stable/stock/market/batch/time_series?symbols="+stock+"&types=quote,chart&range="+timeSeries+"&token=pk_0cbab2e8b9e346928702f704c8d77ddb ";
    }
}
