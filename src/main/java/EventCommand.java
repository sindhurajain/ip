public class EventCommand extends Command{

    private String description;
    private String startTime;
    private String endTime;

    EventCommand(String description, String startTime, String endTime) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Event event;
        event = new Event(description, startTime, endTime);
        tasks.add(event);
        ui.taskResponse(event, tasks);
        storage.saveList(tasks.getTasks());
    }

}