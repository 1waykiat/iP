package duke.command;

import duke.general.Storage;
import duke.general.Tasklist;
import duke.general.Ui;

public class ByeCommand extends Command {

    @Override
    public void execute(Tasklist tasks, Storage storage, Ui ui) {
        ui.byeResponse();
        ui.stopLoop();
    }
}