package net.codejava;

  class Encapsulation {
	  private double radius=1;
	  
	  public double getArea() {
			return radius * radius * Math.PI;
		}
	   
		public static void main(String[] args) {
		  Encapsulation myCircle = new Encapsulation();
		  System.out.println("Radius is " + myCircle.radius);
		  System.out.println("Area of cirle: " +myCircle.getArea()); 
		 }


		

	}

	
