package LinkedLists;
import java.util.*;

class User {
    int userId, age;
    String name;
    List<Integer> friends = new ArrayList<>();
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
}

public class SocialMedia {
    User head;

    void addUser(int id, String name, int age) {
        User u = new User(id, name, age);
        if (head == null) head = u;
        else {
            User temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = u;
        }
    }

    User findUser(int id) {
        for (User temp = head; temp != null; temp = temp.next)
            if (temp.userId == id) return temp;
        return null;
    }

    void addFriend(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 != null && u2 != null && id1 != id2) {
            if (!u1.friends.contains(id2)) u1.friends.add(id2);
            if (!u2.friends.contains(id1)) u2.friends.add(id1);
        }
    }

    void removeFriend(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            u1.friends.remove((Integer) id2);
            u2.friends.remove((Integer) id1);
        }
    }

    void displayFriends(int id) {
        User u = findUser(id);
        if (u != null) {
            System.out.print(u.name + "'s friends: ");
            for (int fid : u.friends) System.out.print(fid + " ");
            System.out.println();
        }
    }

    void mutualFriends(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            System.out.print("Mutual friends: ");
            for (int f1 : u1.friends)
                if (u2.friends.contains(f1)) System.out.print(f1 + " ");
            System.out.println();
        }
    }

    void searchUser(String keyword) {
        for (User temp = head; temp != null; temp = temp.next)
            if (temp.name.equalsIgnoreCase(keyword) || String.valueOf(temp.userId).equals(keyword))
                System.out.println("Found: " + temp.name + " (ID: " + temp.userId + ")");
    }

    void countFriends() {
        for (User temp = head; temp != null; temp = temp.next)
            System.out.println(temp.name + " has " + temp.friends.size() + " friend(s).");
    }

    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 22);
        sm.addUser(3, "Charlie", 20);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);

        sm.displayFriends(1);
        sm.mutualFriends(2, 3);

        sm.searchUser("Bob");
        sm.countFriends();
    }
}
