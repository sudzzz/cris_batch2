import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Restaurant {
	
		
	public Restaurant() {
		System.out.println("Rest constr...");
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		
		
		
	}
}




//class Restaurant {
//	
//	String name = "Abc";
//	
//		
//	public Restaurant() {
//		System.out.println("Rest constr...");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		System.out.println(restaurant.name);
//		restaurant.name = "XYZ";
//		
//		Restaurant restaurant2 = context.getBean("restaurantBean", Restaurant.class);
//		System.out.println(restaurant2.name);
//		System.out.println(restaurant.name);
//	}
//}


//class Tea {
//	
//	Tea() {
//		System.out.println("Tea constr....");
//	}
//	
//	void prepareTea() {
//		
//		System.out.println("inside prepareTea()...");
//	}	
//}
//
//class Restaurant {
//	Tea tea;
//	
//	public Restaurant(Tea tea) {
//		super();
//		System.out.println("inside Paramertized constr...");
//		this.tea = tea;
//	}
//	void placeOrder() {
//		
//		System.out.println("inside placeOrder()");
//		
//		tea.prepareTea();
//	}	
//	public Restaurant() {
//		System.out.println("Rest constr...");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		restaurant.placeOrder();
//			
//	}
//}


//class Tea {
//	
//	Tea() {
//		System.out.println("Tea constr....");
//	}
//	
//	void prepareTea() {
//		
//		System.out.println("inside prepareTea()...");
//	}	
//}
//
//class Restaurant {
//	Tea tea;
//	
//	public void setTea(Tea tea) {
//		System.out.println("setter of Tea");
//		this.tea = tea;
//	}
//
//	void placeOrder() {
//		
//		System.out.println("inside placeOrder()");
//		
//		tea.prepareTea();
//	}	
//	public Restaurant() {
//		System.out.println("Rest constr...");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		restaurant.placeOrder();
//			
//	}
//}



//class Tea {
//	
//	String name;
//	
//	Tea() {
//		System.out.println("insdie Tea constr....");
//	}
//	
//}
//
//
//class Restaurant {
//
//	String name;
//	
//	public Restaurant() {
//		System.out.println("inside Rest cons..");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		
//		Tea tea1 = context.getBean("teaBean1", Tea.class);
//		System.out.println("Tea1 is "+tea1);
//		
//		Tea tea2 = context.getBean("teaBean2", Tea.class);
//		System.out.println("Tea2 is "+tea2);
//		
//		
//		
//		Tea tea3 = context.getBean("teaBean1", Tea.class);
//		System.out.println("Tea1 is "+tea3);
//		
//		Tea tea4 = new Tea();
//		
//	}
//}


//class Tea {
//	
//	String name;
//	
//	Tea() {
//		System.out.println("insdie Tea constr....");
//	}
//	
//}
//
//
//class Restaurant {
//
//	String name;
//	
//	public Restaurant() {
//		System.out.println("inside Rest cons..");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		
//		Tea tea1 = context.getBean("teaBean1", Tea.class);
//		System.out.println("Tea1 is "+tea1);
//		
//		Tea tea2 = context.getBean("teaBean2", Tea.class);
//		System.out.println("Tea2 is "+tea2);
//		
//	}
//}




//class Restaurant {
//	
//	String name;
//	int age;
//
//	public Restaurant(String name, int age) {
//		System.out.println("inside parameterized....");
//		this.name = name;
//		this.age = age;
//	}
//
//	void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared by "+name+ " and the age is ");
//	}	
//	
//	public Restaurant() {
//		System.out.println("inside Rest constr...");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//		
//	}
//}



//class Restaurant {
//	
//	String name;
//
//	public void setName(String name) {
//		System.out.println("inside setName()");
//		this.name = name;
//	}
//
//
//	void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared by "+name);
//	}	
//	
//	public Restaurant() {
//		System.out.println("inside Rest constr...");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//		
//	}
//}




//class Restaurant {
//	
//	String name;
//	
//	void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared....");
//	}
//	
//	public Restaurant() {
//		System.out.println("I am in Restautant Constr...");
//	}
//	
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
////		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
////		
////		restaurant.prepareTea();	
//		
//		
//		
//		
////		Restaurant restaurant = new Restaurant();
////		
////		restaurant.prepareTea();
//		
//	}
//
//}
