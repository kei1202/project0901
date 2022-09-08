class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
	Dog(){
		
	}
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
	HouseDog(String name) {
		this.setName(name);
	}
	
	HouseDog(int type) {
		if (type==1) {
			this.setName("youkshire");
		} else if (type==2) {
			this.setName("bulldog");
		}
	}
	
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}
public class Constructor {

	public static void main(String[] args) {
		HouseDog happy = new HouseDog("happy");
		HouseDog yorkshire = new HouseDog(1);
        HouseDog dog = new HouseDog("happy");
        System.out.println(dog.name);
	}

}
