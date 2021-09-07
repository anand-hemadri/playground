package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.NotesCommand;
import net.matrix.recipe.models.Notes;

class NotesCommandToNotesTest {
    final NotesCommandToNotes notesConverter = new NotesCommandToNotes();

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(notesConverter.convert(new NotesCommand()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(notesConverter.convert(null));
    }

    @Test
    final void testConvert() {
        NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(123L);
        notesCommand.setRecipeNotes("notes torn notes");

        Notes notes = notesConverter.convert(notesCommand);
        assertEquals(123L, notes.getId());
        assertEquals("notes torn notes", notes.getRecipeNotes());
    }
}
