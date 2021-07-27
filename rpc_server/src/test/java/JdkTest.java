
/**
 * @user KyZhang
 * @date
 */
public class JdkTest {

//    @Test
//    public void testJSON(){
//        HashSet<String> set = new HashSet();
//        Class aClass = set.getClass();
//        ParameterizedType genType = (ParameterizedType)aClass.getGenericSuperclass();
//        Type[] paramList = genType.getActualTypeArguments();
//        System.out.println(paramList);
//
//        set.add("123456");
//        set.add("hello");
//        String s = JsonUtil.pojoToJson(set);
//        System.out.println(s);
//        System.out.println("------------------------");
//
//        HashSet<String> strings = JsonUtil.jsonToPojo(s, HashSet.class);
//        System.out.println(strings);
//        System.out.println("------------------------");
//        Integer[] ins = new Integer[]{5,6,8,7,9};
//        String json = JsonUtil.pojoToJson(ins);
//        System.out.println(json);
//        System.out.println("------------------------");
//
//        Integer[] integers = JsonUtil.jsonToPojo(json, Integer[].class);
//        System.out.println(Arrays.asList(integers));
//
//
//
//    }
//
//    @Test
//    public void testStringUtil(){
//        String s = "127.0.0.1::8989";
//        String[] strings = StringUtil.resolveIpPortFromString(s);
//        System.out.println(strings[0]);
//        System.out.println(strings[1]);
//    }
//
//    @Test
//    public void testBytes(){
//        Byte[] msg = new Byte[5];
//        //String json = (String) msg;
//        System.out.println(Collection.class.isAssignableFrom(msg.getClass()));
//        System.out.println(msg.getClass().isAssignableFrom(Collection.class));
//        System.out.println(Collection.class.isAssignableFrom(String.class));
//        System.out.println();
//        Class clazz1 = Map.class;
//        Class clazz2 = HashMap.class;
//        boolean f = clazz1.isAssignableFrom(clazz2);
//        System.out.println(f);//TRUE
//        boolean f1 = clazz2.isAssignableFrom(clazz1);
//        System.out.println(f1);//TRUE
//        System.out.println();
//        System.out.println(Object.class.isAssignableFrom(int[].class));
//        System.out.println(Object.class.isAssignableFrom(Integer[].class));
//        int[] ins = new int[5];
//        Integer in1 = 5;
//        System.out.println(ins.getClass());
//        System.out.println(in1.getClass());
//
//    }
//
//    @Test
//    public void test(){
//        String s = null;
//        String s1 = null;
//        try {
//            s = InetAddress.getLocalHost().toString();
//            s1 = InetAddress.getLocalHost().getHostAddress();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//        System.out.println(s);
//
//        System.out.println(s1);
//        System.out.println("-------------");
//        Enumeration<NetworkInterface> nifs = null;
//        try {
//            nifs = NetworkInterface.getNetworkInterfaces();
//        } catch (SocketException e) {
//            e.printStackTrace();
//        }
//
//        while (nifs.hasMoreElements()) {
//            NetworkInterface nif = nifs.nextElement();
//
//            // 获得与该网络接口绑定的 IP 地址，一般只有一个
//            Enumeration<InetAddress> addresses = nif.getInetAddresses();
//            while (addresses.hasMoreElements()) {
//                InetAddress addr = addresses.nextElement();
//
//                if (addr instanceof Inet4Address) { // 只关心 IPv4 地址
//                    System.out.println("网卡接口名称：" + nif.getName());
//                    System.out.println("网卡接口地址：" + addr.getHostAddress());
//                    System.out.println();
//                }
//            }
//        }
//
//    }
}
