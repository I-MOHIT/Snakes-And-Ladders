package snakeAndLadder.entities;

import java.util.HashMap;

public class Board {
	HashMap<Integer,BoardEntity> cells;
	int cellCount;
	
	public Board(int dimension) {
		this.cellCount=dimension*dimension;
		cells=new HashMap<Integer,BoardEntity>();
		
		for(int i=0;i<dimension;i++) {
			int min=2;
			int max=cellCount-1;
			
			int start=(int) Math.floor(Math.random()*(max-min+1)+min);
			max=start-1;
			int end=(int) Math.floor(Math.random()*(max-min+1)+min);
			
			if(!hasSnakeOrLadderHead(start)) {
				setEntity(start,new Snake(start,end));
			}
			
			max=cellCount-1;
			end=(int) Math.floor(Math.random()*(max-min+1)+min);
			max=end-1;
			start=(int) Math.floor(Math.random()*(max-min+1)+min);
			
			if(!hasSnakeOrLadderHead(start)) {
				setEntity(start,new Ladder(start,end));
			}
		}
	}
	
	public void print() {
		for(int i=cellCount-1;i>0;i--) {
			System.out.println(i+" ");
			
			if(hasSnakeOrLadderHead(i)) {
				System.out.println(cells.get(i).getString());
			}else {
				System.out.println("    ");
			}
			
			if(i%10==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	private void setEntity(int index, BoardEntity e) {
		cells.put(index,e);
	}
	
	public BoardEntity getEntity(int index) {
		if(hasSnakeOrLadderHead(index)) {
			return this.cells.get(index);
		}
		return null;
	}
	
	public boolean hasSnakeOrLadderHead(int cellIndex) {
		return cells.containsKey(cellIndex);
	}
}
