package Controller;

public class Soma {
	public Soma() {
		super();
}
	
public static double SSerie(int n) {
    if (n == 1) {
        return 1.0;
    } else {
        return 1.0/n + SSerie(n - 1);
    }
}
}