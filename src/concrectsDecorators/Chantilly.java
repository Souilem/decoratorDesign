package concrectsDecorators;

import boissons.Boisson;
import decorators.AbstractDecorator;

public class Chantilly extends AbstractDecorator {

	public Chantilly(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " Au chantilly";
	}

	@Override
	public double cout() {
		return 0.9 + boisson.cout();
	}

}
