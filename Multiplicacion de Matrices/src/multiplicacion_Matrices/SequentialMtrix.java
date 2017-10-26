package multiplicacion_Matrices;

public class SequentialMtrix extends Matrix 
{

	public SequentialMtrix(int rDimension, int cDimension)
	{
		super(rDimension, cDimension);
	}
	
	public SequentialMtrix(int row2, int column2, int[][] data)
	{
		this.row = row2;
		this.column = column2;
		this.matrix = data;
	}
	
	@Override
	public int[][] multiply(Matrix secondMatrix) 
	{
		int[][] resultMatrix = new int[this.row][secondMatrix.column];
		
		for(int i = 0; i < getRowDimension(); i++)
		{
			for(int j = 0; j < getRowDimension(); j++)
			{			
				for(int k = 0; k < secondMatrix.getColumnDimension(); k++)
				{
					resultMatrix[i][j] += matrix[i][k] * secondMatrix.matrix[k][j]; 
				}
			}
		}
		
		return resultMatrix;
	}			
}
