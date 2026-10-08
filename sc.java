package sc;
import java.util.Scanner;
//public class sc {

//treba mi sifra za vrata trocifreni broj proizvod cifara tog broja oduzme se zbir cifara tog broja. napisi mi java kod
//import java.util.Scanner;


  //  public static void main(String[] args) {
   //     Scanner sc = new Scanner(System.in);

   //     System.out.print("Unesi trocifreni broj: ");
   //     int broj = sc.nextInt();

   //     int stotina = broj / 100;
    //    int desetica = (broj / 10) % 10;
   //     int jedinica = broj % 10;

    //    int proizvod = stotina * desetica * jedinica;
    //    int zbir = stotina + desetica + jedinica;

    //    int sifra = proizvod - zbir;

    //    System.out.println("Sifra je: " + sifra);
   // }

    //potrebno je napisati program kojim cete provjeriti da li ce zavjesa prekriti prozor. oblik zavjese i oblik prozora je pravougaonik.
    
//    import java.util.Scanner;

 //   public class sc {
 //       public static void main(String[] args) {
 //           Scanner sc = new Scanner(System.in);

            // Koordinate zavjese
  //          System.out.print("Unesi x1 i y1 za zavjesu: ");
  //          int x1 = sc.nextInt();
  //          int y1 = sc.nextInt();

   //         System.out.print("Unesi x2 i y2 za zavjesu: ");
   //         int x2 = sc.nextInt();
   //         int y2 = sc.nextInt();

            // Koordinate prozora
   //         System.out.print("Unesi x3 i y3 za prozor: ");
   //         int x3 = sc.nextInt();
  //          int y3 = sc.nextInt();

    //        System.out.print("Unesi x4 i y4 za prozor: ");
    //        int x4 = sc.nextInt();
   //         int y4 = sc.nextInt();

            // Dimenzije zavjese
    //        int sirinaZavjese = x2 - x1;
   //         int visinaZavjese = y1 - y2;

            // Dimenzije prozora
   //         int sirinaProzora = x4 - x3;
   //         int visinaProzora = y3 - y4;

            // Provjera
   //         if (sirinaZavjese >= sirinaProzora &&
  //              visinaZavjese >= visinaProzora) {

  //              System.out.println("Zavjesa ce prekriti prozor.");
  //          } else {
  //              System.out.println("Zavjesa nece prekriti prozor.");
  //          }
  //      }
  //  }
    
    // Napisati program koji racuna povrsinu ekrana monitora pravouganogh oblika ukoliko je poznata duzina njegove dijagonale i odnos stranica. 
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi duzinu dijagonale: ");
        double d = sc.nextDouble();

        System.out.print("Unesi odnos stranica (m): ");
        double m = sc.nextDouble();

        System.out.print("Unesi odnos stranica (n): ");
        double n = sc.nextDouble();

        double k = d / Math.sqrt(m * m + n * n);

        double a = m * k;
        double b = n * k;

        double povrsina = a * b;

        System.out.println("Povrsina ekrana je: " + povrsina);
/*double b = 9;
double d = 12;
double rez = povrsina(d,a,b);
System.out.println(rez);*/
    }


// NAPISATI PROGRAM ZA STEPENOVANJE BROJA X, brojem n
 /*   import.java.util.Scanner;
    public class Main {
    	public static int stepen(int x,int n);
    	int rezultat = 1;
    	for(int i = 0;i<n;i++) {
    		rezultat = rezultat * x  */
    
    
    
    
    //Date su cijene 3 proizvoda. treba naci cijene tri proizvoda ciji zbir cijena daje najvecu vrijednost
    
   /* public static int max(int a, int b, int c) {
    	int maximum = a + b;
    	if(a + c > maximum) {
    		maximum = a + b;
    	}else {  
    		
    	}
    	
    */
    
    
    //8.
 /*   public static int brCifara(int n) {
    	int n = sc.nextInt();

		 int brojCifara = 0;

		 while (n > 0) {
		     n = n / 10;
		     brojCifara++;
		 }*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


}


