package lecture1;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportHeader reportHeader = ReportHeader.getInstance();
		reportHeader.printHeader();

	}

}
