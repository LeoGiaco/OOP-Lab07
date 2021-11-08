package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> sequenceList;

	public OneListAcceptable(List<T> sequenceList) {
		this.sequenceList = sequenceList;
	}

	@Override
	public Acceptor<T> acceptor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public class OneListAcceptor implements Acceptor<T> {

		private int position;
		private final List<T> sequence;
		
		public OneListAcceptor(final List<T> sequence) {
			this.sequence = sequence;
			this.position = 0;
		}

		@Override
		public void accept(T newElement) throws ElementNotAcceptedException {
			if(position >= this.sequence.size() || !this.sequence.get(this.position).equals(newElement)) {
				throw new ElementNotAcceptedException(newElement);
			} else {
				this.position++;
			}
		}

		@Override
		public void end() throws EndNotAcceptedException {
			if(this.position < this.sequence.size()) {
				throw new EndNotAcceptedException();
			}
		}
	}

}