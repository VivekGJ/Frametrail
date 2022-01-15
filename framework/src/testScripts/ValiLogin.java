package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_test;
import generic.Generic_read_exel;
import pom.FBlogin;

public class ValiLogin extends Base_test
{
   @Test
   public void getLogged() throws EncryptedDocumentException, IOException 
   {
	   String uname = Generic_read_exel.getData("Sheet1", 0, 0);
	   String pwd = Generic_read_exel.getData("Sheet1", 0, 1);
	   FBlogin fb=new FBlogin(driver);
	   fb.setUsername(uname);
	   fb.setPassword(pwd);
	   fb.clickLogin();
	   
   }
}
