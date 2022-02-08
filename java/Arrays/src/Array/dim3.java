package Array;

public class dim3 {
	public static void main(String[] args) {
		int three[][][]=new int[3][4][5];
		int i,k,l=0;
		for( i=0;i<3;i++) 
			for(k=0;k<4;k++)
				for(l=0;l<5;l++)
			three[i][k][l]=i*k*l;
		
		for(i=0;i<3;i++) {
			for(k=0;k<4;k++) {
				for(l=0;l<5;l++)
			System.out.print(three[i][k][l]+" ");
			System.out.println();
		}
		System.out.println();
	}
	}

}
