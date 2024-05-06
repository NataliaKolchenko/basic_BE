package Tasks.main;

import Tasks.main.sub_task.SubTask;

public class Main {

    public static void main(String[] args) {
//        Task task = new Task ();
        SubTask subTask = new SubTask ();

//        System.out.println(task.getInfo());
//        System.out.println(subTask.getInfo());
//        task.setInfo("Hello");
//        System.out.println(task.getInfo());

        System.out.println(subTask.getData());

    }
}
