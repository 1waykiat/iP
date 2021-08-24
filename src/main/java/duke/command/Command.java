package duke.command;

import duke.error.DukeException;
import duke.general.Storage;
import duke.general.Tasklist;
import duke.general.Ui;

/**
 * Class to deal with the actions and method calls to be done for different commands
 */
abstract public class Command {
    public abstract void execute(Tasklist tasks, Storage storage, Ui ui) throws DukeException;
}
