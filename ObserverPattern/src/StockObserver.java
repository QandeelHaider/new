 
public class StockObserver implements Observer {

	private double aprice;
	private double bprice;
	private double cprice;
	
	private int Observerid;
	private static int observeridcount = 0;
	private Subject stockGrabber;
	
	
	public StockObserver(Subject stockGrabber){
	
		this.stockGrabber = stockGrabber;
		this.Observerid = ++observeridcount;
		System.out.println("New Observer " + Observerid);
		stockGrabber.register(this);
	}
	
	
	
	@Override
	public void update(double aprice, double bprice, double cprice) {
		this.aprice=aprice;
		this.bprice=bprice;
		this.cprice=cprice;
		
		printit();
		
	}

	public void printit(){
	System.out.println( Observerid + "\naprice=" + aprice + "\nbprice=" + bprice + "\ncprice=" + cprice );
	}
	
}
