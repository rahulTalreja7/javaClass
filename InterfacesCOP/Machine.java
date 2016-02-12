class Machine implements Info{
	int id;
	String name;
	public Machine(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	    public void showInfo(){
		System.out.println(id+"\t"+name);
	}
}