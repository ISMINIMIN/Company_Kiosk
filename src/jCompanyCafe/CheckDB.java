package jCompanyCafe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CheckDB extends Logo {

	String tfid, tfpw, id, pw;
	public static int totalprice;
	
	Connection connection = null;
	ResultSet resultset = null;
	Statement statement = null;

	int result = 1;

	String url = "jdbc:mysql://localhost:3306/jcompany?characterEncoding=UTF-8&serverTimezone=UTC";

	void check(String tfid, String tfpw) {

		this.tfid = tfid;
		this.tfpw = tfpw;

		try {
			// 동적으로 MySQL의 JDBC 드라이버 클래스 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 자바 어플리케이션을 JDBC 드라이버에 연결시켜주는 클래스
			connection = DriverManager.getConnection(url, "root","1111");
			// SQL문을 실행하여 실행 결과를 넘겨줌
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from employeeinfo");
			
			while(resultset.next()) { // 다음 행으로 이동
				id = resultset.getString("employeenum");
				pw = resultset.getString("password");
				// DB의 사원번호와 입력한 사원번호가 일치하면
				if (id.equals(tfid)) {
					// DB의 비밀번호와 입력한 비밀번호가 일치하면
					if (pw.equals(tfpw)) {
						thread.start();
						lbl2.setText("");
						// 다음 패널로 넘어감
						F.nextPanel();
					} else { // 비밀번호가 일치하지 않으면
						// 알림 메세지 출력
						lbl2.setText("비밀번호가 일치하지 않습니다.");
					}
				} else { // 사원번호가 일치하지 않으면
					// 알림 메세지 출력
					lbl2.setText("사원번호가 일치하지 않습니다.");
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러");
		}
	}

	public static Thread thread;
	public static int delayTime;
	private JLabel lbl1, lblID, lblPW;
	public static JLabel lbltimer;
	private JButton btnOK, btnReInput;
	private JTextField tfID, tfPW;
	public static JLabel lbl2;

	public CheckDB(MainFrame f) {

		super(f);

		lbltimer = new JLabel(); // 라벨 생성
		lbltimer.setFont(new Font("함초롬돋움", Font.ITALIC, 30)); // 폰트 설정

		TimerRunnable runnable = new TimerRunnable(lbltimer); // 스레드 객체 생성

		lbl1 = new JLabel("사원번호와 비밀번호를 입력해주세요");
		lbl1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lbl1.setBounds(180, 200, 400, 40); // 절대 위치 설정
		add(lbl1);

		lbl2 = new JLabel();
		lbl2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lbl2.setForeground(new Color(255,0,0));
		lbl2.setBounds(230 , 240, 400, 40);
		add(lbl2);

		lblID = new JLabel("사원번호");
		lblID.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblID.setBounds(150, 300, 100, 70);
		add(lblID);

		lblPW = new JLabel("비밀번호");
		lblPW.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblPW.setBounds(150, 380, 100, 70);
		add(lblPW);

		tfID = new JTextField(20); // 텍스트 필드 생성
		tfID.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		tfID.setBounds(280, 315, 250, 40);
		add(tfID);

		tfPW = new JTextField(20);
		tfPW.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		tfPW.setBounds(280, 395, 250, 40);
		add(tfPW);

		btnOK = new JButton("확인");
		// 버튼이 눌렸을 때 이벤트 지정
		btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	for(int i=1; i<2; i++) {
            		thread = new Thread(runnable); // 스레드 생성
            	}
            	// 지연 시간이 1로 초기화
            	delayTime=1;
            	// 스레드를 구현하려 했지만 초기화 하는 방법을 알아내지 못하여 키오스크가 한번만 동작하는 오류가 발생하여 주석 처리함
            	// 첫 번째 주문에서는 스레드 정상 동작
            	//thread.start();

            	tfid = tfID.getText(); // 텍스트 필드에 입력한 사원번호를 tfid에 저장
            	tfpw = tfPW.getText(); // 텍스트 필드에 입력한 비밀번호를 tfpw에 저장
            	
            	check(tfid,tfpw); // check() 메서드 호출
            	
            	// 재입력을 위한 텍스트 필드 초기화
            	tfID.setText("");
            	tfPW.setText("");
            }
        });
		btnOK.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnOK.setBackground(new Color(217,242,192));
		btnOK.setForeground(new Color(26,116,2));
		btnOK.setBounds(210, 610, 120, 50);
		add(btnOK);

		btnReInput = new JButton("재입력");
		// 버틀이 눌렸을 때 이벤트 지정
		btnReInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// 텍스트 필드와 오류 알림 라벨 초기화 시킴
            	tfID.setText("");
            	tfPW.setText("");
            	lbl2.setText("");
            }
        });
		btnReInput.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnReInput.setBackground(new Color(217,242,192));
		btnReInput.setForeground(new Color(26,116,2));
		btnReInput.setBounds(370, 610, 120, 50);
		add(btnReInput);
		
		setVisible(true);
	}

	class TimerRunnable implements Runnable {

		private JLabel lblTimer;
		
		public TimerRunnable(JLabel lblTimer) {
			this.lblTimer = lblTimer;
		}

		@Override
		public void run( ) {
			
			delayTime = 1;

			while(true) {
				lblTimer.setText(Integer.toString(delayTime));
				delayTime++;

				try {
					Thread.sleep(1000); // 스레드가 1초 단위로 동작
				} catch(InterruptedException e) {
					return; // 예외가 발생하면 스레드 종료함
				}
				
				// 대기시간이 10가 되면
				if(delayTime==10) {
					// PayComplete의 대기 번호가 1씩 증가함
					PayComplete.waitNum++;
					// PayComplete의 대기 번호 출력
					PayComplete.lblWaitNumber.setText(PayComplete.waitNum+ "번");
					// 타이머 스레드 강제 종료
	        		thread.interrupt();
	        		// 다음 패널로 넘어감
	        		F.nextPanel();
				}
			}
		}
	}
}