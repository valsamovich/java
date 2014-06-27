package day3.interfaceex;

public class TestOffice {

	public static void main(String[] args) {
		
		Office obj = new Word();
		obj.open();
		obj.save();
		
		obj = new Excel();
		obj.open();
		obj.save();
		
		
	}

}
