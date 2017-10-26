package multiplicacion_Matrices;

public class ParallelMatrix extends Matrix 
{

	/**
	 * Constructor parametrizado
	 * @param rDimension
	 * @param cDimension
	 */
	public ParallelMatrix(int rDimension,int cDimension) 
	{
		super(rDimension,cDimension);
	}
	
	@Override
	public int[][] multiply(Matrix secondMatrix) 
	{
		int[][] result_parallel = new int[this.row][secondMatrix.column];
		
		for(int i = 0; i < matrix.length; i++)
		{
			Runnable task = new MultiplierThread(row, column);
			Thread worker = new Thread(task);
			worker.start();
		}
		
		return result_parallel;
	}

}
