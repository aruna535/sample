package Com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationClass {
	public static Properties pro;

	public   ConfigurationClass() throws IOException {
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Ipt\\Configuration\\Config.properties");
		
		FileInputStream fi=new FileInputStream(f);
		
		Properties pro=new Properties();
		
		pro.load(fi);
	}
		
		public String getUrl() {
			String url = pro.getProperty("Url");
			return url;
		}
		
		public String getUsername() {
			String username=pro.getProperty("Username");
			return username;
		}

		public String getPassword() {
			
			String password = pro.getProperty("Password");
			return password;
}
		
	}


