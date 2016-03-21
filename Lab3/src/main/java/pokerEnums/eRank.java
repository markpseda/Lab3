package pokerEnums;

public enum eRank {
	TWO(2), 
	THREE(3), 
	FOUR(4), 
	FIVE(5), 
	SIX(6), 
	SEVEN(7), 
	EIGHT(8), 
	NINE(9), 
	TEN(10), 
	JACK(11), 
	QUEEN(12), 
	KING(13), 
	ACE(14),
	JOKER(99, true);

	private int iRankNbr;
	private boolean IsWild;

	private eRank(int iRankNbr) {
		this.iRankNbr = iRankNbr;
	}
	private eRank(int iRankNbr, boolean isWild) {
		this(iRankNbr);
		this.IsWild = isWild;
	}

	public int getiRankNbr() {
		return iRankNbr;
	}
	public void setWild(boolean isWild){
		this.IsWild = isWild;
	}
	public boolean getWild() {
		return(this.IsWild);
	}
	
	
}
