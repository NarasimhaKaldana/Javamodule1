package strings;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		byte bytes[] = {65, 66,67,68,69};
		
		String str = new String(bytes);      
		System.out.println(str.length());           
		System.out.println(str);
		str = "Welcome to ust global";
		bytes = str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
			
		}
		char chars[] = {'U','S','T',' ','G'};
		str = new String(chars);
		System.out.println(str);
		str.getChars(0,chars.length-1,chars,0);
		for(char c : chars) {
			System.out.println(c);
		}
		String string = new String("She sells sea shells in sea shore");
	   /* int count=0;
		for(int i=0; i< string.length();i++) {
		if(string.charAt(i)== 'S')
			count++;
		}*/
		
		
		
		String words[] = string.split(" ");
		System.out.println(words.length);
        for(String word:words) {
        	System.out.println(word);
        	
        }
        string = new String("Cartoon");
        System.out.println(string.startsWith("Car"));
        System.out.println(string.endsWith("toon"));
        int apos = string.indexOf('a');
        int tpos = string.indexOf('t');
        
        String string2 = string.substring(apos, tpos);
        string2 = string.substring(tpos);
        System.out.println(string2);
        
        
		/*
		 * string = new String("madamdam"); int dpos = string.lastindexOf('d');
		 * System.out.println(dpos); string2 = string.substrings(dpos,string.length());
		 * System.out.println

(string2); String email = new String
		 */
        
        String str1 = new String("welcome");
        String str2 = new String("weLCOME");
	    boolean result = str1.equals(str2);
	    System.out.println(result);
	    
	    int val = str2.compareTo(str1);
	    System.out.println(val);
	    
	    string = "Diehard";
	    System.out.println(string.toLowerCase());
	    System.out.println(string);
	    System.out.println(string.toUpperCase());
	    System.out.println(string);
//"16-11-477/6/A/3 Hyderabad 500036"

	
	}

}
