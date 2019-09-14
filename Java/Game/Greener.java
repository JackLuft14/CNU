import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Greener {
    
    private static class Queue<T>{
        private List<T> list = new LinkedList<T>();
        
        public void enqueue(T value){
            list.add(value);
        }
        public T dequeue(){
            return list.remove(0);
        }
        public boolean isEmpty(){
            return list.isEmpty();
        }
        public T peek(){
            T item = list.remove(0);
            list.add(0, item);
            return item;
        }
        public int getLength(){
            int len = 0;
            Queue<T> temp = new Queue<T>();
            while(!this.isEmpty()){
                temp.enqueue(this.dequeue());
                len++;
            }
            while(!temp.isEmpty()){
                this.enqueue(temp.dequeue());
            }
            return len;
        }
        public int num(int i){
            int ret = 0;
            Queue<T> temp = new Queue<T>();
            while(!this.isEmpty()){
                int comp = (int)this.dequeue();
                if(comp == i)
                    ret++;
                temp.enqueue((T)(Integer)comp);
            }
            while(!temp.isEmpty()){
                this.enqueue(temp.dequeue());
            }
            return ret;
        }
    }

    private int h = 6;
    private int w = 6;
    private Queue[][] board = new Queue[h][w];
    private static final int P1 = 1;
    private static final int P2 = 2;
    private static int p1score = 0;
    private static int p2score = 0;
    private static int numX = 8;
    private static int numO = 8;
    private static boolean done = false;
    
    public void draw(){ //--------------DRAW SECOND BOARD WITH SPACE NUM VALUES!!
        System.out.println("  A B C D E F         A B C D E F");
        for(int row = 0; row < board.length; row++){
            System.out.print(row+1);
            for(int col = 0; col < board[row].length; col++){
                System.out.print(" ");
                switch((int)board[row][col].peek()){
                    case  0: System.out.print("-"); break;
                    case P1: System.out.print("X"); break;
                    case P2: System.out.print("O"); break;
                    case -1: System.out.print(" "); break;
                }
            }
            System.out.print("       "+(row+1));
            for(int col = 0; col < board[row].length; col++){
                System.out.print(" ");
                if(board[row][col].num(0) == 0 || (int)board[row][col].peek() == 0)
                    System.out.print(" ");
                else
                    System.out.print(board[row][col].num(0));
            }
            System.out.println();
        }
    }
    
    // Randomly place 8 of each piece on board
    public void start(){
        System.out.println("Player 1 is X");
        System.out.println("Player 2 is O");
        System.out.println();
        int X = 0;
        int O = 0;
        while(X < numX && O < numO){
            for(int row = 0; row < board.length; row++){
                for(int col = 0; col < board[row].length; col++){
                    board[row][col] = new Queue<Integer>();
                    double rand = Math.random();
                    if(rand < 0.3 && X < numX){
                        board[row][col].enqueue((Integer)P1);
                        X++;
                    }
                    else if(rand < 0.6 && O < numO){
                        board[row][col].enqueue((Integer)P2);
                        O++;
                    }
                    else{
                        board[row][col].enqueue((Integer)0);
                    }
                }
            }
        }
    }
    
    private static int[] coords(String loc){
        char[] coords = loc.toCharArray();
        int[] dest = {-1, -1};
        
        switch(coords[0]){
            case 'A' : dest[1] = 0; break;
            case 'B' : dest[1] = 1; break;
            case 'C' : dest[1] = 2; break;
            case 'D' : dest[1] = 3; break;
            case 'E' : dest[1] = 4; break;
            case 'F' : dest[1] = 5; break;
            default  : return dest;
        }
        switch(coords[1]){
            case '1' : dest[0] = 0; break;
            case '2' : dest[0] = 1; break;
            case '3' : dest[0] = 2; break;
            case '4' : dest[0] = 3; break;
            case '5' : dest[0] = 4; break;
            case '6' : dest[0] = 5; break;
            default  : return dest;
        }
        return dest;
    }
    
    // Determine if selected piece can move---------WORK ON!!!!!!!!!!!!
    public static boolean canMove(int player, String start){
        return true;
    }
    // Determine if piece is appropriate
    public static boolean incorrectPiece(int player, String start, Queue[][] board){

        if(start.length() != 2)
            return true;
        //MORE WORK HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        int[] dest = coords(start);
        
        return (int)board[dest[0]][dest[1]].peek() != player;
    }
    
    // Determine if destination is allowed
    public static boolean incorrectDest(int player, String strt, String fin, Queue[][] board){
        int[] begin = coords(strt);
        if (fin.equals("u")){
            while(begin[0]>0){
                if(!((int)board[begin[0]-1][begin[1]].peek() == -1))
                    return false;
                begin[0]--;
            }
        }
        else if (fin.equals("d")){
            while(begin[0]<5){
                if(!((int)board[begin[0]+1][begin[1]].peek() == -1))
                    return false;
                begin[0]++;
            }
        }
        else if (fin.equals("l")){
            while(begin[1]>0){
                if(!((int)board[begin[0]][begin[1]-1].peek() == -1))
                    return false;
                begin[1]--;
            }
        }
        else if (fin.equals("r")){
            while(begin[1]<5){
                if(!((int)board[begin[0]][begin[1]+1].peek() == -1))
                    return false;
                begin[1]++;
            }
        }
        return true;
    }
    
    // determine coordinates of destination
    public static int[] dest(String strt, String mv, Queue[][] board){
        int[] begin = coords(strt);
        int[] fin = {0,0};
        boolean empty = (int)board[begin[0]][begin[1]].peek() == -1;
        if(mv.equals("u")){
            while(begin[0]>0){
                if(!((int)board[begin[0]-1][begin[1]].peek() == -1)){
                    fin[0] = begin[0]-1;
                    fin[1] = begin[1];
                    break;
                }
                begin[0]--;
            }
        }
        else if(mv.equals("d")){
            while(begin[0]<6){
                if(!((int)board[begin[0]+1][begin[1]].peek() == -1)){
                    fin[0] = begin[0]+1;
                    fin[1] = begin[1];
                    break;
                }
                begin[0]++;
            }
        }
        else if(mv.equals("l")){
            while(begin[1]>0){
                if(!((int)board[begin[0]][begin[1]-1].peek() == -1)){
                    fin[0] = begin[0];
                    fin[1] = begin[1]-1;
                    break;
                }
                begin[1]--;
            }
        }
        else if(mv.equals("r")){
            while(begin[1]<6){
                if(!((int)board[begin[0]][begin[1]+1].peek() == -1)){
                    fin[0] = begin[0];
                    fin[1] = begin[1]+1;
                    break;
                }
                begin[1]++;
            }
        }
        return fin;
    }
    
    // update locations and redraw
    public void update(int player, String strt, int[] fin, Queue[][] board){
        int[] begin = coords(strt);
        int destVal = (int)board[fin[0]][fin[1]].peek();
        
        Queue<Integer> tempQ = new Queue<Integer>();
        while(!board[fin[0]][fin[1]].isEmpty()){
            tempQ.enqueue((Integer)board[fin[0]][fin[1]].dequeue());
        }
        while(!board[begin[0]][begin[1]].isEmpty()){
            board[fin[0]][fin[1]].enqueue((Integer)board[begin[0]][begin[1]].dequeue());
        }
        while(!tempQ.isEmpty()){
            board[fin[0]][fin[1]].enqueue((Integer)tempQ.dequeue());
        }
        
        board[begin[0]][begin[1]].enqueue((Integer)(-1));
        
        // Update scores
        p1score = 0;
        p2score = 0;
        System.out.println(".........");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((int)board[i][j].peek() == P1){
                    p1score += board[i][j].num(0);
                }
                else if((int)board[i][j].peek() == P2){
                    p2score += board[i][j].num(0);
                }
            }
        }
        
        if (destVal == P1)
            numX--;
        else if (destVal == P2)
            numO--;
        //GAME OVER----------------ADD NO MOVES CONDITION!!!!!!
        if(numX == 0 || numO == 0)
            done = true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Greener game = new Greener();
        
        System.out.println("////////////////////");
        
        game.start();
        
        int player = 2;
        String start = "";
        String move = "";
        int[] finish = {0,0};
        
        while(!done){
            if (player == P1){
                player = P2;
            } else{
                player = P1;
            }
            game.draw();
            
            System.out.println("PLAYER " + player);
            do {
                System.out.println("Enter starting coordinates (A1): ");
                start = input.nextLine();
            } while(incorrectPiece(player, start, game.board));
            
            do {
                System.out.println("Enter direction (u,d,l,r): ");
                move = input.nextLine();
            } while(incorrectDest(player, start, move, game.board));
            
            finish = dest(start, move, game.board);
            game.update(player, start, finish, game.board);
            System.out.println();
            System.out.println("Player 1 score: " + p1score);
            System.out.println("Player 2 score: " + p2score);
            
        }
        
        System.out.println("---------------");
        System.out.println("Player " + player + " wins!!");
        input.close();
    }

}
