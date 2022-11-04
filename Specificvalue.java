//WAP to test if an array contain a Specific value.
public class Specificvalue {

	public static void main(String[] args) {
	 int[] arr= {1789, 2035, 1988, 1456, 2015};
	 System.out.println(contains(arr,2013));

	}
	public static boolean contains(int[] arr,int item) {
		                          for(int n: arr) {
		                        	if(item == n ) {
		                        		return true;
		                        	}
		                          }
		                          return false;
	}

}
