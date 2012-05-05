package benchmarks;
import java.util.Hashtable;
//import java.util.Map;
//import java.util.HashMap;

class Hash {
    private static final String aaa = "aaa";

    public static void main(String[] args) {
        //Integer i = new Integer(0);
        int i = 0;
        Hashtable h = new Hashtable();
        //Map<Integer, String> h = new HashMap<Integer, String>();
        System.out.println("Running..");
        i = 0;
        StringBuffer buf = new StringBuffer(30);
        //String aaa = "aaa";
        while(i < 10000000)
        {
            // with String:
            //h.put(i, "aaa" + i);
            //h.put(i, aaa + i);
            // with StringBuffer
            buf.delete(0, 30);
            buf.append(aaa);
            buf.append(i);
            h.put(i, buf.toString());
            //h.put(i, "aaa" + i.toString());
            if(i < 100)
            {
                // System.out.println(String.format("aaa%d", i));
                System.out.printf("aaa%d\n", i);
            }
            i += 1;
        }
    }

}

// without -server
// Integer, hashtable, explicit toString = 26,9s

// -server

// int, hashmap, server = 7,3s
// Integer, hashmap, server = 13,8s
// Integer, hashmap, server, explicit toString = 14,0

// int, hashtable, server = 8,1s
// Integer, hashtable, server = 15,6s
// Integer, hashtable, server, explicit toString = 15,1s

// using String Buffer

// Integer, hashtable, server, StringBuffer, explicit toString = 9,6s
// Integer, hashtable, StringBuffer, explicit toString = 28,2s

// Integer, hashtable, server, StringBuffer, explicit toString, using aaa private static final = 6,9s
// int, hashtable, server, StringBuffer, explicit toString, using aaa private static final = 5,9s

// int, HashMap, server, StringBuffer, explicit toString, using aaa private static final = 8,08s

