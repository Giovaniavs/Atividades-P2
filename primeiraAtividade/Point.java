package primeiraAtividade;

public class Point {
    private int x = 0, y = 0;

    public Point(int horizontalX, int verticalY) {
        if (horizontalX >=0 && horizontalX <= 400) {
            this.x = horizontalX;
            System.out.println("O valor de X é válido!");
        } else {
            System.out.println("O valor de X é inválido...");
        }

        if (verticalY >=0 && verticalY <= 400) {
            this.y = verticalY;
            System.out.println("O valor de Y é válido!");
        } else {
            System.out.println("O valor de Y é inválido...");
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { 
        if (x >=0 && x <= 400) {
            this.x = x; 
            System.out.println("Operação bem sucedida!");
        } else {
            System.out.println("O valor de X só pode estar entre 0 e 400");
        }
    }

    public void setY(int y) { 
        if (y >=0 && y <= 400) {
            this.y = y; 
            System.out.println("Operação bem sucedida!");
        } else {
            System.out.println("O valor de Y só pode estar entre 0 e 400");
        } 
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
}
