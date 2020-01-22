package aktsMakinesi;

public enum Harfnotu {
	AA(4),BA(3.5),BB(3),CB(2.5),CC(2),DC(1.5),DD(1.0),FF(0.0);
	


    public double numVal;
    
    Harfnotu(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
