import javax.swing.JOptionPane;



class Students{
	private int NPM;
	
	private int getNPM(){
		return NPM;
	}
	public void setNPM(int nPM) {
		NPM = nPM;
	}
	
	public class Latihan01{
		static Students myBio = new Students();
		static JOptionPane jop = new JOptionPane();

	public static void main(String[] args) {
			String NPM = jop.showInputDialog(null, "Please insert you NPM:","Form Input");
	
			if(NPM.isEmpty()) {
				jop.showMessageDialog(null, "NPM tidak boleh kosong","Error message", jop.ERROR_MESSAGE);
			}else if(NPM.length() > 0 && NPM.length() < 4) {
				jop.showMessageDialog(null, "Minimum 1 digit dan maximum 5 digit","Error message", jop.WARNING_MESSAGE);
			}else {
				int NPMconvert = Integer.parseInt(NPM);
				myBio.setNPM(NPMconvert);
				jop.showMessageDialog(null, "Your NPM is "+myBio.getNPM(),"Success",jop.INFORMATION_MESSAGE);
			}
		}
	}
}
