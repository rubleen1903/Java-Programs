import java.util.Scanner;
class AddMatrix
{
public static void main(String args[])
{
int order,i,j;
int ordera;
Scanner in = new Scanner(System.in);
 
System.out.println("Order of Matrix");
order = in.nextInt();
ordera = in.nextInt();
 
int mat1[][] = new int[order][order];
int mat2[][] = new int[order][order];
int res[][] = new int[order][order];
 
 
for ( i= 0 ; i < order ; i++ )
{ 
 
for ( j= 0 ; j < order ;j++ )
mat1[i][j] = in.nextInt();
 

}

 
for ( i= 0 ; i < ordera ; i++ )
{
 
for ( j= 0 ; j < ordera ;j++ )
mat2[i][j] = in.nextInt();
 
}
 
for ( i= 0 ; i < order ; i++ )
for ( j= 0 ; j < order ;j++ )
res[i][j] = mat1[i][j] + mat2[i][j] ; 
 

 
for ( i= 0 ; i < order ; i++ )
{ 
for ( j= 0 ; j < order ;j++ )
System.out.print(res[i][j]+"\t");
 
System.out.println();
}
 
}
}