package oops_concept;

public class NetbankingFinalimpl extends Netbankingimpl2 {

	

	
	public void imps() {
		System.out.println("do payment via imps");
		
	}

	
	public void electric() {
		System.out.println("pay your electric bill");
		
		
	}
	public static void main(String[] args) {
		NetbankingFinalimpl nbfi=new NetbankingFinalimpl();
		
		nbfi.setName();
		nbfi.setPassword();
		nbfi.resetPass();
		nbfi.electric();
		nbfi.gas();
		nbfi.mobile();
		nbfi.imps();
		nbfi.neft();
		nbfi.upi();
	}

}
