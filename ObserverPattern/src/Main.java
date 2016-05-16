
public class Main {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber= new StockGrabber();
		
		StockObserver Observer1= new StockObserver(stockGrabber);
		
		stockGrabber.setAprice(233.4);
		stockGrabber.setBprice(45.00);
		stockGrabber.setCprice(34.67);
		
       StockObserver Observer2= new StockObserver(stockGrabber);
		
		stockGrabber.setAprice(1.23);
		stockGrabber.setBprice(2.00);
		stockGrabber.setCprice(3.67);
		

		stockGrabber.unregister(Observer1);
		
		stockGrabber.setAprice(233.4);
		stockGrabber.setBprice(45.00);
		stockGrabber.setCprice(34.67);
		
	}

}
