package HW6;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private static Map<Integer, User> hash = new HashMap<Integer, User>();

    public IdentityMap() {
    }

    public static User isInto(int key) throws Exception {
        User user = hash.get(key);
        return user;
    }

    public static void addMap(User user) {
        hash.put(user.getIdUser(), user);
    }
}
