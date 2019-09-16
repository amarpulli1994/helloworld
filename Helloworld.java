public class Helloworld{
	public void printPyramid(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5-i;j++){
				System.out.print("");
			}
			for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
        System.out.println();
		}
	}
	public static void main(String args[]){
		
	Helloworld hello = new Helloworld();
	hello.printPyramid();
	System.out.println("Welcome to Java World and Devops...");
	System.out.println("Welcome to Fueb...");
	
	}
}