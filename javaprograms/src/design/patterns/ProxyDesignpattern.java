package design.patterns;

public class ProxyDesignpattern {
	
 public static void main(String[] args)
 {
	 new Proxy().accessDelete("user1").delete();;
	 new Proxy().accessDelete("user2").delete();;
	 
 }
}

class Proxy
{
	public Applications accessDelete(String user)
	{
//		System.out.println("printing the user");
		
		if("user1".equals(user))
		{
			return new User();
		}
		return new Noaccess();
		
	}
}

interface Applications
{
	void login();
	void delete();
}

class User implements Applications
{

	@Override
	public void login() {
		System.out.println("As a any user able to login");
		
	}

	@Override
	public void delete() {
		System.out.println("As a user1 able to delete");
		
	}
	
}
class Noaccess implements Applications
{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
	System.out.println("Unable to delete having no access");
		
	}
	
}
