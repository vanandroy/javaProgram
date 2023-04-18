package String;

class NoOfVowel
{
	public static void main(String []agrs){
		String s="apple";
		int count=s.length();
		int vo=0,co=0,tc=0;
		for(int i=0;i<count;i++)
		{
			char ch=s.charAt(i);
			tc++;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vo++;
			else 
				co++;
		}
		System.out.println("total letter = "+tc);
		System.out.println("vowels = "+vo);
		System.out.println("consonent ="+co);
	}
}