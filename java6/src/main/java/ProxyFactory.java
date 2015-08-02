import java.util.concurrent.ConcurrentMap;

public class ProxyFactory {

    public <K, V> ConcurrentMap<K, V> newMap() {
        if (Environment.IS_JAVA8) {
            return new Java8CHM<K, V>();
        } else {
            return new Java6CHM<K, V>();
        }
    }

}
