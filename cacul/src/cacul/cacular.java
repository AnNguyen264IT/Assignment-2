package cacul;

public class cacular {
	public static Double divide(int a, int b) {
		if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return (double) a / b;
    }

  
}

