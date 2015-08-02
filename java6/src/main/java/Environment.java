public class Environment {

    public static final boolean IS_JAVA8 = isJava8();

    private static boolean isJava8() {
        String implementationVersion = Runtime.class.getPackage().getImplementationVersion();
        return (implementationVersion != null && implementationVersion.startsWith("1.8"));
    }
}
