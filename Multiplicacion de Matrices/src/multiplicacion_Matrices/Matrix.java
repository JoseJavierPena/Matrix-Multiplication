package multiplicacion_Matrices;

import java.util.Arrays;
import java.util.Random;

public abstract class Matrix 
{

	// First matrix
	protected int[][] matrix;
	protected int row;
	protected int column;
	protected Random rObject;
	protected static final int RANDOM_SCALE = 100;
	
	public Matrix()
	{}
	
	/**
	 * Constructur #1 - El contenido de la matriz se genera aleatoriamente
	 * @param row1
	 * @param column1
	 */
	public Matrix(int row1, int column1) 
	{ 
		rObject = new Random(System.currentTimeMillis());
		this.row = row1;
		this.column = column1;
		
		matrix = new int[this.row][this.column];
		
		for(int i = 0; i < row; i++) 
		{
			for(int j = 0; j < column; j++) 
			{
				matrix[i][j] = RANDOM_SCALE*rObject.nextInt();
			}
		}
	}
	
	/**
	 * Constructor #2 - Se asume que el contenido de la matriz 
	 * se pasa como parametro 
	 * @param row2
	 * @param column2
	 * @param matrixData
	 */
	public Matrix(int row2, int column2, int[][] matrixData)
	{
		this.row = row2;
		this.column = column2;
		this.matrix = matrixData;
	}
	
	/**
	 * Se accede a una entrada en particular de la matriz
	 * @param rowPosition
	 * @param columnPosition
	 * @return
	 */
	public int getEntry(int rowPosition, int columnPosition) 
	{
		return this.matrix[rowPosition][columnPosition];
	}
	
	/**
	 * Se obtiene una copia del vector fila cuyo
	 * indice se pasa como parametro
	 * @param i
	 * @return
	 */
	public int[] getRowVector(int i)
	{
		return this.matrix[i].clone();
	}
	
	public int[] getColumnVector(int i)
	{
		int[] columnVector = new int[this.column];
		
		for(int k = 0; k < this.row; k++)
			columnVector[k] = matrix[k][i];
		
		return columnVector.clone();
	}
	
	/**
	 * Devuelve el numero de filas
	 * @return
	 */
	public int getRowDimension() 
	{
		return this.row;
	}
	
	/**
	 * Devuelve el numero de columnas
	 * @return
	 */
	public int getColumnDimension() 
	{
		return this.column;
	}
	
	public String toString()
	{
		StringBuffer returnValue = new StringBuffer();
		
		for(int i = 0; i < this.row; i++)
		{
			returnValue.append(Arrays.toString(this.matrix[i]) + "\n");
		}
		return returnValue.toString();
	}
	
	/**
	 * Declaracion abstracta del metodo cuya implementacion
	 * sera el algoritmo de multiplicacion de matrices
	 * @param secondMatrix
	 * @return
	 */
	public abstract int[][] multiply(Matrix secondMatrix);
	
}