package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.NotesCommand;
import net.matrix.recipe.models.Notes;

class NotesToNotesCommandTest {
    final NotesToNotesCommand notesConverter = new NotesToNotesCommand();

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(notesConverter.convert(new Notes()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(notesConverter.convert(null));
    }

    @Test
    final void testConvert() {
        Notes notes = new Notes();
        notes.setId(123L);
        notes.setRecipeNotes("notes torn notes");

        NotesCommand notesCommand = notesConverter.convert(notes);
        assertEquals(123L, notesCommand.getId());
        assertEquals("notes torn notes", notesCommand.getRecipeNotes());
    }
}
