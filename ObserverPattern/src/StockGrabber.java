import java.util.ArrayList;

public class StockGrabber implements Subject{

	private ArrayList<Observer> observes;
	double aprice;
	double bprice;
	double cprice;
	
	public StockGrabber(){
		observes= new ArrayList<Observer>();
		
	}
	
	@Override
	public void register(Observer newObserver) {
		 
		observes.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		 
		int index=observes.indexOf(deleteObserver);
		System.out.println("Observer"+ (index+1) + "deleted");
		observes.remove(deleteObserver);
	}

	@Override
	public void notifyObserver() {
		 for(Observer observer: observes){
			 observer.update(aprice, bprice, cprice);
		 }
				 
	}


	public void setAprice(double aprice) {
		this.aprice = aprice;
		notifyObserver();
	}


	public void setBprice(double bprice) {
		this.bprice = bprice;
		notifyObserver();
	}


	public void setCprice(double cprice) {
		this.cprice = cprice;
		notifyObserver();
	}

}
