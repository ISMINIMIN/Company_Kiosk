package jCompanyCafe;

import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명
import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명

public class MainFrame extends JFrame {

	private CardLayout cardLayout = new CardLayout();

	public MainFrame() {
		setTitle("KIOSK PROGRAM"); // 타이틀 달기
		setSize(720, 770); // 프레임 크기 720x770
		getContentPane().setLayout(cardLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료버튼이 클릭될 때 프레임을 닫고 응용 프로그램이 종료하도록 하기 위해 사용함

		// 프레임에 연결된 컨텐트팬을 알아내 패널을 삽입함
		getContentPane().add("FirstPage", new EmployeeCheck(this));
		getContentPane().add("MenuPage", new MenuSelect(this));
		getContentPane().add("SelectPage", new MenuInfomation(this));
		getContentPane().add("DiscountPage", new Membership(this));
		getContentPane().add("PayPage", new PaymentHistory(this));
		getContentPane().add("DBPage", new CheckDB(this));
		getContentPane().add("LastPage", new PayComplete(this));

		setVisible(true); // 프레임 출력
	}

	public void nextPanel() {
		// 다음 패널로 넘어감
		cardLayout.next(this.getContentPane());
	}

	public void jumpPanel() { 
		// 두개의 패널이 넘어감
		cardLayout.next(this.getContentPane());
		cardLayout.next(this.getContentPane());
	}

	public void previousPanel() {
		// 이전 패널로 넘어감
		cardLayout.previous(this.getContentPane());
	}

	public static void main(String[] args) {
		MainFrame frame = new MainFrame(); 
	}
}
