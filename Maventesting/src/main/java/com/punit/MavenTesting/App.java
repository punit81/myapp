package com.punit.MavenTesting;

/**
 * Hello world!
 *
 */
class StringConcatTest{
	public void Performance(String str,int n) {
		long start=System.nanoTime();
		for(int i=0;i<n;i++) {
			str=str+str;
		}
		System.out.println("Time taken by String to concatenate "+ n+" times is:"+(System.nanoTime()-start)/1000+"ms");
	}
}
class StringBufferConcatTest{
	public void Performance(StringBuffer stbuff,int n) {
		long start=System.nanoTime();
		for(int i=0;i<n;i++) {
			stbuff.append(stbuff);
		}
		System.out.println("Time taken by StringBuffer to concatenate "+n+" times is:"+(System.nanoTime()-start)/1000+"ms");
	}
}
class StringBuilderConcatTest{
	public void Performance(StringBuilder strbuild,int n) {
		long start=System.nanoTime();
		for(int i=0;i<n;i++) {
			strbuild.append(strbuild);
		}
		System.out.println("Time taken by StringBuilder to concatenate "+n+" times is:"+(System.nanoTime()-start)/1000+"ms");
	}
}

public class App 
{
    public static void main( String[] args )
    {
    	int n=24;
        System.out.println("This is a program to test efficiency of"
        		+ "String,StringBuffer and StringBuilder Concatenation operation(i.e over "+n+" concatenations) ");
        String str="Hello";
        System.out.println("This is the sample string for concatenation:"+str);
        StringConcatTest sct=new StringConcatTest();
        sct.Performance(str,n);
        StringBufferConcatTest sbct=new StringBufferConcatTest();
        sbct.Performance(new StringBuffer(str),n);
        StringBuilderConcatTest sbuildct=new StringBuilderConcatTest();
        sbuildct.Performance(new StringBuilder(str),n);
        
        
    }
}
