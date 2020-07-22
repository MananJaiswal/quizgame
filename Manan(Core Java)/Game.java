import java.util.Scanner;
public class Game {
    String[] wordE={"CAKE","PLAN","STAR","QUIZ","JINX","JUNK","ALSO","AMEN","AMID","NECK","ANEW","APEX","BLUE","BOWL","BRAG","COSY","CROP","DEEP","DOCK","EVER","ENVY","FISH","FIRE","GOAT","GASP","HEAR","HEAT","IDEA","IDLE","JACK","JEEP","KEEN","KEEP","LAND","LINK","MASK","LOGO","MALL","NOTE","NOVA","OBEY","OKAY","PALM","PAIR","QUIT","RARE","RING","SECT","TEAR","TRIM"};
    String[] hintE={"You eat it on Birthdays.","You make this before going out.","Twinkle Twinkle Little...... ","The game we are playing.","Casting an evil spell.","Old or discarded items","In addition.","Word said at the end of prayer.","In the middle of.","A part connecting head to the rest of the body.","In a new and different way.","The top or highest point of something.","A colour.","A round deep dish.","Speaking Boastfully.","Comfortable.","A plant grown.","Not Shallow.","Where ships port.","Always.","A feeling of wanting something that belongs to someone else.","I live in Water.","The thing produced when something burns.","A domestic animal.","Taking a quick breath.","Listen to.","The quality of being hot.","A thought.","Lazy.","A device for lifting.","A motor vehicle","Eager","Have possession of.","A part of earth's surface.","A connection.","Used for disguise.","A symbol used by an organisation.","A large enclosed shopping area.","A breif record of something.","A kind of star.","Do what a person tells you to.","Said to express acceptance.","A kind of tree.","A set of two things.","Resign.","Found very often.","Worn on a finger.","A small religious or political group.","A watery salty liquid that flows from eyes.","The process of Cutting away unwanted hair."};
    String[] jumbleE={"KECA","LANP","ARST","UIZQ","NIJX","KJUN","SOLA","EAMN","MIDA","KCEN","NEWA","XPAE","UELB","WOBL","GBRA","SOYC","ROPC","EEPD","OCKD","VERE","YNVE","SHIF","IRFE","TGOA","PASG","RHAE","EATH","AEDI","ELDI","AJCK","EPEJ","EKEN","EEPK","ADNL","KILN","AMSK","OOLG","LLAM","ETNO","VANO","OYEB","YOKA","ALMP","AIRP","UITQ","RRAE","INGR","ETCS","ETAR","MRIT"};
    String[] wordM={"CLOCK","STEAM","PHOTO","AMAZE","AMEND","BEARD","BLADE","CHAIN","CHASE","CHARM","DEBUT","DENSE","ERASE","ERECT","FARAD","FANCY","GUARD","GUESS","HATCH","HASTE","IGLOO","IVORY","JOLLY","JOKER","KEBAB","KNOWN","LEARN","LEGAL","MAGMA","MAMBA","NASTY","NEIGH","OASIS","OMEGA","PAUSE","PEACE","QUACK","QUERY","REPAY","REPLY","RUGBY","SHELF","SHIFT","SHREW","TEASE","THEFT","UNITY","VALET","VALID","YUMMY"};
    String[] hintM={"Its a time telling machine.","A state of liquid.","We take it to preserve our memories.","Surprise.","To change.","Hair on cheeks and chin of a man.","Cutting edge of a knife.","A series of connected metal links","Go after someone.","The quality of fascinating others.","A person's first appearance in a role.","Closely packed together.","To rub out.","Rigidly upright.","A unit of capacitance.","Feel a desire for.","To protect","Suppose something.","Come out of eggs.","Speed or Urgency.","Eskimo house.","Substance from which elephants tusks are made of.","Happy and cheerful.","A person who jokes a lot.","A Dish.","Familiar.","To gain knowledge.","Having to do with law.","A very hot fluid under earth's crust.","A highly poisonous African snake.","Unpleasant or disgusting.","Sound made by horse","A fertile place in desert.","The last letter of greek alphabet.","A temporary stop","Freedom from disturbance.","Sound made by duck","A small question or doubt.","Pay back money.","A response.","A team game.","Use to store and keep things.","To move","A small mouse like mammal.","Playfully make fun of.","The action or crime of stealing.","State of being united.","A person who looks after a man's clothes and other personal needs.","Logical or acceptable.","Delicious."};
    String[] jumbleM={"CKOLC","MSTAE","OTOHP","ZAMEA","EMNDA","DBEAR","DBLAE","AINCH","ESACH","MCHAR","TBUET","DNSEE","SAREE","REETC","AARFD","YANCF","DGURA","SSUEG","HCTAH","STEHA","OLOGI","VOYRIO","LYLOJ","KORJE","BABKE","NOWKN","EARLN","LLGAE","AAGMM","BAAMM","YSANT","EIHNG","SISOA","EAOMG","AUESP","EEACP","KUACQ","YQURE","PERAY","ELPRY","UGBYR","HELFS","HFITS","EWRSH","EAEST","ETFHT","IUNYT","LETVA","DILAV","MUMYY"};
    String[] wordD={"MOBILE","GUITAR","BOTTLE","ANGINA","ANKLET","BANDIT","BANISH","CATCHY","COMBAT","COMEDY","EDIBLE","AUGUST","FAMINE","FLIGHT","GADGET","GAZEBO","SUMMER","GENTLE","HEAVEN","HEIGHT","IDIOCY","INFANT","INSERT","JOCKEY","Jersey","KERNEL","KIDNAP","KNIGHT","LAYMAN","LOCKER","MINUTE","SECOND","MISERY","MISFIT","NATIVE","NATTER","NAUSEA","NATURE","OBJECT","OBSESS","PARROT","PASCAL","QUARRY","QUENCH","RAGGED","RANCID","SEARCH","SECRET","THRASH","THREAD"};
    String[] hintD={"Used for networking.","A musical instrument.","Used to store various drinks.","Severe pain in the chest.","A chain or band worn around the ankle","A member of a gang.","make someon leave a place as a punishment.","Appealing.","To fight.","Entertainment intended to make people laugh.","Fil to be eaten","A month.","A period when food is very scarce","An action of flying.","A small mechanical device.","A summer house offering a pleasant view.","A Season.","Kind.","The place where god lives.","Measurement from head to foot.","Extremely stupid behaviour.","A very young child or baby.","Incorporate something into something else.","A professional rider in horse races.","Cloth worn for a certain sport.","Central part of something.","Take someone by force and hold them captive.","A man of noble rank with a duty to fight for his king.","A person without knowing technical knowledge.","A small compartment that can be locked.","A period of time.","A period of time.","Great unhappiness","Something that does not fit.","A local inhabitant.","A lenghty chat.","A feeling of sickness and wanting to vomit.","The physical world including plants, animals, and all things that are not made by people.","A thing that you can see or touch.","Preoccupy someone to a disturbing extent.","A Green coloured bird.","Unit of pressure.","A place where stones are dug.","Supress a feeling.","Old and torn","Tasting unpleasant.","Try to find something.","Hidden from.","Beat repeatedly.","A stated intention to inflict harm."};
    String[] jumbleD={"LIEOBM","ARTUIG","TBOLET","GNANAI","KLNETA","DNABIT","IABNSH","ATCHY","BTAMOC","EDYOMC","LEBIDE","UUGSTA","AMINEF","GTHILF","AGETDG","BOEGAZ","MRESUM","NLETGE","NEVEAH","ETIHGH","IICYDO","TNAFIN","SRENTI","OJKCYE","SYERJE","EENRLK","DIKPNA","TGHIKN","YLANAM","OCKREL","UNIMET","ECSDNO","YREMIS","FTISIM","ATIVEN","TTERAN","SEANUA","TRUEAN","CTEBOJ","SSSEBO","RRAOTP","SAPLCA","UYRRAQ","UENCHQ","GGDEAR","CIDRAN","CHREAS","CRTEES","ASHTHR","DEARTH"};
   static double score=0;
   public static String shuffle( String text){
               char ch[]=text.toCharArray();
               for(int j=0;j<ch.length;j++){
                   int randomIndex=(int)(Math.random()*ch.length);
                   char temp=ch[j];
                   ch[j]=ch[randomIndex];
                   ch[randomIndex]=temp;
               }
               return new String(ch);
       }
    void easy(){
        
        for(int i=0;i<20;i++)
        {
            int r=(int)(Math.random()*50);
        System.out.println("Q"+(i+1)+". Guess the word :"+shuffle(jumbleE[r]));
        System.out.println("Do you want hint?");
        System.out.println("If yes then type Y else type N.");
        Scanner sc=new Scanner(System.in);
        String accepthint=sc.next();
        System.out.println("..............................................");
        switch(accepthint){
            case "Y":
            case "y":
                System.out.println("::::::HINT :"+hintE[r]);
                System.out.println("Enter your answer");
                score=score-0.5;
                break;
            case "N":
            case "n":
                System.out.println("Enter your answer");
                break;      
        }
        String ans=sc.next().toUpperCase();
        if(ans.equals(wordE[r]))
        {
            score=score+2;
            System.out.println("================================================");
        System.err.println("THE ANSWER IS CORRECT..!!");
        }
        else if(!ans.equals(wordE[r])){
            System.out.println("================================================");
            System.err.println("AWWW..WRONG ANSWER BUDDY!");
            System.out.println("The Correct ans is -->>"+wordE[r]);
        }
            System.out.println("Current Score :"+score);
            System.out.println("================================================");
        }
    }
    void medium(){
        
        for(int i=0;i<20;i++)
        {
            int r=(int)(Math.random()*50);
        System.out.println("Q"+(i+1)+". Guess the word :"+shuffle(jumbleM[r]));
        System.out.println("Do you want hint?");
        System.out.println("If yes then type Y else type N.");
        Scanner sc=new Scanner(System.in);
        String accepthint=sc.next();
        System.out.println("..............................................");
        switch(accepthint){
            case "Y":
            case "y":
                System.out.println("::::::HINT :"+hintM[r]);
                System.out.println("Enter your answer");
                score=score-0.5;
                break;
            case "N":
            case "n":
                System.out.println("Enter your answer");
                break;       
        }
        String ans=sc.next().toUpperCase();
        if(ans.equals(wordM[r]))
        {
            score=score+2;
            System.out.println("================================================");
        System.err.println("THE ANSWER IS CORRECT..!!");
        }
        else if(!ans.equals(wordM[r])){
            System.out.println("================================================");
            System.err.println("AWWW..WRONG ANSWER BUDDY!");
        }
            System.out.println("Current Score :"+score);
            System.out.println("================================================");
        }
    }
    void difficult(){
        
        for(int i=0;i<20;i++)
        {
            int r=(int)(Math.random()*50);
        System.out.println("Q"+(i+1)+". Guess the word :"+shuffle(jumbleD[r]));
        System.out.println("Do you want hint?");
        System.out.println("If yes then type Y else type N.");
        Scanner sc=new Scanner(System.in);
        String accepthint=sc.next();
        System.out.println("....................................................");
        switch(accepthint){
            case "Y":
            case "y":
                System.out.println("::::::HINT :"+hintD[r]);
                System.out.println("Enter your answer");
                score=score-0.5;
                break;
            case "N":
            case "n":
                System.out.println("Enter your answer");
                break;       
        }
        String ans=sc.next().toUpperCase();
        if(ans.equals(wordD[r]))
        {
            score=score+2;
            System.out.println("================================================");
        System.err.println("THE ANSWER IS CORRECT..!!");
        }
        else if(!ans.equals(wordD[r])){
            System.out.println("================================================");
            System.err.println("AWWW..WRONG ANSWER BUDDY!");
        }
            System.out.println("Current Score :"+score);
            System.out.println("================================================");
        }
    }
        public static void main(String[] args) {



   System.out.println("******** **   ** ********** ********* **       ********");  
 
   System.out.println("******** **   ** *********  ********* **       ********");
  
 System.out.println("**    ** **   **       **         **  **       **");
 
  System.out.println("**    ** **   **      **         **   **       **");
  
 System.out.println("******** **   **     **         **    **       ********");
  
System.out.println("******** **   **    **         **     **       ********");
 
  System.out.println("**       **   **   **         **      **       **");
 
  System.out.println("**       **   **  **         **       **       **");
   
System.out.println("**       ******* *********  ********* ******** ********");
  
 System.out.println("**       ******* *********  ********* ******** ********");
            System.err.println("*********************************************");
        System.err.println("WELCOME TO PUZZLOMANIA....!!!!");
            System.err.println("*********************************************");
        Scanner s=new Scanner(System.in);
int temp=1;
do{
        System.out.println("Enter 1 for Easy Mode");
        System.out.println("Enter 2 for Medium Mode");
        System.out.println("Enter 3 for Hard Mode");
        System.out.println("Enter 4 for Exit");
        System.out.println("Enter your Choice...!!");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("---------------------------------------------");
                System.out.println(">>>>>>>>>>>>>>>>>>EASY MODE<<<<<<<<<<<<<<<<<<");
                System.out.println("---------------------------------------------");
                System.out.println("Below are the questions for the Easy Mode");
                System.out.println(".............................................");
                Game ob=new Game();
                ob.easy();
                break;
            case 2:
                System.out.println("---------------------------------------------");
                System.out.println(">>>>>>>>>>>>>>>>>>MEDIUM MODE<<<<<<<<<<<<<<<<<<");
                System.out.println("---------------------------------------------");
                System.out.println("Below are the questions for the Medium Mode");
                System.out.println(".............................................");
              Game o=new Game();
                o.difficult();
                break;
            case 3:
                System.out.println("---------------------------------------------");
                System.out.println(">>>>>>>>>>>>>>>>>>DIFFICULT MODE<<<<<<<<<<<<<<<<<<");
                System.out.println("---------------------------------------------");
                System.out.println("Below are the questions for the Difficult Mode");
                System.out.println(".............................................");
                Game obj=new Game();
                obj.difficult();
                break;
            case 4:
                temp=4;
                System.exit(1);
                break;
                
        }System.out.println("Your final score is :"+score);
        System.out.println("=================================================");
}while(temp!=4);
            System.out.println("************************************************");
            System.out.println("************************************************");
            System.out.println(":::::::   THANKS FOR PLAYING...!!!   :::::::");
            System.out.println("************************************************");
            System.out.println("************************************************");   
}
    
}
