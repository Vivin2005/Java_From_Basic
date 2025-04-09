class Computer{
    public void playMusic(){
        System.out.println("Music Playing....");
    }
    public String getMePen(int cost){
        if(cost>=20){
            return "Pen is $20.You buyed it.";
        }
        else{
            return "Pen is $20,You can't have enough money to buy this pen.";
        }
    }
}
public class Method01 {
    public static void main(String[] args){
        Computer com = new Computer();
        String str = com.getMePen(20);
        System.out.println(str);
        com.playMusic();
    }
}
