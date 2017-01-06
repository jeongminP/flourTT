package star;

public class diamond{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=i;j<4;j++){
				System.out.print(" ");
			}
			for(int k=i;k>0;k--){
				System.out.print("*");
			}
			for(int l=i;l>1;l--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<4;i++){
			for(int j=i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=i;k<4;k++){
				System.out.print("*");
			}
			for(int l=i;l<3;l++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}