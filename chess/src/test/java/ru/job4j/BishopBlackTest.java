package ru.job4j;

import org.junit.Test;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest  {

    @Test
    public void cellCheck() {
        BishopBlack black = new BishopBlack(Cell.C1);
        assertThat(black.position(), is(Cell.C1));
    }

    @Test
    public void checkingCorrectPosition() {
        Figure black = new BishopBlack(Cell.C1).copy(Cell.D2);
        assertThat(new BishopBlack(Cell.D2).position(), is(black.position()));
    }
    @Test
    public void GoDiagonalRomCToG5() {
        BishopBlack black = new BishopBlack(Cell.C1);
        assertThat(black.way(Cell.C1, Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
    @Test
    public void GoDiagonalRomGToC1() {
        BishopBlack black = new BishopBlack(Cell.G5);
        assertThat(black.way(Cell.G5, Cell.C1), is(new Cell[]{Cell.F4, Cell.E3, Cell.D2, Cell.C1}));
    }
    @Test
    public void GoDiagonalRomEToA3() {
        BishopBlack black = new BishopBlack(Cell.E3);
        assertThat(black.way(Cell.E3, Cell.A7), is(new Cell[]{Cell.D4, Cell.C5, Cell.B6, Cell.A7}));
    }
    @Test
    public void GoDiagonalRomAToE3() {
        BishopBlack black = new BishopBlack(Cell.A7);
        assertThat(black.way(Cell.A7, Cell.E3), is(new Cell[]{Cell.B6, Cell.C5, Cell.D4, Cell.E3}));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNoDiagonalWay(){
        new BishopBlack(Cell.C1).way(Cell.C1,Cell.E2);
    }

    @Test
    public void whenDiagonal(){
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.isDiagonal(Cell.C1,Cell.A8),is(false));
    }
}
