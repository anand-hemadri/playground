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
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Override
    public Notes convert(NotesCommand source) {
        synchronized (this) {
            Notes notes = null;
            if (source != null) {
                notes = new Notes();
                notes.setId(source.getId());
                notes.setRecipeNotes(source.getRecipeNotes());
            }
            return notes;
        }
    }

}
