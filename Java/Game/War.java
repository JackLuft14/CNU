import java.util.ArrayList;
public class War {
	public static int compare(int a, int b){
		if(a > b){
			return 1;
		} 
		else if(b > a){
			return 2;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args){
		int turns = 0;
		int[] Deck = {14,14,14,14,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13};
		ArrayList<Integer> fullDeck = new ArrayList<Integer>(52);
		for(int i = 0; i < 52; i++){
			fullDeck.add(Deck[i]);
		}
		
		//Create decks
		Queue<Integer> deck1 = new Queue<Integer>();
		Queue<Integer> deck2 = new Queue<Integer>();
		int max = fullDeck.size()-1;
		int index = 0;
		int card = 0;
		for(int j = 0; j < 26; j++){
			index = (int)(Math.random()*(max+1));
			card = fullDeck.remove(index);
			max--;
			deck1.enqueue(card);
		}
		for(int k = 0; k < 26; k++){
			index = (int)(Math.random()*(max+1));
			card = fullDeck.remove(index);
			max--;
			deck2.enqueue(card);
		}
		
		//compare cards
		while(!deck1.isEmpty() && !deck2.isEmpty()){
			int card1 = deck1.dequeue();
			if(card1 == 11)
				System.out.print("J ");
			else if(card1 == 12)
				System.out.print("Q ");
			else if(card1 == 13)
				System.out.print("K ");
			else if(card1 == 14)
				System.out.print("A ");
			else{
				System.out.print(card1 + " ");
			}
			int card2 = deck2.dequeue();
			if(card2 == 11)
				System.out.print("J    ");
			else if(card2 == 12)
				System.out.print("Q    ");
			else if(card2 == 13)
				System.out.print("K    ");
			else if(card2 == 14)
				System.out.print("A    ");
			else{
				System.out.print(card2 + "    ");
			}
			
			if(compare(card1, card2) == 1){
				deck1.enqueue(card1);
				deck1.enqueue(card2);
				System.out.println("<-");
				turns++;
			}
			else if(compare(card1, card2) == 2){
				deck2.enqueue(card2);
				deck2.enqueue(card1);
				System.out.println(" ->");
				turns++;
			}
			//war!
			else{
				int card1a =0;
				int card1b =0;
				int card1c =0;
				int card2a =0;
				int card2b =0;
				int card2c =0;
				int card1x =0;
				int card2x =0;
				int card1d =0;
				int card1e =0;
				int card1f =0;
				int card2d =0;
				int card2e =0;
				int card2f =0;
				int card1z =0;
				int card2z =0;
				try{
					card1a = deck1.dequeue();
					System.out.print("x ");
					card1b = deck1.dequeue();
					System.out.print("x ");
					card1c = deck1.dequeue();
					System.out.print("x ");
					card1x = deck1.dequeue();
					if(card1x == 11)
						System.out.print("J ");
					else if(card1x == 12)
						System.out.print("Q ");
					else if(card1x == 13)
						System.out.print("K ");
					else if(card1x == 14)
						System.out.print("A ");
					else{
						System.out.print(card1x + " ");
					}
				}
				catch(IndexOutOfBoundsException e){
					System.out.println();
					System.out.println("Player 1 is out of cards");
					break;
				}
				try{
					card2a = deck2.dequeue();
					System.out.print("x ");
					card2b = deck2.dequeue();
					System.out.print("x ");
					card2c = deck2.dequeue();
					System.out.print("x ");
					card2x = deck2.dequeue();
					if(card2x == 11)
						System.out.print("J    ");
					else if(card2x == 12)
						System.out.print("Q    ");
					else if(card2x == 13)
						System.out.print("K    ");
					else if(card2x == 14)
						System.out.print("A    ");
					else{
						System.out.print(card2x + "    ");
					}
				}
				catch(IndexOutOfBoundsException e){
					System.out.println();
					System.out.println("Player 2 is out of cards");
					break;
				}
					
					
					
					
				if(compare(card1x, card2x) == 1){
					deck1.enqueue(card1);
					deck1.enqueue(card2);
					deck1.enqueue(card1a);
					deck1.enqueue(card2a);
					deck1.enqueue(card1b);
					deck1.enqueue(card2b);
					deck1.enqueue(card1c);
					deck1.enqueue(card2c);
					deck1.enqueue(card1x);
					deck1.enqueue(card2x);
					System.out.println("<-");
					turns++;
				}
				else if(compare(card1x, card2x) == 2){
					deck2.enqueue(card1);
					deck2.enqueue(card2);
					deck2.enqueue(card1a);
					deck2.enqueue(card2a);
					deck2.enqueue(card1b);
					deck2.enqueue(card2b);
					deck2.enqueue(card1c);
					deck2.enqueue(card2c);
					deck2.enqueue(card1x);
					deck2.enqueue(card2x);
					System.out.println(" ->");
					turns++;
				}
			
				//double war!!
				else{
					try{
						card1d = deck1.dequeue();
						System.out.print("x ");
						card1e = deck1.dequeue();
						System.out.print("x ");
						card1f = deck1.dequeue();
						System.out.print("x ");
						card1z = deck1.dequeue();
						if(card1z == 11)
							System.out.print("J ");
						else if(card1z == 12)
							System.out.print("Q ");
						else if(card1z == 13)
							System.out.print("K ");
						else if(card1z == 14)
							System.out.print("A ");
						else{
							System.out.print(card1z + " ");
						}
					}
					catch(IndexOutOfBoundsException e){
						System.out.println();
						System.out.println("Player 1 is out of cards");
						break;
					}
					try{
						card2d = deck2.dequeue();
						System.out.print("x ");
						card2e = deck2.dequeue();
						System.out.print("x ");
						card2f = deck2.dequeue();
						System.out.print("x ");
						card2z = deck2.dequeue();
						if(card2z == 11)
							System.out.print("J    ");
						else if(card2z == 12)
							System.out.print("Q    ");
						else if(card2z == 13)
							System.out.print("K    ");
						else if(card2z == 14)
							System.out.print("A    ");
						else{
							System.out.print(card2z + "    ");
						}
					}
					catch(IndexOutOfBoundsException e){
						System.out.println();
						System.out.println("Player 2 is out of cards");
						break;
					}
						
					if(compare(card1z, card2z) == 1){
						deck1.enqueue(card1);
						deck1.enqueue(card2);
						deck1.enqueue(card1a);
						deck1.enqueue(card2a);
						deck1.enqueue(card1b);
						deck1.enqueue(card2b);
						deck1.enqueue(card1c);
						deck1.enqueue(card2c);
						deck1.enqueue(card1x);
						deck1.enqueue(card2x);
						deck1.enqueue(card1d);
						deck1.enqueue(card2d);
						deck1.enqueue(card1e);
						deck1.enqueue(card2e);
						deck1.enqueue(card1f);
						deck1.enqueue(card2f);
						deck1.enqueue(card1z);
						deck1.enqueue(card2z);
						System.out.println("<-");
						turns++;
					}
					else if(compare(card1z, card2z) == 2){
						deck2.enqueue(card1);
						deck2.enqueue(card2);
						deck2.enqueue(card1a);
						deck2.enqueue(card2a);
						deck2.enqueue(card1b);
						deck2.enqueue(card2b);
						deck2.enqueue(card1c);
						deck2.enqueue(card2c);
						deck2.enqueue(card1x);
						deck2.enqueue(card2x);
						deck2.enqueue(card1d);
						deck2.enqueue(card2d);
						deck2.enqueue(card1e);
						deck2.enqueue(card2e);
						deck2.enqueue(card1f);
						deck2.enqueue(card2f);
						deck2.enqueue(card1z);
						deck2.enqueue(card2z);
						System.out.println(" ->");
						turns++;
					}
					else{
						break;
					}
				}
			}
		}
		if(deck2.isEmpty()){
			System.out.println("PLAYER 1 WINS!!");
		}
		else if(deck1.isEmpty()){
			System.out.println("PLAYER 2 WINS!!");
		}
		else{
			System.out.println("I give up");
		}
		System.out.println(turns + " turns");
	}
}
