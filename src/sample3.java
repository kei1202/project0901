class Updater {
	
	void update(Counter counter) {
		counter.count++;
	}
}

class counter {
	int count=0;
}


public class sample3 {

	public static void main(String[] args) {
		Counter myCounter=new Counter();
		System.out.println("after update : "+myCounter.count);
	}

}
