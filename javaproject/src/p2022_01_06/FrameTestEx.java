package p2022_01_06;

import java.awt.*;
import java.awt.event.*;

public class FrameTestEx extends Frame {

    public FrameTestEx() {	//생성자
	
//	f = new Frame( "Frame Test" );
	super("Frame Test");	//부모클래스의 생성자 호출

	addWindowListener( new WindowAdapter() {
		    public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
		    }
        });
	
	setSize( 400, 300 );
	setLocation( 100, 100 );
	setBackground( Color.green );
	setVisible( true );
    }//생성자 end

    public static void main( String[] args ) {
		FrameTestEx ft = new FrameTestEx();
    }
}