package Programs;

public class duplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1, 3, 2, 3, 4, 6, 3, 4 };
int count =0;
for(int i=0; i<a.length; i++) {
	for(int j =i+1; j<a.length; j++) {
		if(a[i]==a[j]) {
			count = count+1;
		}
	}
	if(count>0){
		System.out.println(a[i]);
	}
	count =0;
}
	}

}
