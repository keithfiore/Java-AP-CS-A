public class BleepingWhileLoops {
    public static void main(String[] args){
        int i = 100;
        int oneNum;
        int anotherNum;
        while (i > 0)  {
            oneNum = (int)(Math.random()*50);
            anotherNum = (int)(-1* Math.random() * 100);
            System.out.println("oneNum is " + oneNum + " Another num is " + anotherNum);
            i = i + (oneNum+anotherNum);
        }
    }
}
