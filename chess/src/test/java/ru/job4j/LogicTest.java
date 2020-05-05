package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class LogicTest {

    @Test
    public void checkD2PresenceFigure() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.D2));
        assertThat(logic.move(Cell.C1, Cell.G5), is(false));
    }

    @Test
    public void checkB2PresenceFigure() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.B2));
        assertThat(logic.move(Cell.C1, Cell.A3), is(false));
    }

    @Test
    public void checkG5PresenceFigure() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        assertThat(logic.move(Cell.C1, Cell.G5), is(true));
    }

    @Test
    public void checkH6PresenceFigure() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.E3));
        assertThat(logic.move(Cell.C1, Cell.H6), is(false));
    }

}
