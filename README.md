#Theorie vraag 11
## A. ClassA varA = new ClassA();
## B. ClassA varA = new ClassB();
#
#
#Fundamentals Test

##1 STRINGS
We gaan een applicatie ontwerpen, die werkt met invoer en deze doorgeeft als argumenten aan een static methode.
Als verschillende argumenten hebben we de volgende 3 strings: Lepel
http://www.smartdeveloper.be
“De mooie zeeman nam Anna mee zei oom Ed”
Met deze strings moet het volgende gebeuren:
Tel het aantal klinkers (vowels) in het woord/zin en print deze af.
Ga na of het woord of de zin een palindroom is (als je de lettervolgorde omkeert heb je nog steeds hetzelfde woord/ zin).
Ga na of er een url is ingegeven of niet. (Een url start met http://).
Iemand heeft al geprobeerd om hiervoor een klasse te schrijven maar het is telkens slecht afgelopen. Vul jij onderstaande klasse volledig zodanig dat je in een het hoofdprogramma de bovenstaande informatie kan uitvoeren.
package be.vdab.parameters; public class StringsParameters {
public static boolean isPalindrome(String string) {
}
Public static boolean isPhrasePalindrome (String string) { }
Public static boolean isUrl(String string) { }
Public static int isVowel(String string) { }
}
 
##2 RANDOM OBJECT
MAAK EEN PROGRAMMA AAN DIE EEN REEKS TOONT VAN 25 INTEGERS DIE RANDOM GETALLEN TOONT TUSSEN 0 EN 1000. ALS HET GETAL KLEINER IS DAN 250 MOET ER ONDER HET GETAL PIEF KOMEN TE STAAN, IS HET GETAL KLEINER DAN 500 MOET ER ONDER HET GETAL POEF KOMEN TE STAAN EN ANDERS MOET ER ONDER HET GETAL PAF KOMEN TE STAAN.
Bijvoorbeeld: 135
PIEF
472
POEF 22 PIEF 847 PAF ...
  
##3 BOOKS
SCHRIJF AAN DE HAND VAN ONDERSTAANDE DIAGRAMMEN EEN SET KLASSEN OM BOEKEN EN HUN AUTEURS TE MODELLEREN. SCHRIJF OOK EEN MAIN-METHODE WAARIN JE EEN BOEK EN EEN AUTEUR AANMAAKT EN VOOR BEIDEN DE INFORMATIE AFPRINT. TEST OOK OF DE GETTERS EN SETTERS CORRECT WERKEN.
    
##4 MONEY IN DA BANK
VAN GELD WORD JE NIET GELUKKIG. MAAR HET KAN WEL HELPEN ALS JE GELDZAKEN GOED GEREGELD ZIJN. MODELLEER EEN BANKSYSTEEM MET EEN SPAARREKENING, ZICHTREKENING, EEN ALGEMENE REKENINGKLASSE WAARVAN DEZE TWEE OVERERVEN EN EEN PERSON KLASSE DIE MEERDERE REKENINGEN KAN BEZITTEN. ZORG DAT JE GELD KAN STORTEN EN GELD KAN AFHALEN MET DE ZICHTREKENING. EEN SPAARREKENING KAN ENKEL GELD TRANSFEREREN VAN EN NAAR DE BIJHORENDE ZICHTREKENING. EEN SPAARREKENING KAN DUS NIET BESTAAN ZONDER ZICHTREKENING. ZORG ER OOK VOOR DAT JE SPAARREKENING JAARLIJKS EEN BEPAALD PERCENTAGE INTEREST OPBRENGT. SCHRIJF HIERVOOR EEN METHODE EN VOER HEM IN JE MAIN METHODE UIT. BONUSPUNT ALS JE KAN ACHTERHALEN HOE JE DIT JAARLIJKS AUTOMATISCH KAN LATEN UITVOEREN. TEKEN VOOR JEZELF EEN UML UIT EN MAAK VOOR JEZELF UIT WAT EEN LOGISCHE STRUCTUUR VOOR JE MODEL IS.
  