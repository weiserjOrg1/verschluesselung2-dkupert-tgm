package dkupert.cipher;
/**
 * Uses the parent class MonoAlphabeticCipher to encrypt and decrypt text
 * 
 * @author dkupert
 * @version 2018-10-10
 */
public class SubstitutionCipher extends MonoAlphabeticCipher {
	/**
	 * 
	 * @param secretAlphabet
	 */
	public SubstitutionCipher(String secretAlphabet) throws CipherException {
		super.setSecretAlphabet2(secretAlphabet);
	}

	/**
	 * 
	 * @param secretAlphabet
	 */
	public void setSecretAlphabet(String secretAlphabet) {
		super.setSecretAlphabet(secretAlphabet);
	}

}
