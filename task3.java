public class MatrixSum
{
	private int[][] matrix;
	
	public MatrixSum(int[][] M)
	{
		this.matrix = M;
	}
	
	public int[][] addMatrices(MatrixSum other)
	{
		
		for(int i=0; i < matrix.length; i++)
		{
			for(int j=0; j < matrix[i].length; j++)
			{
				result[i][j] = this.matrix[i][j] + other.matrix[i][j];
			}
		}
		return result;
	}
	
	public static void display(int[][] mat)
	{
		for(int i=0; i < mat.length; i++)
		{
			for(int j=0; j < mat[i].length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			 System.out.println();
		}
	}
	
	
	
	public static void main(String[] args)
	{
		int [][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] m2 = {{1,1,1},{2,2,2},{3,3,3}};
		
		MatrixSum a = new MatrixSum(m1);
		MatrixSum b = new MatrixSum(m2);
		
		int[][] sum = a.addMatrices(b);
		
		 System.out.println("Sum of two matrices:");
		 displayMatrix(sum);
	}
	
}

	
