package javaCore5;

class Zalupa {
    public static class Box<T> {
        private T object;
        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }
}
