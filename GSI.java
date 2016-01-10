//created by GSI students. Available on www.github.com/LTMXcitrus/JuvaminesGSI2016/
// Original idea by aversi13 and mlemon13 #GeekdOr
public class GSI extends OptionEMN {


private Vector<Eleve> membres;
public static final String DEVISE = “Geek is the new sexy”;

	public GSI(int year){
   		 if(year==2016){   	
this.RO = new RO(“Grall”); 
   		 	this.membres = Administration.getInstance().getMembresGSI();
   			 System.out.println(membres.length()); //Doit renvoyer 18
   		 	this.isBandeDeGeek = false;
   		 }
   	 }

  	  public int effectifEnCours(String nomDuCours){
   		 return 10 + Math.round(Math.random()*8);
   	 }


    
    	public String getDescription(String prenom){
   		 switch(prenom){
   			 
   			case "Olek":
   				return "Thug life, deal with it."
   			case "Anqi":
   				return "Ne prend pas les pauses au sérieux"
   			case "Sonia":
   			
   			case "Thomas":
   			case "Angelin":
   			case "Quentin":
   			case "Pierre":
   			case "Micaël":
   			case "Aurore":
   			case "Matthieu":
   			case "Christophe":
   				return "don't Metz with me"
   				
   			case "Melyna":
   			case "Nicolas":
   			case "Augustin":
   				throw new TabarnakException();
   				
   			case "David":
   			case "Samuel":
   			case "Marc":
   				throw new NotAvailableAskOnTwitch();
   				
   			case "Joël":
   			case "Julien":
   				throw new NotFoundException();
   			
   			case "Augustin est agacé":
      				return "Est apprécié par son RO pour son tact";
      				
      				
		//TODO : implémenter un adjectif par etudiant
			//TODO : trouver une architecture plus modulaire
   	 }
    	}
    

}
