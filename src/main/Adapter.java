package main;

public class Adapter implements NewSystem{
	
	private Adaptee oldSystem;
	
	public Adapter(Adaptee oldSystem) {
		this.oldSystem = oldSystem;
	}

	@Override
	public void reNewOldMethod() {
		oldSystem.oldMethod();
		
	}

}
