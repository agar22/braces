import java.util.ArrayList;

public class Braces {

	public static void main(String[] args) { 
		String[] values=new String[5];
		values[0]="{[()]}";
		values[1]="{[(])}";
		values[2]="{{[[(())]]}}";
		values[3]="{(()()))(}]";
		values[4]="{}[[()]{}]";
		String[] result=method(values);
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
	public static String[] method(String[] values)
	{
		String [] result=new String[values.length];
		
		for(int i=0; i<values.length; i++)
		{
			String str1=values[i];
			if(str1.length()%2!=0)
			{
				result[i]="No";
			}
			else
			{
				ArrayList<Character> List=new ArrayList<Character>();
				for(int index=0; index<str1.length(); index++)
				{
					List.add(str1.charAt(index));
				}
				char lastChar=List.get(0);
				int lastIndex=0;
				for(int k=0; k<List.size(); k++)
				{
					if(List.get(k)=='{')
					{
						lastChar='{';
						lastIndex=k;
					}
					else if(List.get(k)=='[')
					{
						lastChar='[';
						lastIndex=k;
					}
					else if(List.get(k)=='(')
					{
						lastChar='(';
						lastIndex=k;
					}
					else
					{
						if(List.get(k)=='}'&& lastChar!='{')
						{
							break;
						}
						else if(List.get(k)==']'&& lastChar !='[')
						{
							break;
						}
						else if(List.get(k)==')'&& lastChar!='(')
						{
							break;
						}
						else
						{
							List.remove(k);
							List.remove(lastIndex);
							k=0;
							lastIndex=0;
							if(List.isEmpty())
							{
								break;
							}
							lastChar=List.get(0);
						}
					}
				}
				if(List.isEmpty())
				{
					result[i]="Yes";
				}
				else
				{
					result[i]="No";
				}
			}
		}
		
		return result;
	}
	/*public static boolean isPaired(char character, int index, String str)
	{
		if(index==str.length()-1)
		{
			return false;
		}
		
		
		return true;
	}*/

}
/*for(int i=index; i<str.length(); i++)
		{
			if(str.charAt(i)=='{')
			{
				isPaired(str.charAt(i+1), i+1, str);
			}
			else if(str.charAt(i)=='[')
			{
				isPaired(str.charAt(i+1), i+1, str);
			}
			else if(str.charAt(i)=='(')
			{
				isPaired(str.charAt(i+1), i+1, str);
			}
			else
			{
				if(character=='}' && str.charAt(index-1)!='{')
				{
					return false;
				}
				else if(character==')' && str.charAt(str.charAt(index-1))!='(')
				{
					return false;
				}
				else if(character==']'&&str.charAt(str.length()-(index+1))!='[')
				{
					return false;
				}
			}
		}
*/


/*

//	System.out.println(values[0]);
	//	boolean isBalanced=true;
		String[] result=new String[values.length];
		for(int index=0; index<values.length; index++) {
			String str1=values[index];
			ArrayList<Character> List=new ArrayList<Character>(); 
				for(int i=0; i<str1.length(); i++)
				{
					List.add(str1.charAt(i));
				}
				for(int test=0; test<List.size(); test++)
				{
					System.out.print(List.get(test) );
				}
			int lastIndex=0;
			char lastChar=List.get(0);
			int i=1;
				while(i<2){
					System.out.println("Check 1");
					System.out.println();
					if(List.get(i)=='}'){
						System.out.println("Check 2");
						if(lastChar=='{'){
							System.out.println("Check 3");
							List.remove(i);
							List.remove(lastIndex);
							i=0;
						}
					}
					else if(List.get(i)==']') {
						if(lastChar=='['){
							List.remove(i);
							List.remove(lastIndex);
							i=1;
						}
					}
					else if(List.get(i)==')') {
						if (lastChar=='('){
							List.remove(i);
							List.remove(lastIndex);
							i=1;
						}
					}
					
					else{
						lastChar=List.get(i);
						lastIndex=i;
						i++;
					}
					i++;
					
				}
				if(List.isEmpty()==true)
				{
					result[index]="Yes";
				}
				else
				{
					result[index]="no";
				}	
				
		}	
*/