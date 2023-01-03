package src;
import javax.swing.*;

class ChessEngineStart {
    // caps for one team and lower is another
    // A,a is king
    static String chessBoard[][]={
        {"r","k","b","q","a","b","k","r"},
        {"p","p","p","p","p","p","p","p"},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {"P","P","P","P","P","P","P","P"},
        {"R","K","B","Q","A","B","K","R"}};

    public static void main (String[] args) {
        JFrame f = new JFrame("Chess Engine");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserInterface ui = new UserInterface();
        f.add(ui);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public static String possibleMoves() {
        return "";
        //row1,col1,row2,col2,captured piece <- Notation of the possible moves
        // captured piece param allows us to undo moves (putting back taken pieces)
    }
}
