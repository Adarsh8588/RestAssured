package serialization;

import org.testng.annotations.Test;

public class arraySplit {
@Test
	public void array() {
		
		int[]a= {4,5,8};
		int[] b= {2,7,4};
		int[]c=new int[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]<10) {
				System.out.print(c[i]+",");
			}else {
				System.out.print((c[i]/10)+","+(c[i]%10+","));
			}
		}
	}
	

	

}
