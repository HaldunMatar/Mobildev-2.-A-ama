
/**
 * Fibonacci dizesinde 500.000 ’den küçük en büyük asal sayı ile, 500.000 den büyük en küçük asal sayı arasındaki farkı veren kodu yazınız.
 * @author HALDUNMATAR
 *
 */

public class Fibonacci {
		
 static int primeSmaller	;
 static int primeBigger	;
final static int  num =  500000 ;


/**
 * this method pass all number for range and search for  primeSmaller  and primeBigger 
 * 
 */
static void SetPrime() {
	boolean foundPrime=false;
	int i0=1;
	int i1=1;
	int tempi1=1;

	while (!foundPrime    ) {	
		if(isPrime(i1)) {
		  if(i1<num)
			primeSmaller= i1 ;
		  else {
			primeBigger= i1 ;
			foundPrime=true;
		  }
		  
		}
	
		tempi1=i1;
		i1=i0+i1;
		i0=tempi1;	
		
	}
		 
 }

/**
 * check if  number is Prime
 * @param n
 * @return
 */

static boolean isPrime(int n) 
{ 
    // Corner case 
    if (n <= 1) 
        return false; 

    // Check from 2 to n-1 
    for (int i = 2; i < n; i++) 
        if (n % i == 0) 
            return false; 
    return true; 
} 


public static void main(String[] args) {
	SetPrime();
	System.out.println("primeSmaller="+primeSmaller);
	System.out.println ("primeBigger="+primeBigger);
	
	
	
}
	

}
