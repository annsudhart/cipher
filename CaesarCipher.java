import java.util.Scanner;
public class CaesarCipher {
	private Scanner code = new Scanner(System.in);
	public CaesarCipher(){}
	public void decipher(){
		System.out.println("How many letters would you like to shift? ");
		int shift = code.nextInt();
		System.out.println("Type code: ");
		String part1 = code.next();
		String part2 = code.nextLine();
		String message = part1 + part2;
		message = message.toLowerCase();
		System.out.println(message);
		int index = 0;
		while(index <= (message.length()-1)){
			if((message.charAt(index) < 'a') || (message.charAt(index) > 'z')){
			System.out.print(message.charAt(index));
			index++;
			}else{
				if(message.charAt(index) + shift > 122){
					System.out.print((char)(message.charAt(index) + shift - 26));
					index++;
				}else{
					if(message.charAt(index) + shift < 97){
						System.out.print((char)(message.charAt(index) + shift + 26));
					}else{
					System.out.print((char)(message.charAt(index) + shift));
					index++;
					}
				}
			}
		}
	}
	
	public void cTest(){
			char c = 125;
			System.out.println(c);
	}
	
	public static void main(String[]args){
		/*
		 * Some fun codes you can try: "max ytnem, wxtk uknmnl, ebxl ghm bg hnk lmtkl unm bg hnklxeoxl", shift 7
		 * 
		 */
		CaesarCipher c = new CaesarCipher();
		c.cTest();
	}
}

