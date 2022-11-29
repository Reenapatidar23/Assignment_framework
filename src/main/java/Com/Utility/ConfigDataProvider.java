package Com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pr;
	public ConfigDataProvider() throws IOException
	{
	String path=System.getProperty("user.dir")+"\\Config\\Config.Properties";
	FileInputStream file=new FileInputStream(path);
	 pr=new Properties();
	pr.load(file);
	
	
}
	public String getStageURL(){
	return pr.getProperty("StageURL");
	}
	{
		
	}
}


