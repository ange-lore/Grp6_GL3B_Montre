public class Montre {
    int heure, min;
    Personne p;
    Montre(int h, int m){
        this.heure = h;
        this.min = m;
    }

    Montre(Montre m){
        this.heure = m.heure;
        this.min = m.min;
    }
    void avance(){
        if(this.min==59){
            if(this.heure == 23) this.heure = 0;
            else this.heure = this.heure++;
            this.min = 0;
        }
        else this.min++;
    }
    public  String afficheHeure(){
        if (this.heure>23 || this.min>60){
            return ("cette heure n'existe pas");
        }
        else
            return  heure + "h" + min + "min";
    }
    public static void main(String[] ange){
        Montre m = new Montre(9,25);
//        Montre n = new Montre(m);
        Personne hammel = new Personne("hammel");
        hammel.porteMontre2(m);
        m.avance();
        //System.out.println(m.afficheHeure());

    }
}
//code pour ajouter un minuteur à la montre
public Minuteur{ 
    long timer = System.currentTimeMillis(); //on récupère le temps d’exécution du programme au lancement du timer
     int delay = 2000; //on veut attendre 2000 ms
 
while (System.currentTimeMillis() - timer < delay) //tant que le temps écoulé depuis qu'on a initialisé le timer est inférieur au delay
{
    System.out.println("continuer"); //le programme s’exécute
}
}
class Personne{
    String nom;
    Montre m;
    Personne(String nom){
        this.nom = nom;
        this.m = null;
    }

    void  porteMontre2(Montre m){
        if(m.p!=null ){
        this.m = m;
        System.out.println("montre ajouter");
        }else System.out.println("il a deja une montre ");
    }

        Montre enleveMontre() {
        Montre m = this.m;
        this.m = null;
        if (m != null) m.p = null;
            return m;
        }

     String siMontre(){
        if (m != null){
            return m.afficheHeure();
        }
        else {
            return "il n'a pas de montre";
        }
    }

    String donneHeure(){
     if(this.m != null) return this.m.heure+"h"+this.m.min;
     else return "";
     }
    

}
