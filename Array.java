import java.util.*;

class Array {
	static int a[]=new int[5];
	public void getSetArray(){		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Elements.");
		for(int i=0; i<a.length;i++){
			System.out.print("a [ "+i+" ]: ");
			a[i]=sc.nextInt();
		}
	}
	public void displayArray(int [] a){
		System.out.println("Array Elements.");
		for(int i=0; i<a.length;i++){
			System.out.println("a [ "+i+" ]: "+a[i]);			
		}
	}
	public void revArray(int [] a){
		System.out.println("Reverse Array.");
		for(int i=a.length-1; i>=0;i--){
			System.out.println("a [ "+i+" ]: "+a[i]);			
		}
	}	
	public static void main(String args[]){
		Array rv=new Array();		
		rv.getSetArray();
		rv.displayArray(a);
		rv.revArray(a);		
	}
}
