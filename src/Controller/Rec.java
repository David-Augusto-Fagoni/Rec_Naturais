package Controller;

public class Rec {
	public int RecN(int N) {
		if (N==0) {
			return 0;
		}else {
			N = N + RecN(N-1);
			return N;
		}
	}
}
