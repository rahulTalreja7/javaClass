class Car extends Machine{
	
	@Override
	public void showinfo(){
		System.out.println("i am a car");
	}
	
	public void wipeWindShield(){
		System.out.println("wind shield wiped");
	}
	
	@Override
	public void whereIam(){
		System.out.println("I am in car ");
	}
}