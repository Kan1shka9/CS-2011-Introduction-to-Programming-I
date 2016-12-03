package CS2011.Lecture15.InstanceOf;

public class Demo {
	
	Object myObject;

	public Object getMyObject() {
		return myObject;
	}

	public void setMyObject(Object myObject) {
		this.myObject = myObject;
	}

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		String newObject = new String("John");
		
		demo.setMyObject(newObject);
		Object o = demo.getMyObject();

		if (o instanceof String)
			System.out.println("\"" + o + "\"" + " is a String!");
		else
			System.out.println("not a String!");

		Object arch = new Archimedes();
		
		demo.setMyObject(arch);
		Object o2 = demo.getMyObject();

		if (o2 instanceof String)
			System.out.println("\"" + o2 + "\"" + " is a String!");
		else
			System.out.println(o2 + " is not a String!");

	}

}