package multiplicacion_Matrices;

public class MultiplierThread implements Runnable 
{

	private int[] rowVector;
	private int[] columnVector;
	private int result;
	
	private int cell;
	private int columns;
	private int rows;
	
	/**
	 * Constructor parametrizado
	 * @param rowVector
	 * @param columnvector
	 */
	public MultiplierThread(int[] rowVector, int[] columnvector) 
	{
		super();
		this.rowVector = rowVector;
		this.columnVector = columnvector;
	}
	
	/**
	 * Constructor #1 - 
	 * @param columns
	 * @param rows
	 */
	public MultiplierThread(int row1, int columns1)
	{
		this.rows = row1;
		this.columns = columns1;
	}

	public int[] getRowVector()
	{
		return rowVector;
	}
	
	public void setRowVector(int[] rowVector) 
	{
		this.rowVector = rowVector;
	}
	
	public int[] getColumnVector()
	{
		return columnVector;
	}
	
	public void setColumnVector(int[] columnVector)
	{
		this.columnVector = columnVector;
	}
	
	public int getCell(int x, int y) {
		return cell;
	}

	public void setCell(int res, int row, int column) {
		this.cell = res;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getResult()
	{
		return result;
	}
	
	public void setResult(int result)
	{
		this.result = result;
	}
	
	public void run()
	{
		int row = cell / columns;
		int column = cell % columns;
		
		for(int i = 0; i < rows; i++)
		{
			double t1 = getCell(row, i);
			double t2 = getCell(i, column);
			double temp = t1*t2;
			int res = (int) (getCell(row, column) + temp);
			setCell(res, row, column);
		}
	}
	
}
