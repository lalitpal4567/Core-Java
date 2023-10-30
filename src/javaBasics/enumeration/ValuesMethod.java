package javaBasics.enumeration;

// values() method returns array of enum constants
// (1) public static enumType[] values();

public class ValuesMethod {
    enum Direction { EAST, WEST, NORTH, SOUTH, NORTH_EAST}

    public static void main(String[] args) {
        Direction[] dir = Direction.values();

        // enhanced for loop
        for (Direction direction : dir) {
            System.out.print(direction + " ");
        }

        // traditional for loop
        for(int index = 0; index < dir.length; index++){
            System.out.print("\n" + dir[index]);
        }
    }
}
