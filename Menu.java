package pizza_shop;
import java.util.Scanner;
public class Menu {
	float balance;
	Scanner sc = new Scanner(System.in);
	
public void menu() {
	 System.out.println("Welcome To The Pizza 's Shop");
		System.out.println("*************************************");
	   System.out.println("select item using Number : ");
	   System.out.println("1 :  Veg Pizza");
	   System.out.println("2 :  Non_Veg Pizza");
	   System.out.println("3 :  Burger");
	   System.out.println("4 :  Pasta");
	   System.out.println("5 :  Exit");
	   int x = sc.nextInt();
	   if(x==1) {
		   veg();
	   }else if(x==2) {
		   non_veg();
	   }else if(x==3) {
		   burger();
	   }else if(x==4) {
		   pasta();
	   }else if(x==5) {
		   System.out.println("Thank You & Visit Again");
	   }
	}
public void veg() {
	System.out.println("*************************************");
	System.out.println(" select The Pizza : ");
	System.out.println("1 :  Margarita      Rs 90");
	System.out.println("2 :  Spicy Chili   Rs 90 ");
	System.out.println("3 :  Paneer Special Rs 120");
	System.out.println("4 :  Cheese & Corn  Rs 90");
	int y = sc.nextInt();
	if(y==1) {
		System.out.print("Pay Amount First : ");
		int margarita= sc.nextInt();
		if(margarita==90) {
			System.out.println("*************************************");
			System.out.println("Amount Pay Sucessfully ");
			System.out.println("Have A Good Day ");
			System.out.println("*************************************");
			
		}else if(margarita<90) {
			System.out.println("Check Amount & Pay Again");
		}
	}else if(y==2) {
	 System.out.print("Pay Amount First : ");
	 int spicy = sc.nextInt();
	 if(spicy==90) {
		 System.out.println("*************************************");
		 System.out.println("Amount Pay Sucessfully ");
			System.out.println("Have A Good Day ");
			System.out.println("*************************************");
			
	 }else if(spicy<90) {
		 System.out.println("Check Amount & Pay Again");
	 }
	}else if(y==3) {
		 System.out.print("Pay Amount First : ");
		int paneer = sc.nextInt();
		if(paneer==120) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
				
		}else if(paneer<120) {
			 System.out.println("Check Amount & Pay Again");
		}
	}else if(y==4) {
		System.out.print("Pay Amount First : ");
		int cheese = sc.nextInt();
		if(cheese==90) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
				
		}else if(cheese<90) {
			 System.out.println("Check Amount & Pay Again");
		}
		
	}
}
public void non_veg() {
	System.out.println("**************************************");
	System.out.println(" Select The Pizza : ");
	System.out.println("1 : Crispy  Chicken   Rs 130");
	System.out.println("2 : Spicy   Chicken   Rs 120");
	System.out.println("3 : Special Chicken   Rs 150");
	System.out.println("**************************************");
	int z = sc.nextInt();
	if(z==1) {
		System.out.print("Pay Amount First : ");
		int crispy = sc.nextInt();
		if(crispy==130) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
				
		}else if(crispy<130) {
			 System.out.println("Check Amount & Pay Again");
		}
	}else if(z==2) {
		System.out.print("Pay Amount First : ");
		int spicy = sc.nextInt();
		if(spicy==120) {
			 System.out.println("*************************************");
			 System.out.print("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
				
		}else if(spicy<120) {
			 System.out.println("Check Amount & Pay Again");
		}
	}else if(z==3) {
		System.out.print("Pay Amount First : ");
		int special = sc.nextInt();
		if(special==150) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
				
		}else if(special<150) {
			 System.out.println("Check Amount & Pay Again");
		}
	  }
   }
public void burger() {
	System.out.println("**************************************");
	System.out.println("Select The Burger : ");
	System.out.println("1 : BBQ Burger Rs 120");
	System.out.println("2 : Veg Burger Rs 80");
	System.out.println("3 : Chicken Burger Rs 100");
	 System.out.println("*************************************");
	int burger = sc.nextInt();
	if(burger==1) {
		System.out.print("Pay The Amount First :");
		int bbq = sc.nextInt();
		if(bbq==120) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
		}else if(bbq<120) {
			System.out.println("Check Amount & Pay Again");
		}
			}else if(burger==2)	{
				System.out.print("Pay The Amount First :");
				int veg = sc.nextInt();
				if(veg==80) {
					 System.out.println("*************************************");
					 System.out.println("Amount Pay Sucessfully ");
						System.out.println("Have A Good Day ");
						System.out.println("*************************************");
				}else if(veg<80) {
					System.out.println("Check Amount & Pay Again");
				}
			}else if(burger==3) {
				System.out.print("Pay The Amount First :");
				int chicken = sc.nextInt();
				if(chicken==100) {
					 System.out.println("*************************************");
					 System.out.println("Amount Pay Sucessfully ");
						System.out.println("Have A Good Day ");
						System.out.println("*************************************");
				}else if(chicken<100) {
					System.out.println("Check Amount & Pay Again");
				}
			}
}

 public void pasta() {
	 System.out.println("**************************************");
	 System.out.println("Select The Pasta : ");
	 System.out.println("1 : Fusilli  Rs 100");
	 System.out.println("2 : Penne  Rs 90");
	 System.out.println("3 : Rigatoni Rs 80");
	 int pasta = sc.nextInt();
	 if(pasta==1) {
		 System.out.print("Pay The Amount First :");
		 int fusilli = sc.nextInt();
		 if(fusilli==100) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
		 }else if(fusilli<100) {
			 System.out.println("Check Amount & Pay Again");
		 }
	 }else if(pasta==2) {
		 System.out.print("Pay The Amount First :");
		 int penne =sc.nextInt();
		 if(penne==90) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
		 }else if(penne<90) {
			 System.out.println("Check Amount & Pay Again");
		 }
	 }else if(pasta==3) {
		 System.out.print("Pay The Amount First :");
		 int rigatoni = sc.nextInt();
		 if(rigatoni==80) {
			 System.out.println("*************************************");
			 System.out.println("Amount Pay Sucessfully ");
				System.out.println("Have A Good Day ");
				System.out.println("*************************************");
		 }else if(rigatoni<80) {
			 System.out.println("Check Amount & Pay Again");
		 }
	 }
 }
}
