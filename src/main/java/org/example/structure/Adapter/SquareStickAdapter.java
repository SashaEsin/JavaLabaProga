package org.example.structure.Adapter;

public class SquareStickAdapter extends RoundStick {
    private SquareStick stick;

    public SquareStickAdapter(SquareStick stick) {
        super(0); // Радиус не требуется, передаем 0
        this.stick = stick;
    }

    @Override
    public int getRadius() {
        // Вычисляем половину диагонали квадратной палки по теореме Пифагора.
        return (int) (stick.getWidth() * Math.sqrt(2) / 2);
    }
}