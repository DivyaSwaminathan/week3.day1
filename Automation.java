package week3.day1;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation myAuto=new Automation();
		myAuto.ruby();
		myAuto.Java();
		myAuto.Selenium();
		myAuto.python();

	}

	public void Selenium() {
		System.out.println("This is from testtool interface Selenium");

	}

	public String Java() {
		System.out.println("This is from language interface Java");
		return "Java";
	}

	@Override
	public void ruby() {
		System.out.println("This is unimplemented/abstract method from abstract class -- ruby ");

	}

}
