//等腰三角形
public class CopyOfCopyOfPrint03 {
public static void main(String[] args) {
	//行数
	for(int i=1;i<=5;i++){
		//空格
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
		}
		//列数
		for(int j=1;j<=(2*i)-1;j++){
		System.out.print("*");	
		}
		System.out.println();
	}
}
}
