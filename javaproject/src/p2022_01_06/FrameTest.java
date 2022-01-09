package p2022_01_06;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {
	
    private Frame f;					//필드

    public FrameTest() {				//생성자
		f = new Frame( "Frame Test" );	//frame객체 생성
		f.setSize( 400, 300 );	// 가로,세로 사이즈
		f.setLocation( 100, 100 );
		f.setBackground( Color.green );
		f.setVisible( true );		//true로 설정해야 화면에 출력
		f.setResizable(false);		//false이므로 사이즈 변경 불가능    

	f.addWindowListener( new WindowAdapter() {
		    public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
		    }
    });

	}//생성자 end

    public static void main( String[] args ) {
		FrameTest ft = new FrameTest();
		//					생성자 호출
    }
}