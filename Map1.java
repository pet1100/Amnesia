import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public final class Map1 {

	private final Map<Integer, Map<Integer, Room>> map = new HashMap<Integer, Map<Integer, Room>>();
    private Room currentRoom;
    private int positiontX = 0;
    private int positionY = 0;

    private Map1() {
    }

    private void putRoom(int x, int y, Room room) {
        if (!map.containsKey(x)) {
            map.put(x, new HashMap<Integer, Room>());
        }
        map.get(x).put(y, room);
    }

    private Room getRoom(int x, int y) {
        return map.get(x).get(y);
    }

    private boolean roomExists(int x, int y) {
        if (!map.containsKey(x)) {
            return false;
        }
        return map.get(x).containsKey(y);
    }

    private boolean isComplete() {
        return currentRoom.isComplete();
    }

    public void movePlayer(Player player) throws IOException {
        boolean northPossible = roomExists(positiontX, positionY + 1);
        boolean southPossible = roomExists(positiontX, positionY - 1);
        boolean eastPossible = roomExists(positiontX + 1, positionY);
        boolean westPossible = roomExists(positiontX - 1, positionY);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String direction = in.readLine();
        if (direction.equals("go north") && northPossible) {
            positionY++;
        } else if (direction.equals("go south") && southPossible) {
            positionY--;
        } else if (direction.equals("go east") && eastPossible) {
            positiontX++;
        } else if (direction.equals("go west") && westPossible) {
            positiontX--;
        }
        currentRoom = getRoom(positiontX, positionY);
        currentRoom.enter(player);
    }

    public static Map1 newInstance() {
        Map1 dungeon = new Map1();
        dungeon.putRoom(0, 0, Room.newRegularInstance());
        dungeon.putRoom(-1, 1, Room.newRegularInstance());
        dungeon.putRoom(0, 1, Room.newRegularInstance());
        dungeon.putRoom(1, 1, Room.newRegularInstance());
        dungeon.putRoom(-1, 2, Room.newRegularInstance());
        dungeon.putRoom(1, 2, Room.newRegularInstance());
        dungeon.putRoom(-1, 3, Room.newRegularInstance());
        dungeon.putRoom(0, 3, Room.newRegularInstance());
        dungeon.putRoom(1, 3, Room.newRegularInstance());
        dungeon.putRoom(0, 4, Room.newRegularInstance());
        dungeon.currentRoom = dungeon.getRoom(0, 0);
        return dungeon;
    }

}