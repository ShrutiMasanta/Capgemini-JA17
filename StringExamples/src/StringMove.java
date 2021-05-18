
public class StringMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Purpose Of Our Lives Is To Be Happy!!!";
        System.out.println("Before Operation:   " + str);
        System.out.println("After Operation:    " + move(str));

	}
	
	static public String move(String str)
    {
        // take length of given string
        int len = str.length();
 
        // low store lowercase alphabets
        String low = "";
 
        // upr store uppercase alphabets
        String upr = "";
 
        // traverse string forst char to last char
        char ch;
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
 
            // check char is in uppercase or lower case
            if (ch >= 'A' && ch <= 'Z') {
                upr += ch;
            }
            else {
                low += ch;
            }
        }
        return low + upr;
    }

}
