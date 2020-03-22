import java.io.*;
public class gravamitjana {
	public static void main(String [] arg) {
		int[] array;
		array=cogerNumeros();
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	public static int[] cogerNumeros(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array;
		array = new int[5];
		int num=0;
		
		int cont=0;
		while(cont<5){
			cont++;
			try{
				for(int i=0;i<=5;i++){
				System.out.print("Introdueix valor "+(i+1)+": ");
				num=Integer.parseInt(reader.readLine());
				array[i]=num;
				}
			}catch(Exception e){
				System.out.println("Error: Introduce de nuevo");
			}
		}
		return array;
	}
}
