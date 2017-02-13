package javaredis;

import org.testng.annotations.Test;

import redis.clients.jedis.Jedis;

import org.testng.annotations.BeforeMethod;

public class NewTest {

	private Jedis jedis;
  @BeforeMethod
  public void beforeMethod() {
	  jedis = new Jedis("192.168.163.130", 6379);
	  jedis.auth("admin");
  }

  @Test
  public void teststring(){
	  jedis.set("user", "xinxin");
	  System.out.println(jedis.get("user"));
	  
	  jedis.append("user", "is test");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
