package jCompanyCafe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuSelect extends Logo {

	public static JLabel lblList;
	private JLabel lblMenu1, lblMenu2, lblMenu3, lblMenu4, lblMenu5, lblMenu6, lbl1;
	private JButton btnMenu1, btnMenu2, btnMenu3, btnMenu4, btnMenu5, btnMenu6, btnPay;
	private int price; // 해당 메뉴의 가격
	public static int totalPrice;

	public MenuSelect(MainFrame f) {

		super(f);

		// 버튼에 이미지 삽입을 위한 객체 생성
		ImageIcon americano = new ImageIcon("image/americano.jpg");
		ImageIcon cafelatte = new ImageIcon("image/cafelatte.jpg");
		ImageIcon cafemoca = new ImageIcon("image/cafemoca.jpg");
		ImageIcon espresso = new ImageIcon("image/espresso.jpg");
		ImageIcon greentealatte = new ImageIcon("image/greentealatte.jpg");
		ImageIcon chocolatte = new ImageIcon("image/chocolatte.jpg");

		btnMenu1 = new JButton(americano); // 버튼 생성
		// 버튼이 눌렸을 때 이벤트 지정
		btnMenu1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
            	// MenuInfomation의 라벨에 선택된 메뉴명 출력
            	MenuInfomation.lblMenuName.setText("아메리카노");
            	MenuInfomation.selectedMenu="아메리카노";
            	price=2500;
            	// 재주문을 위해 초기화함
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	// 다음 패널로 넘어감
            	F.nextPanel();
            }
        });
		btnMenu1.setBackground(new Color(255,255,255)); // 배경색 지정
		btnMenu1.setBounds(75, 140, 150, 150); // 절대 위치 지정
		add(btnMenu1);

		lblMenu1 = new JLabel("<html>아메리카노<br> &nbsp; 2500원</html>"); // 라벨 생성
		lblMenu1.setFont(new Font("맑은 고딕", Font.BOLD, 15)); // 폰트 설정
		lblMenu1.setBounds(110, 295, 100, 50); // 절대 위치 지정
		add(lblMenu1);

		btnMenu2 = new JButton(cafelatte);
		btnMenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText(" 카페라떼");
            	MenuInfomation.selectedMenu="카페라떼";
            	price=3000;	
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu2.setBackground(new Color(255,255,255));
		btnMenu2.setBounds(280, 140, 150, 150);
		add(btnMenu2);

		lblMenu2 = new JLabel("<html>카페라떼<br> &nbsp;3000원</html>");
		lblMenu2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblMenu2.setBounds(320, 295, 100, 50);
		add(lblMenu2);

		btnMenu3 = new JButton(cafemoca);		
		btnMenu3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText(" 카페모카");
            	MenuInfomation.selectedMenu="카페모카";
            	price=3500;           	
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu3.setBackground(new Color(255,255,255));
		btnMenu3.setBounds(485, 140, 150, 150);
		add(btnMenu3);

		lblMenu3 = new JLabel("<html>카페모카<br> &nbsp;3500원</html>");
		lblMenu3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblMenu3.setBounds(530, 295, 100, 50);
		add(lblMenu3);

		btnMenu4 = new JButton(espresso);		
		btnMenu4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText("에스프레소");
            	MenuInfomation.selectedMenu="에스프레소";
            	price=2000;
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu4.setBackground(new Color(255,255,255));
		btnMenu4.setBounds(75, 370, 150, 150);
		add(btnMenu4);

		lblMenu4 = new JLabel("<html>에스프레소<br> &nbsp; 2000원</html>");
		lblMenu4.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblMenu4.setBounds(110, 530, 100, 50);
		add(lblMenu4);

		btnMenu5 = new JButton(greentealatte);		
		btnMenu5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {           	
            	MenuInfomation.lblMenuName.setText(" 녹차라떼");
            	MenuInfomation.selectedMenu="녹차라떼";
            	price=3000;           	
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);           	
            	F.nextPanel();
            }
        });
		btnMenu5.setBackground(new Color(255,255,255));
		btnMenu5.setBounds(280, 370, 150, 150);
		add(btnMenu5);

		lblMenu5 = new JLabel("<html>녹차라떼<br> &nbsp;3000원</html>");
		lblMenu5.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblMenu5.setBounds(320, 530, 100, 50);
		add(lblMenu5);

		btnMenu6 = new JButton(chocolatte);		
		btnMenu6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText(" 초코라떼");
            	MenuInfomation.selectedMenu="초코라떼";
            	price=3000;
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu6.setBackground(new Color(255,255,255));
		btnMenu6.setBounds(490, 370, 150, 150);
		add(btnMenu6);	

		lblMenu6 = new JLabel("<html>초코라떼<br> &nbsp;3000원</html>");
		lblMenu6.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblMenu6.setBounds(530, 530, 100, 50);
		add(lblMenu6);

		btnPay = new JButton("결제하기");
		// '결제하기' 버튼이 눌렸을 때 이벤트 지정
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				// 결제 금액을 계산해서 저장함
				totalPrice = (price*MenuInfomation.count)+(MenuInfomation.sizePay*MenuInfomation.count);
				// PaymentHistory의 라벨에 결제 금액 출력함
            	PaymentHistory.lblSum.setText(totalPrice+"원");
            	// 재주문을 위해 주문내역 초기화 시킴
            	lblList.setText("");
            	// 두개의 패널이 넘어감 (MenuInfomation 패널을 출력하지 않음)
            	F.jumpPanel();
            }
        });
		btnPay.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnPay.setBackground(new Color(217,242,192));
		btnPay.setForeground(new Color(26,116,2));
		btnPay.setBounds(440, 630, 200, 50);
		add(btnPay);

		lbl1 = new JLabel("주문내역");
		lbl1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lbl1.setBounds(75, 630, 80, 50);
		add(lbl1);
		
		// 선택한 메뉴와 정보를 출력하는 라벨
		lblList = new JLabel();
		lblList.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lblList.setBounds(170, 630, 250, 50);
		lblList.setForeground(new Color(26,116,2));
		add(lblList);

		setVisible(true);
	}
}
