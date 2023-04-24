package sowmyamaam.string;

public class P19_FrequencyOfChar {
	public static void main(String[] args) {
		String a="hello hi hello hi hi";
		String[] b=a.split(" ");
		for (int i = 0; i < b.length; i++) {
			int count=1;
			for (int j = 0; j < b.length; j++) {
				if (b[i].equals(b[j])&& b[j]!=" " && i!=j) {
					b[j]=" ";
					count++;
				}
			}
			if (count>0 && b[i]!=" ") {
				System.out.println(b[i]+" is present "+count+" time(s)" );
			}
		}
		System.out.println();
	}

}
