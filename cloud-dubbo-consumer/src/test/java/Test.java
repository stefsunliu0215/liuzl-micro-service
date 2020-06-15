import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: 52945
 * @Date: 2020/6/13 19:14
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        try {
            CuratorFramework zkClient = CuratorFrameworkFactory.builder().
                    connectString("192.168.20.125:2181").
                    retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
            zkClient.start();

            if (zkClient.checkExists().forPath("/dubbo/config/dubbo/dubbo.properties") == null) {
                zkClient.create().creatingParentsIfNeeded().forPath("/dubbo/config/dubbo/dubbo.properties");
            }
            zkClient.setData().forPath("/dubbo/config/dubbo/dubbo.properties", ("dubbo.registry.address=nacos://nacos.com:80\n" +
                    "dubbo.metadata-report.address=nacos://nacos.com:80").getBytes());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
