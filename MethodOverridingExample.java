package experiment;

public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
        animal.sound();
        
        Dog dog = new Dog();
        dog.sound(); 
        
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        
        Shape circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.calculateArea()); 

	}

}
