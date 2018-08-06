package observer;

public class GrabStocks {
    public static void main(String[] args){
        StockGrabber stockGrabber= stockGrabber = new StockGrabber();
        StockObserver observer = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplPrice(197.00);
        stockGrabber.setGoogPrice(197.00);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplPrice(677.00);
        stockGrabber.setGoogPrice(676.40);

        stockGrabber.unregister(observer);


        Runnable getIBM = new GetTheStock(stockGrabber, 1, "IBM", 197.00);
        Runnable getAPPL = new GetTheStock(stockGrabber, 2, "AAPL", 197.00);
        Runnable getGOOL = new GetTheStock(stockGrabber, 3, "GOOG", 197.00);


        new Thread(getIBM).start();
        new Thread(getAPPL).start();
        new Thread(getGOOL).start();

    }
}
