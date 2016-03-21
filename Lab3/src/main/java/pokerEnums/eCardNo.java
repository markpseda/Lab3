package pokerEnums;

public enum eCardNo {

	FirstCard(0), SecondCard(1), ThirdCard(2), FourthCard(3), FifthCard(4);
	
	private eCardNo(final int CardNo){
		this.CardNo = CardNo;
	}
	private eCardNo(final int CardNo, final boolean isWild){
		this(CardNo);
		this.IsWild = isWild;
	}

	private int CardNo;
	private boolean IsWild;
	
	public int getCardNo(){
		return CardNo;
	}
	
	public void setWild(boolean isWild){
		this.IsWild = isWild;
	}
	
	public boolean getWild(){
		return IsWild;
	}
	
}
