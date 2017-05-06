// Şükrü Anıl ÇAKIR 20160808011
// AnilC
package javalianghomework;
import java.io.IOException;
import java.util.Scanner;

public class JavaLiangHomework {
    public static void main(String[] args) throws IOException { 
        Exercise7_35page284();      // Hangman App ***
        Exercise5_45page199();      // Statistic Calculator **
        System.out.println("suanda buradasınız");
    }
    /*
    
    
    
    */
    
    public static void Exercise7_35page284() throws IOException{
        System.out.println("Hangman App Starts in here");
        String[] Sehirler = {"ADANA", "ADIYAMAN", "AFYON", "AGRI", "AMASYA","ANKARA", "ANTALYA", "ARTVIN",
"AYDIN", "BALIKESIR", "BILECIK", "BINGOL", "BITLIS", "BOLU", "BURDUR", "BURSA", "CANAKKALE",
"CANKIRI","CORUM", "DENIZLI","DIYARBAKIR","EDIRNE", "ELAZIG", "ERZINCAN", "ERZURUM", "ESKISEHIR",
"GAZIANTEP", "GIRESUN", "GUMUSHANE", "HAKKARI", "HATAY", "ISPARTA", "MERSIN", "ISTANBUL", "IZMIR", 
"KARS", "KASTAMONU", "KAYSERI", "KIRKLARELI", "KIRSEHIR", "KOCAELI", "KONYA", "KUTAHYA", "MALATYA", 
"MANISA", "KAHRAMANMARAS", "MARDIN", "MUGLA", "MUS", "NEVSEHIR", "NIGDE", "ORDU", "RIZE", "SAKARYA",
"SAMSUN", "SIIRT", "SINOP","SIVAS","TEKIRDAG","TOKAT", "TRABZON", "TUNCELI", "SANLIURFA", "USAK",
"VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "SIRNAK",
"BARTIN", "ARDAHAN", "IGDIR", "YALOVA", "KARABUK", "KILIS", "OSMANIYE", "DUZCE"};
        
        String[] Hayvanlar = {"ASLAN","BALIK","BILDIRCIN","BALINA","CEYLAN","CAKAL",
"DEVE","DOGAN","EJDERHA","ESEK","FARE","FOK","FIL","GERGEDAN","GELINCIK",
"GEYIK","HAMSI","HINDI","HOROZ","ISTAKOZ","ISTIRIDYE","JAGUAR","JIBON",
"JAKANA","KUMRU","LAMA","MANDA","MAYMUN","MORS","ORANGUTAN","ORKINOS",
"ORDEK","PUMA","PELIKAN","RAKUN","SERCE","SINCAP","SEMPAZE","TILKI",
"TAZI","USKUMRU","VASAK","YILAN","YARASA","ZURAFA","ZEBRA","ZARGANA"};
        
        String[] RezervedWords = {"ABSTRACT","CONTINUE","FOR","NEW","SWITCH",
        "ASSERT","DEFAULT","GOTO","PACKAGE","SYNCHRONIZED","BOOLEAN","DO",
        "IF","PRIVATE","THIS","BREAK","DOUBLE","IMPLEMENTS","PROTECTED","THROW",
        "BYTE","ELSE","IMPORT","PUBLIC","THROWS","CASE","ENUM","INSTANCEOF","RETURN",
        "TRANSIENT","CATCH","EXTENDS","INT","SHORT","TRY","CHAR","FINAL","INTERFACE",
        "STATIC","VOID","CLASS","FINALY","LONG","STRICTFB","VOLATILE",
        "CONST","FLOAT","NATIVE","SUPER","WHILE"};
        int katsec =(int) (Math.random()*3);
        String Hedef = null;
        //Katagori içi random atamalar
        int K1r = (int) (Sehirler.length*Math.random());
        int K2r = (int) (Hayvanlar.length*Math.random());
        int K3r = (int) (RezervedWords.length*Math.random());
        //katagori içi random atamalar
            
        switch (katsec){
            case 0: Hedef = Sehirler[K1r];
                System.out.println("1. Katagori");
                break;
            case 1: Hedef = Hayvanlar[K2r];
                System.out.println("2. Katagori");
                break;
            case 2: Hedef = RezervedWords[K3r];
                System.out.println("3. Katagori");
                break;
        }
        System.out.println(Hedef);
        StringBuilder Gizli = new StringBuilder("");
        for(int i=0;i<Hedef.length();i++){
            Gizli.insert(i, '*');
        }
        System.out.println(Gizli);
        int hata=0;
        String Gizlistr = Gizli.toString();
        // Oyun Mekanızması Başlama Yeri
        while(Gizli.indexOf("*")!=-1){
            System.out.println("BÜYÜK Harf Giriniz     |   " + Gizli + "   |  " +hata +" hata yaptınız");
            Scanner reader = new Scanner(System.in);
            String Alici = reader.next();
            if(Alici.length()!=1) System.err.println("HATA! Lütfen Harf Giriniz");
            else{
                char Sorgu = Alici.charAt(0);
                for(int i=0;i<Hedef.length();i++){
                    if(Hedef.charAt(i)==Sorgu) Gizli.setCharAt(i, Sorgu);
                    if(Hedef.indexOf(Sorgu)==-1) {hata++; break;}
                }
            }
        }
        System.out.println("Tebrikler HANGMAN APP ends in here");
        }
    /*
    
    

    
    */
    public static void Exercise5_45page199(){               //with extra methods (like quartiles and median)
        Scanner input = new Scanner(System.in);             //I was write this code for check my statistic HW and I copy that.
        System.out.println("Statistic Array Calculator Start Here");
        System.out.print("How long Your array?");
        int HLong = input.nextInt();
        int[] veriler= new int[HLong];
        for(int i=0; i<HLong;i++){                          //sayı alma kısmı
            Scanner sayigirdisi = new Scanner(System.in);
            switch(i%10){
                case 0: {System.out.println("enter "+ (i+1) +"st number");break;}
                case 1: {System.out.println("enter "+ (i+1) +"nd number");break;}        
                case 2: {System.out.println("enter "+ (i+1) +"rd number");break;}        
                default: {System.out.println("enter "+ (i+1) +"th number");break;}
            }
            veriler[i]= sayigirdisi.nextInt();
        }
        int toplam=0;
        for(int i=0; i<veriler.length;i++)toplam+=veriler[i];
        double mean=toplam/veriler.length;
        //
        double a=0;
        for(int i=0; i<veriler.length;i++) a+=Math.pow(veriler[i]-mean,2);
        //
        double Qone = 0;
        switch ((veriler.length+1)%4) {                     //for calculating quartiles
            case 0:
                Qone= veriler[(veriler.length+1)/4-1];
                break;
            case 1:
                Qone= (veriler[(veriler.length+1)/4-1]*3 + veriler[(veriler.length+1)/4 ])/4.0 ;
                break;
            case 2:
                Qone= (veriler[(veriler.length+1)/4-1] + veriler[(veriler.length+1)/4 ])/2.0 ;
                break;
            case 3:
                Qone= (veriler[(veriler.length+1)/4-1] + veriler[(veriler.length+1)/4 ]*3)/4.0 ;
                break;
            default:
                break;
        }
//
        double median;
        if(veriler.length%2 == 0) median=(veriler[veriler.length/2-1]+veriler[veriler.length/2])/2.0;
        else median= veriler[veriler.length/2];
//
        double Qthree = 0;
        switch ((veriler.length+1)%4) {
            case 0:
                Qthree= veriler[(veriler.length+1)*3/4-1];
                break;
            case 1:
                Qthree=(veriler[(veriler.length+1)*3/4-1]*3 + veriler[(veriler.length+1)*3/4 ])/4.0 ;
                break;
            case 2:
                Qthree=(veriler[(veriler.length+1)*3/4-1] + veriler[(veriler.length+1)*3/4 ])/2.0 ;
                break;
            case 3:
                Qthree=(veriler[(veriler.length+1)*3/4-1] + veriler[(veriler.length+1)*3/4 ]*3)/4.0 ;
                break;
            default:
                break;
        }
        System.out.println(veriler.length +"  "+toplam);
        System.out.println("Mean is " + mean);
        System.out.println("Sample Standard Deviation is " + Math.sqrt(a*1/36));
        System.out.println("First Quertile is "+ Qone);
        System.out.println("Median is " + median);
        System.out.println("Third Quertile is "+ Qthree);
        System.out.println("Statistic Calculator ends in here");
        System.out.println("Şükrü Anıl akır // AnilC //20160808011");
    }
}