public class CrapsGame {
  private int point = 0;

  private enum Game_State {
    NEW_ROLL,
    KEEP_ROLLING
  }

  private Game_State game_state = Game_State.NEW_ROLL;

  public int processRoll(int total) {

    int num = total - point;

    switch (game_state) {
      case NEW_ROLL:
        switch (total) {
          case 7:
          case 11:
            game_state = Game_State.NEW_ROLL;
            return 1;
          case 2:
          case 3:
          case 12:
            game_state = Game_State.NEW_ROLL;
            return -1;
          default:
            game_state = Game_State.KEEP_ROLLING;
            point = total;
            return 0;
        }
      case KEEP_ROLLING:
        switch (total) {
          case 7:
            game_state = Game_State.NEW_ROLL;
            point = 0;
            return -1;
          default:
            switch (num) {
              case 0:
                game_state = Game_State.NEW_ROLL;
                point = 0;
                return 1;
              default:
                game_state = Game_State.KEEP_ROLLING;
                return 0;
            }

        }
      default:
        return 0;
    }
  }

  public int getPoint() {
    return point;
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
