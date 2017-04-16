package matrix;

import Jama.Matrix;

public class TestMatrix {
	public static void main(String args[]){
		double[][] a = {
				{1,2,3},
				{2,3,4},
				{5,6,7}
		};
		double[][] b ={
				{1,2,0},
				{3,4,5},
				{6,7,8}
		};
		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);
		Matrix C = A.plus(B);
		C.print(4, 0);
	}
}
