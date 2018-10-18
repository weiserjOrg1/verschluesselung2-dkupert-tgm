package dkupert.cipher;

import javax.swing.*;

import dkupert.cipher.Exceptions.CipherException;

import java.awt.*;
import java.awt.ActiveEvent.*;
import java.awt.event.*;

/**
 * 
 * @author dkupert
 * @version 2018-10-18
 */
public class GUICipherController implements ActionListener{
	private GUICipherModel m1;
	private GUICipherView v1;
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.v1.isB1(e)) {
			try {
				v1.changeMod();
			} catch (NumberFormatException | CipherException e1) {
				v1.exceptionMessage(e1.toString());
			}
			v1.refresh();
		}
		if(this.v1.isB2(e)) {
			v1.b2Reset();
			v1.refresh();
		}
		if(this.v1.isB3(e)) {
			v1.Encrypt();
			v1.refresh();
		}
		if(this.v1.isB4(e)) {
			v1.b4Reset();
			v1.refresh();
		}
		if(this.v1.isB5(e)) {
			v1.Decrypt();
			v1.refresh();
		}
		if(this.v1.isB6(e)) {
			v1.b6Reset();
			v1.refresh();
		}
		
	}
	public GUICipherController() {
		this.m1 = new GUICipherModel();
		this.v1 = new GUICipherView(this.m1, this);
		
		
	}


}
