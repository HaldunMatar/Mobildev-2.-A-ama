package normalizayonArray;

import java.util.Random;

/**
 * 
 * @author HALDUNMATAR
 *	N = (xi – xmin) / (xmax – xmin)
 */

public class Normalizayon {
final int  length= 500;
final int  Rang= 10000;
	
private  float[] 	normalizayon   =  new float[length] ;
private  int[] 	nonNormalizayon=  new int[length] ;
private  float max=0 ;
private  float min=0 ;
 
Random randNum = new Random();
  
  
 /**
  * find Max vale 
  */
void   setMax( ){
	for(int i = 1; i < nonNormalizayon.length;i++)
	{
		if(nonNormalizayon[i] > max)
		{
			max = nonNormalizayon[i];
		}
	} 
	  
	  
  }

/**
 * find Min value
 */
void   setMin( ){
	  
	for(int i = 1; i < nonNormalizayon.length;i++)
	{
		if(nonNormalizayon[i] < min)
		{
			min = nonNormalizayon[i];
		}
	} 
	  
	  
}

void setNormalizayon() {
	setMin( );
	setMax();
	for(int i = 1; i < nonNormalizayon.length;i++)
	{
		
		normalizayon[i]=(nonNormalizayon[i] - min)/ (max -min)  ;
		
	}
	
	
}
/**
 * 
 * this method initial   nonNormalizayon array 
 */

void setNonNormalizayon() {
	
	for(int i = 1; i < nonNormalizayon.length;i++)
	{
		
		nonNormalizayon[i]=randNum.nextInt(Rang-1)+1; 
		
	}
	
	
}
/**
 * print array
 */
void printNormalizayon() {
	setMin( );
	setMax();
	for(int i = 1; i < normalizayon.length;i++)
	{
		
		System.out.println("normalizayon" + i + " =  " +  normalizayon[i]);
		 
	}
	
	
}


public static void main(String[] args) {
	Normalizayon normalizayon = new Normalizayon();
	normalizayon.setNonNormalizayon();
	normalizayon.setNormalizayon();
	normalizayon.printNormalizayon();
	
   }	
	
	
	
	

}
