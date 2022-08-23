class Solution {
    public static boolean isPalindrome(int x) {
        int rem, res=0, org = x;
	    while(x>0){
	        rem = x % 10;
	        res = res * 10 + rem;
	        x = x / 10;
	    }
	    if(org == res){
	        return true;
	    }
	    else{
	        return false;
	    }
    }
    
    // Main Method
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        System.out.println(isPalindrome(x));
    }
}
