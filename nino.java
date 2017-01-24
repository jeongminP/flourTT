package java170124;

class nino implements Calculatable{
	int first, second, third;
	public void setOprands(int first, int second, int third){
		this.first=first;
		this.second=second;
		this.third=third;
	}
    public int sum(){
    	int result;
    	result=this.first+this.second+this.third;
    	return result;
    }
    public int avg(){
    	int result;
    	result=(this.first+this.second+this.third)/3;
    	return result;
    }
}