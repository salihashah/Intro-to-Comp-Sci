
public class lesson3point2strings {

	public static void main(String[] args) {

		
		
		System.out.println("a\\b\\c\"d\"");
		
		System.out.println("\\t is a tab, \\n is a new line, \\\" prints a \"quote\"");
		
		System.out.println("\"line one\n \\line \t two\\");
		
		System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline comment*\\"); 
		
		System.out.println("\"\\\\\"\\\"\"\n\t\\\"\\\"\"\"\"\\\n\\\"\"\"\"\\");
		
		System.out.println("Birthday".toUpperCase());
		
		String word="it's my party";
		System.out.println(word.substring(0,4)+" "+ word.substring(9,10)+" "+"\""+ word.substring(8,13).toUpperCase()+"\"");
		
		String word1="whose a whats it";
		System.out.println(word1.substring(0,6).toUpperCase()+"\n"+"is" +" "+ word1.substring(8,12).toUpperCase());
		
		String word2= "Every Way The Wind Blows";
		System.out.println(word2.substring(0,6).toLowerCase()+ word2.substring(6,10).toUpperCase()+word2.substring(10,14).toLowerCase()+"\\"+word2.substring(14,18).toUpperCase()+"\\"+ word2.substring(18,24).toLowerCase()+" "+4);
				
		String word3= "Peter Piper Picked A Peck Of Pickled Peppers";
		System.out.println(word3.substring(19,22)+word3.substring(22,36).toLowerCase()+"           "+word3.substring(37,44).toLowerCase()+" "+word3.substring(0,12)+"      "+word3.substring(29,36).toLowerCase());
		
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
