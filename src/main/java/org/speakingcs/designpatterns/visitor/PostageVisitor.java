package org.speakingcs.designpatterns.visitor;

public class PostageVisitor implements Visitor {

	private double totalPostageForCart;

	@Override
	public void visit(Book book) {
			totalPostageForCart += book.getWeight() * 2;
	}

	public double getTotalPostage() {
		return totalPostageForCart;
	}

}
