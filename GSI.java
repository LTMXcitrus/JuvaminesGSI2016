//created by GSI students. Available on www.github.com/EMNGSI
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


    
    	public String getAdjectif(String prenom){
   		 switch(prenom){
   			 case "Augustin":
   				 return "Est apprécié par son RO pour son tact";
		//TODO : implémenter un adjectif par etudiant
			//TODO : trouver une architecture plus modulaire
   	 }
    	}
    

}
