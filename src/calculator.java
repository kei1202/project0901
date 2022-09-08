class calculator {
	int value;
	
	calculator() {
		this.value=0;
	}
	
	void add(int val) {
		this.value +=val;
	}
	
	int getValue() {
		return this.value;
	}
	
}
public class calculator {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());
		
	}

}
