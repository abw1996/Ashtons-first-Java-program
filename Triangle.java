class Triangle
{
	private Tan tan = new Tan();
	private Sin sin = new Sin();
	private Cos cos = new Cos();
	private Sec sec = new Sec();
	private Csc csc = new Csc();
	private Cot cot = new Cot();
	
	private double sideOpposite, sideAdjacent, hypotonuse = 0;
	
	//constructors below are for use in main when getting information provided to user for the problem.
	
	public void setTan(double top, double bottom) {
		tan.setTop(top);
		tan.setBottom(bottom);
	}
	
	public void setSin(double top,double bottom) {
		sin.setTop(top);
		sin.setBottom(bottom);
	}
	
	public void setCos(double top,double bottom) {
		cos.setTop(top);
		cos.setBottom(bottom);
	}
	
	public void setSec(double top,double bottom) {
		sec.setTop(top);
		sec.setBottom(bottom);
	}
	
	public void setCsc(double top,double bottom) {
		csc.setTop(top);
		csc.setBottom(bottom);
	}
	
	public void setCot(double top,double bottom) {
		cot.setTop(top);
		cot.setBottom(bottom);
	}	
	
	public String getSin() {
		String ret = sin.getTop() + "/" + sin.getBottom();
		return ret;
	}
	
	public String getCos() {
		String ret = cos.getTop() + "/" + cos.getBottom();
		return ret;
	}
	
	public String getTan() {
		String ret = tan.getTop() + "/" + tan.getBottom();
		return ret;
	}
	
	public String getCsc() {
		String ret = csc.getTop() + "/" + csc.getBottom();
		return ret;
	}
	
	public String getSec() {
		String ret = sec.getTop() + "/" + sec.getBottom();
		return ret;
	}		
	
	public String getCot() {
		String ret = cot.getTop() + "/" + cot.getBottom();
		return ret;
	}
	
	//below are the auto assigns for the different sides of the triangle based on what the user has provided.
	public void setTheSides() {
		if (sin.hasTop()) {
			sideOpposite = sin.getTop();
		}
		if (sin.hasBottom()) {
			hypotonuse = sin.getBottom();
		}
		if (cos.hasTop()) {
			sideAdjacent = cos.getTop();
		}
		if (cos.hasBottom()) {
			hypotonuse = cos.getBottom();
		}
		if (tan.hasTop()) {
			sideOpposite = tan.getTop();
		}
		if (tan.hasBottom()) {
			sideAdjacent = tan.getBottom();
		}
		if (sec.hasTop()) {
			hypotonuse = sec.getTop();
		}
		if (sec.hasBottom()) {
			sideAdjacent = sec.getBottom();
		}
		if (csc.hasTop()) {
			hypotonuse = csc.getTop();
		}
		if (csc.hasBottom()) {
			sideOpposite = csc.getBottom();
		}
		if (cot.hasTop()) {
			sideAdjacent = cot.getTop();
		}
		if (cot.hasBottom()) {
			sideOpposite = cot.getBottom();
		}
	}
	//below we finish the missing side of the triangle
	
	public boolean sideOppositeHasValue() {
		if (sideOpposite == 0) {
			return false;
		} else {return true;}
	}
	
	private boolean sideAdjacentHasValue() {
		if (sideAdjacent == 0) {
			return false;
		} else {return true;}
	}
	
	private boolean hypotonuseHasValue() {
		if (hypotonuse == 0) {
			return false;
		} else {return true;}
	}
	
	public void setTheMissingSide() {
		if (sideAdjacentHasValue() && sideOppositeHasValue()) {
			if (hypotonuseHasValue() == false) {
				hypotonuse = Math.sqrt((sideOpposite * sideOpposite) + (sideAdjacent * sideAdjacent));
			}
		}
	
		if (sideAdjacentHasValue() && hypotonuseHasValue()) {
			if (sideOppositeHasValue() == false) {
				sideOpposite = Math.sqrt((hypotonuse * hypotonuse) - (sideAdjacent * sideAdjacent));
			}
		}
		if (sideOppositeHasValue() && hypotonuseHasValue()) {
			if (sideAdjacentHasValue() == false) {
				sideAdjacent = Math.sqrt((hypotonuse * hypotonuse) - (sideOpposite * sideOpposite));
			}
		}
	}
	//below are the auto assigns for after we have all sides of the triangle figured out.
	public void setRemainingForms() {
		if (sideOppositeHasValue()) {
			sin.setTop(sideOpposite);
			csc.setBottom(sideOpposite);
			tan.setTop(sideOpposite);
			cot.setBottom(sideOpposite);
		}
		if (sideAdjacentHasValue()) {
			cos.setTop(sideAdjacent);
			sec.setBottom(sideAdjacent);
			tan.setBottom(sideAdjacent);
			cot.setTop(sideAdjacent);
		}
		if (hypotonuseHasValue()) {
			sin.setBottom(hypotonuse);
			cos.setBottom(hypotonuse);
			csc.setTop(hypotonuse);
			sec.setTop(hypotonuse);
		}
	}
}
