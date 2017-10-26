package apps;

import multiplicacion_Matrices.ParallelMatrix;
import multiplicacion_Matrices.SequentialMtrix;

public class TestMultiplicacionMatrices {

	public static void main(String[] args) {
		
		SequentialMtrix ma = new  SequentialMtrix(3, 3);
		SequentialMtrix me = new SequentialMtrix(3, 3);
		
		ParallelMatrix PM1 = new ParallelMatrix(3, 3);
		ParallelMatrix PM2 = new ParallelMatrix(3, 3);
		
		System.out.println(ma.multiply(me));
		
		System.out.println(PM1.multiply(PM2));
		
		//long t2 = System.currentTimeMillis();
		
		//System.out.println(t2);
		
	}

}
