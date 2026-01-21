class Matrix
{
    private int [][] matrix;

    public Matrix(int[][] m)
    {
        this.matrix = m;
    }

    public int[][] addMatrix(Matrix other)
    {
        int rows = this.matrix.length;
        int cols = this.matrix[0].length;
         
        int[][] result = new int[rows][cols];

        for(int i=0; i < matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length; j++)
            {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];

            }
        }
        return result;
    }

    public static void displaymatrix(int[][] mat)
    {
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
        int[][] array1 = {{1,2,3},{1,2}};
       
       int[][] array2 = {{2,2,2},{3,3}};
	   
	   Matrix m1 = new Matrix(array1);
	   Matrix m2 = new Matrix(array2);
	   

       int[][] sum = m1.addMatrix(m2);

		System.out.println("Sum of two matrices:");
        displaymatrix(sum);


    }
}