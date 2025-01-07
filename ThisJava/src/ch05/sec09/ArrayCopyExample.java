package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStr = {"java", "array", "copy"};
		String[] newStr = new String[5];
		System.arraycopy(oldStr,0,newStr,0,oldStr.length);
		for(int i =0; i<newStr.length;i++)
			System.out.println(newStr[i]);
	}

}
