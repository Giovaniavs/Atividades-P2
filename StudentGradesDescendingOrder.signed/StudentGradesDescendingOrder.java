import java.util.*;

/********************************************************
 *                                                      * 
 * PROBLEM:                                             *
 *                                                      *
 * Complete the design of the function called           *
 * getGradesInDescendingOrder that consumes an array of *
 * grades and produces the grades in descending order.  *
 *                                                      *
 * see examples wrapped in check-expect.                *
 *  -with the form: @check_expect (({in}) -> (out))     *
 *                                                      *
 * @author Henrique Rebelo                              *
 ********************************************************/
public class StudentGradesDescendingOrder {
    
	/**
	 * Examples:
	 * @check_expect (({new double[] {10}})                 -> (double[]{10}))
	 * @check_expect (({new double[] {0, 10}})              -> (double[]{10, 0}))
	 * @check_expect (({new double[] {2, 8, 9, 10}})        -> (double[]{10, 9, 8, 2}))
	 * @check_expect (({new double[] {5, 9, 1, 2, 3}})      -> (double[]{9, 5, 3, 2, 1}))
	 * @check_expect (({new double[] {10, 9, 10, 1, 2, 1}}) -> (double[]{10, 10, 9, 2, 1, 1}))
	 */  
	public static double [] getGradesInDescendingOrder(double [] grades) {
		for(int i = 0; i < grades.length - 1; i++) {
      for(int j = 0; j < grades.length - 1 - i; j++) {
        if(grades[j] < grades[j + 1]) {
          double aux = grades[j];
          grades[j] = grades[j + 1];
          grades[j + 1] = aux;
        }
      }
    }
      return grades;
	}
}
