package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;

/**
 * 
 * @author dkupert
 * @version 2018-10-18
 */
public class GUICipherModel {
	
	private MonoAlphabeticCipher mac;
	private ShiftCipher shiftc;
	private SubstitutionCipher subc;
	
	private String mode;
	
	public GUICipherModel() {
		this.mode = "normal";
		this.mac = new MonoAlphabeticCipher();		
		
	}
	
	public void changeMode(String mode, String parameter) throws NumberFormatException, CipherException{
		if(this.mode.equals(mode)) {
			
		}else {
			switch(mode) {
				case "shift" :
					this.mac = new MonoAlphabeticCipher();
					this.mac = new ShiftCipher(Integer.parseInt(parameter));
					this.mode = "shift";
				break;
				case "sub" :
					this.mac = new MonoAlphabeticCipher();
					this.mac = new SubstitutionCipher(parameter);
					this.mode = "shift";
				break;
			}
		} 
	}	
	
	public String decrypt(String text) {
		return this.mac.decrypt(text);
	}
	public String encrypt(String text) {
		return this.mac.encrypt(text);
	}
}
