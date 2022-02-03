package Praktiks;

public class Robot<T> {
    private T head;
    private Body body;

    Robot(Body body, T head){
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }
    public T getHead(){
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
}
class Head{

}
class SmallHead extends  Head{
    public void faire(){
        System.out.println("Faire");
    }
}
class Body{

}

class  TestRobot{
    public static void main(String[] args) {
        SmallHead sh = new SmallHead();
        Body body = new Body();
        Robot <SmallHead> robot = new Robot<SmallHead>(body,sh);
        robot.getHead().faire();
        

    }
}
