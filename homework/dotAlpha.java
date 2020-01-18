package homework;

public class dotAlpha {
	String s;
	int k=0;
	public int dotalpha(String s) {
		if(s.contains("a")) {
			k++;
				}
			if(s.contains("e")){
				k++;
			}
			if(s.contains("i")) {
				k++;
				}
			if(s.contains("o")) {
				k++;
			}
			if(s.contains("u")) {
				k++;
			}
			return k;
	}

}
