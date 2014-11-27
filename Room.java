import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class Room {

    private final String description;
    private final Monster monster;
    private final static Random random = new Random();
    private final static Set<Integer> roomsSeen = new HashSet<Integer>();
    private final static int NUM_ROOMS = 7;

    private Room(String description, Monster monster) {
        this.description = description;
        this.monster = monster;
        
    }

    public static Room newRegularInstance() {
        if (roomsSeen.size() == NUM_ROOMS) {
            roomsSeen.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_ROOMS);
        } while (roomsSeen.contains(i));
        roomsSeen.add(i);

        String roomDescription = null;
        if (i == 0) {
            roomDescription = "bla bla bla";
        } else if (i == 1) {
            roomDescription = "bla bla bla";
        } else if (i == 2) {
            roomDescription = "bla bla bla";
        } else if (i == 3) {
            roomDescription = "bla bla bla";
        } else if (i == 4) {
            roomDescription =
                    "bla bla bla";
        } else if (i == 5) {
            roomDescription =
                    "bla bla bla";
        } else if (i == 6) {
            roomDescription = "bla bla blan";
        } else {
        }
        return new Room(roomDescription, Monster.newRandomInstance(), false);
    }

    public boolean isComplete() {
        return !monster.isAlive();
    }

    @Override
    public String toString() {
        return description;
    }

    public void enter(Player player) throws IOException {
        System.out.println(description);
        if (monster.isAlive()) {
            new Combat(player, monster);
        }
    }

}