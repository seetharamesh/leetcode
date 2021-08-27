package leetpractice;

public class DefangIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String address = "1.1.1.1";
		for(int i=0;i < address.length(); i++) {
			char c = address.charAt(i);
			if(c == '.') {
				sb.append("[.]");
			}
			else sb.append(Character.toString(c));
		}
		System.out.println(sb);
	}

}
