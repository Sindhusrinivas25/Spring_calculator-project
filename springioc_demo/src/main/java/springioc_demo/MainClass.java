package springioc_demo;

public class MainClass {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setBrand("nokia");
		mobile.setColor("blue");
		mobile.setRam(16);
		mobile.setPrice(23456);
		mobile.setSim(new Airtel());
		
		System.out.println(mobile);
	}

}
