package tech.srinath.resistorcolordecoder;
/*By: Srinath V.
 *Last Updated: 6-16-17
 *Resistor Color Decoder
 */
public class Resistor {
	
	int firstBand;
	int secondBand;
	int thirdBand;
	int fourthBand;
	String resistanceVal;
	String format;
	String multi;
	
	public Resistor(String firstBand, String secondBand, String thirdBand, String fourthBand) {
		
		switch (firstBand) {
		case ("Black"): this.firstBand = 0;
		break;
		case ("Brown"): this.firstBand = 1;
		break;
		case ("Red"): this.firstBand = 2;
		break;
		case ("Orange"): this.firstBand =3;
		break;
		case ("Yellow"): this.firstBand = 4;
		break;
		case ("Green"): this.firstBand = 5;
		break;
		case ("Blue"): this.firstBand = 6;
		break;
		case ("Violet"): this.firstBand = 7;
		break;
		case ("Gray"): this.firstBand = 8;
		break;
		case ("White"): this.firstBand = 9;
		break;
		}
		switch (secondBand) {
		case ("Black"): this.secondBand = 0;
		break;
		case ("Brown"): this.secondBand = 1;
		break;
		case ("Red"): this.secondBand = 2;
		break;
		case ("Orange"): this.secondBand =3;
		break;
		case ("Yellow"): this.secondBand = 4;
		break;
		case ("Green"): this.secondBand = 5;
		break;
		case ("Blue"): this.secondBand = 6;
		break;
		case ("Violet"): this.secondBand = 7;
		break;
		case ("Gray"): this.secondBand = 8;
		break;
		case ("White"): this.secondBand = 9;	
		break;
					
		}
		
		switch (thirdBand) {
		case ("Black"): this.resistanceVal = "Ohms";
						this.multi = "";
						this.format = "";
						break;
		case ("Brown"): this.resistanceVal = "Ohms";
						this.multi = "0";
						this.format = "";
						break;
		case ("Red"): 	this.resistanceVal = "kiloOhms";
						this.format = ".";
						this.multi = "";
						break;
		case ("Orange"):this.resistanceVal = "kiloOhms";
						this.multi = "";
						this.format = "";
						break;
		case ("Yellow"):this.resistanceVal = "kiloOhms";
						this.multi = "0";
						this.format = "";
						break;
		case ("Green"): this.resistanceVal = "megaOhms";
						this.multi = "";
						this.format = ".";
						break;
		case ("Blue"):	this.resistanceVal = "megaOhms";
						this.multi = "";
						this.format = "";
						break;
		case ("Violet"):this.resistanceVal = "megaOhms";
						this.multi = "0";
						this.format = "";
						break;
		}
		
		switch (fourthBand) {
		case ("Gold"):	this.fourthBand = 5;
		break;
		case ("Silver"):this.fourthBand = 10;
		break;
		}
		
		}
	
	
	
	
	public float getFirstBand() {
		return this.firstBand;
	}



	public void setFirstBand(int firstBand) {
		this.firstBand = firstBand;
	}



	public String getResistance() {
		return ""+this.firstBand+this.format+this.secondBand+this.multi+" "+resistanceVal+" ±"+this.fourthBand+"%";
	}
	


}
