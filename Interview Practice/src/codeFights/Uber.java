/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package codeFights;

public class Uber {
public static void main(String[] args){
	double[] dep={0.4, 1};
	double [] des={0.9, 3};
	System.out.println( perfectCity(dep,des));
}
	
	
	static double perfectCity(double[] departure, double[] destination) {
		double distance=0;
		// System.out.println(((departure[0]*10)%10));
		    if((((departure[0]*10)%10)+((destination[0]*10)%10))/10 <= (1-departure[0])+(1-destination[0]) ){
		       distance+= (((departure[0]*10)%10)+((destination[0]*10)%10))/10 ;
		    //   distance+=
		        System.out.println("1"+distance);
		//        System.out.println( (1-departure[0])+(1-departure[1]));
		    }
		    else{
		        distance+=((1-((departure[0]*10)%10)/10)+(1-((destination[0]*10)%10)/10));
		        System.out.println(distance);
		    }
		    
		   // if()
		    return distance;
		}

	
	
	
}
