/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tibco.security.AXSecurityException;
import com.tibco.security.ObfuscationEngine;
import com.tibco.security.SecRTException;
/**
 *
 * @author 23113901
 */
public class ObfuscationEngineMethodCalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
	if (args[0].equals("decrypt")) {
		
            if (args[1].startsWith("#!")) {
			
		try {
                    
                    char[] decryptedValue = ObfuscationEngine.decrypt(args[1]);
                                                               
                    System.out.print("\n\nEncrypted value was decrypted successfully. Decrypted value is shown below...\n");
                    System.out.print("*******************************************************************************\n");
                    System.out.print(decryptedValue);
                    System.out.print("\n*******************************************************************************\n");
			
		} catch (AXSecurityException e) {
                    
                    System.out.print("\nThere was an unexpected error:\n");
                    e.printStackTrace();
		
                }
			  
            } else if (args[1].matches("[0-9]+")) {
			
		try{
				
                    String deobfuscatedValue;
                    deobfuscatedValue = new String(ObfuscationEngine.DeObfuscate(args[1].getBytes()));
																   
                    System.out.print("\n\nObfuscated value was deobfuscated successfully. Deobfuscated value is shown below...\n");
                    System.out.print("*******************************************************************************\n");
                    System.out.print(deobfuscatedValue);
                    System.out.print("\n*******************************************************************************\n");
				
		} catch (SecRTException e){
                    System.out.print("\nThere was an unexpected error:\n");
                    e.printStackTrace();
		}
				
            } else {
				
                System.out.print("\n\nERROR: The input value does not match any tibco encryption/obfuscation format. Terminating...\n");
		System.exit(0);
				
            }
			
        } else if (args[0].equals("encrypt")) {

            try {
                char[] encryptedValue;
                encryptedValue = ObfuscationEngine.encrypt(args[1].toCharArray()).toCharArray();
                
                System.out.print("\n\nValue was encrypted successfully. Encrypted value is shown below...\n");
                System.out.print("*******************************************************************************\n");
                System.out.print(encryptedValue);
                System.out.print("\n*******************************************************************************\n");
            } catch (AXSecurityException e) {
                
                System.out.print("\nThere was an unexpected error:\n");
                e.printStackTrace();
                
            }
                
        } else if (args[0].equals("obfuscate")) {

            String obfuscatedValue;
            obfuscatedValue = new String(ObfuscationEngine.Obfuscate(args[1].getBytes()));
                                                               
            System.out.print("\n\nValue was obfuscated successfully. Obfuscated value is shown below...\n");
            System.out.print("*******************************************************************************\n");
            System.out.print(obfuscatedValue);
            System.out.print("\n*******************************************************************************\n");
			
		}
    }
}
