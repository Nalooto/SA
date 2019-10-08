package SA_Observer;


public class Subscriber implements Observer{
    //订阅者名字
    private String name;
    private int version;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(int version) {
        this.version=version;
        System.out.println("公众号有新推文发布！");
        this.sub();
    }

    public void sub(){
        System.out.println(name+"已查看"+version+"期的推文！");
    }

}

