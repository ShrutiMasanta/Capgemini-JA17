
public class removeSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "India is my country";  
        System.out.println(charRemoveAt(str, 7));  
     }  
     
	public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  

}
