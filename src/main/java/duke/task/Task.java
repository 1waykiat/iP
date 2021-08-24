package duke.task;

/**
 * Encapsulates the name and completion status of the task.
 */

abstract public class Task {
    private final String name;
    private boolean completed;

    /**
     * Constructs a duke.task.Task object that contains the name and completion status set to false.
     * @param name The name of the duke.task.Task.
     */
    public Task(String name) {
        this.name = name;
        completed = false;
    }

    /**
     * Prints out the message to be shown when a new task has been added to the duke.task.Task list.
     * @param size Total number of tasks in the list
     */
    public void addResponse(int size) {
        System.out.println("Got it. I've added this task:");
        System.out.println(this.toString());
        System.out.println("Now you have " + size + " tasks in your list.");
    }

    public String getName() {
        return this.name;
    }

    public String getCompletion() {
        return (completed ? "X" : " ");
    }

    /**
     * Toggles the completion status.
     */
    public void toggleCompleted() {
        this.completed = !this.completed;
    }

    //TODO
    abstract public String getType();

    //TODO
    abstract public String getInfo();

    /**
     * Converts task into a string
     * @return String containing completion status and name.
     */
    public String toString() {
        return "[" + (completed ? "X" : " ") + "] " + this.name;
    }
}