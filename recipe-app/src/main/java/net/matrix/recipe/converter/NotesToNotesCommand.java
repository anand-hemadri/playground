/**
 *
 */
package net.matrix.recipe.converter;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.NotesCommand;
import net.matrix.recipe.models.Notes;

/**
 * @author anand.hemadri
 *
 */
public class NotesToNotesCommand implements Converter<Notes, NotesCommand> {
    /**
     * Constructs a new instance of {@link NotesToNotesCommand}.
     */
    public NotesToNotesCommand() {}


    @Override
    public NotesCommand convert(Notes source) {
        NotesCommand notesCommand = null;
        synchronized (this) {
            if (source != null) {
                notesCommand = new NotesCommand();
                notesCommand.setId(source.getId());
                notesCommand.setRecipeNotes(source.getRecipeNotes());
            }
            return notesCommand;
        }
    }

}
