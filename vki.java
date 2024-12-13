package derIciCalismalar;
import java.util.Scanner;
public class vki {
	public static void main(String[] args){
		Scanner oku=new Scanner(System.in);
		System.out.println("Boyunuz:");
		float boy=oku.nextFloat();
		System.out.print("Kilonuz:");
		float kilo=oku.nextFloat();
		oku.close();
		float vki=kilo/(boy*boy);
		System.out.println("Boy kilo indeksiniz: "+vki);
		System.out.print("Boy kilo indeksinize göre sonucunuz: ");
		if(vki<18.5) {
			System.out.print("Zayıf");
		}
		else if(vki<25) {
			System.out.print("Sağlıklı");
		}
		else if(vki<30) {
			System.out.print("Şişman");
		}
		else if(vki<40) {
			System.out.print("Obez");
		}
		else{
			System.out.print("Aşırı obez");
		}
		
	}
}
