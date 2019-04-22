package re;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import com.osf.sp.ioc4.Person;

public class PropertiesContext {
	static Map<String,Object> ac = new HashMap<String,Object>();
	public static void main(String[] args) {
		InputStream is = PropertiesContext.class.getResourceAsStream("/src/main/java/");
		Properties p = new Properties();
		try {
			p.load(is);
			Iterator<Object> it = p.keySet().iterator();
			while(it.hasNext()) {
				Object key = it.next();
				String className = p.getProperty(key.toString());
				System.out.println("key : " + className);
				Class clazz = Class.forName(className);
				ac.put(key,clazz.newInstance());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person p = (Person)ac.get("p");
	}
	public Object getBean(String id) {
		return ac.get("p");
	}
	public static void main(String[] args) {
		PropertiesContext
	}
}
