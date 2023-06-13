package concrectsDecorators;

import boissons.Boisson;
import decorators.AbstractDecorator;

public class Vanille extends AbstractDecorator {

	public Vanille(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		return 0.8 + boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " Au vanille";
	}

}
