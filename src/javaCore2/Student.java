package javaCore2;

public class Student {
    protected final String studying;
    protected Student(String work) {
        this.studying = work;
    }
    public Student() {
        this.studying = "Прохожу тестовое задание.";
    }
    public void study() {
        System.out.println("Я очень занят. " + studying);
    }
}

class JavaStudent extends Student {
    public JavaStudent() {
        super("Прохожу курс по Java.");
    }
}

class LazyStudent extends Student{
    public LazyStudent() {
    }

    public void study() {
        System.out.println("Сегодня не учусь, мне лень.");
    }
}