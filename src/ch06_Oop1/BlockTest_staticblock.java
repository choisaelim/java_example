package ch06_Oop1;
class BlockTest_staticblock {

	static {
		System.out.println("static { }");
	}

	{
		System.out.println("{ }");
	}

	public BlockTest_staticblock() {     
		System.out.println("»ý¼ºÀÚ");
	}

	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest_staticblock bt = new BlockTest_staticblock();

		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest_staticblock bt2 = new BlockTest_staticblock();
	}
}
