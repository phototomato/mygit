package exam6.com;

//电影票
public class Example12_8 {
    public static void main(String[] args) {
        TicketHouse officer = new TicketHouse();
        Thread zhangfei,likui;
        zhangfei = new Thread(officer);
        likui = new Thread(officer);
        zhangfei.setName("张飞");
        likui.setName("李逵");
        Thread liubei = new Thread(officer);
        liubei.setName("刘备");


        liubei.start();
        likui.start();
/*
666666
*/
        zhangfei.start();




    }
}
