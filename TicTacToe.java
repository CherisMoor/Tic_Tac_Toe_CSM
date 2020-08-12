public class TicTacToe {
    public static void main(String[] args) {

        char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' }, };
        printGameBoard(gameBoard);

        Scanner user1 = new Scanner(System.in);
        System.out.println("Enter your placement (1-9): ");
        int position = user1.nextInt();
        System.out.println(position);

        switch (position) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][1] = 'X';
                break;
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}