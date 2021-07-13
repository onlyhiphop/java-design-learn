package design.Adapter.demo1;

/**
 * @Description TODO
 * @Author liaobaocai
 * @Date 2021/7/13 13:45
 */
public class TypeCAdapter implements CommonTarget {

    private Phone phone;

    public TypeCAdapter(Phone phone){
        this.phone = phone;
    }


    @Override
    public void recharge() {

        //将电流转成phone能接受的
        //. ...
        System.out.println("200A 转换成 100A ");

        phone.recharge();

    }


}
