//created by GSI students. Available on www.github.com/LTMXcitrus/JuvaminesGSI2016/
// Original idea by aversi13 and mlemon13 #GeeksdOr
public class GSI extends OptionEMN {


private Vector<Eleve> membres;
public static final String DEVISE = “Geek is the new sexy() ”;

	public GSI(int year){
   		 if(year==2016){   	
			this.RO = new RO(“Grall”);
   		 	this.membres = Administration.getInstance().getMembresGSI();
   		 	this.delegue = this.membres.getByName("Matthieu");
   			 System.out.println(membres.length()); //Doit renvoyer 18
   		 	this.isBandeDeGeek = false;
   		 }
   	 }

  	  public int effectifEnCours(String nomDuCours){
   		 return 10 + Math.round(Math.random()*8);
   	 }


    
    	public String getDescription(String prenom){
   		 switch(prenom){
   			 
   			case "Olek": return "Thug life, deal with it.";
   			case "Anqi": return "Why so serious ?";
   			case "Sonia": throw new JoelConflictException();
   			
   			case "Thomas": return "Beeeep ! Bracelet scanned.";
   			case "Angelin": return "GameBoy Musician";
   			case "Quentin": return membres.get("Quentin").isNotFound ? "Is with Sasha" : "\n";
   			case "Pierre": return "I don't have a clou";
   			case "Micaël": return "Our own Steve Jobs";
   			case "Aurore": return new java.awt.Drawing().getSVG();
   			case "Matthieu": return "SIC(k) of the SIC";
   				
   			case "Christophe": return "don't Metz with me";
   				
   			case "Melyna": throw new CaliceException();
   			case "Nicolas": throw new CrissDHostieException();
   			case "Augustin": throw new TabarnakException();
   				
   			case "David":throw new MotivationNotFoundException();
   			case "Samuel": return "To be late or not to be";
   			case "Marc": throw new NotAvailableAskOnTwitch();
   			case "Joël": throw new PencilException();
   			case "Julien":throw new NotFoundException();
   			
   			case "Augustin est agacé": return "Est apprécié par son RO pour son tact";
      				
      				
		//TODO : implémenter un adjectif par etudiant
			//TODO : trouver une architecture plus modulaire
   	 }
    	}
    

}
