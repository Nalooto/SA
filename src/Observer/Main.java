package SA_Observer;


public class Main{
    public static void main(String[] args) {
        //创建主题(被观察者)
        PublishSubject pub = new PublishSubject();
        //创建两个不同的观察者
        Subscriber a = new Subscriber("sub1");
        Subscriber b = new Subscriber("sub2");
        //将观察者注册到主题中
        pub.addObserver(a);


        //更新主题的数据，当数据更新后，会自动通知所有已注册的观察者
        pub.publish();

        pub.addObserver(b);
        pub.publish();
    }
}
