package encapsulation;

public class MakeReport {

	StringBuffer buffer = new StringBuffer(); //내부적으로 늘어날 수 있는 buffer 가지고 있는 클래스에다가 쭉 String을 연결하고 나중에 String값으로 리턴하는걸로 많이씀 =>StringBuffer,StringBilder를 많이씀

	private String line = "============================================\n";
	private String title = " 이름\t    주소\t\t  전화번호  \n";

	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);

	}

	private void generateBody() {
		buffer.append("James  \t");
		buffer.append("Seoul Korea  \t");
		buffer.append("010-2222-3333 \n");

		buffer.append("Tomas  \t");
		buffer.append("NewYork US  \t");
		buffer.append("010-7777-8888 \n");

	}
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
