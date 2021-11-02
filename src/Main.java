import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Call call = new RealCall(new Request("mainParams"));
        System.out.println("befor =" + call.getRequest().getRequestParams());
        Response response = call.getResponseWithInterceptorChain();
        System.out.println("after =" + call.getRequest().getRequestParams());
        System.out.println(response);
    }
}
