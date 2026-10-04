package javaCore3;

public class Robot implements RobotConnection, RobotConnectionManager {
    @Override
    public RobotConnection getConnection() {
        //уже кто-то сделал
    }

    public void moveRobotTo(int x, int y) {
        //уже кто-то сделал
    }

    @Override
    public void close() {
        //уже кто-то сделал
    }
}
// этот второй, он управляет роботом, когда соединение уже выполнено,
// но его нужно каждый раз закрывать,
// пробрасывает исключение RobotConnectionException
interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y) throws RobotConnectionException;
    @Override
    void close();
}
//этот первый, он устанавливает соединение, он должен пробрасывать исключение RobotConnectionException
interface RobotConnectionManager {
    RobotConnection getConnection() throws RobotConnectionException;
}
class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(String message) {
        super(message);
    }
    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
//class Manager extends Robot {
//    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
//        for (int i = 0; i < 3; i++) {
//            RobotConnection connection = null;
//
//            try {
//                connection = robotConnectionManager.getConnection();
//                connection.moveRobotTo(toX, toY);
//                return;
//
//            } catch (RobotConnectionException e) {
//                if (i == 2) {
//                    throw e;
//                }
//
//            } catch (Exception e) {
//                throw e;
//
//            } finally {
//                if (connection != null) {
//                    try {
//                        connection.close();
//                    } catch (RobotConnectionException ignored) {
//                    }
//                }
//            }
//        }
//    }
//}


class Manager extends Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e) {
                if(e.getSuppressed().length > 0) {
                    continue;
                }
                if (i == 2) {
                    throw e;
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }
}