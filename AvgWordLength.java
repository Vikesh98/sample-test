//can you not do that? //3



import java.util.Scanner;

public class word_avg_length {

	public static void main(String[] args) 
	{
	int count1=0,count=0;
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();

	char [] ch=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		
		
		if(ch[i]!=' '&&ch[i]!='?')
			count++;
		else
			count1++;
	}
	count1++;
		
	float val=(float)count/count1;
	int val1=(int)val;
	if(val==val1)
	{
	System.out.println(val1);
	}
	else
	{
		val1++;
		System.out.println(val1);
	}
	}

}

