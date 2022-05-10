package ch02_variable;

class CastingEx2 {
	public static void main(String[] args) {
		int i = 10;
		byte b = (byte) i;

		i = 300;
		b = (byte) i;

		b = 10;
		i = (int) b;

		b = -2;
		i = (int) b;

		System.out.println("i=" + Integer.toBinaryString(i));
	}
}
