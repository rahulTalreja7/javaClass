public class MatrixAdd{
	public static void main (String[] args){
		int [][] a= {{1,2},{3,4}};
		int [][] b= {{4,6},{7,8}};
		int [][] c= new int[2][2];
		
		for (int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		//printing c
		for (int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				System.out.printf ("%3d ", c[i][j]);
			}
			System.out.println();
		}
		
	}
}