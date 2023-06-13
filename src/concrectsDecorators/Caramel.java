package concrectsDecorators;

import boissons.Boisson;
import decorators.AbstractDecorator;

public class Caramel extends AbstractDecorator{

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " Au caramel";
	}

	@Override
	public double cout() {
		return 1 + boisson.cout();
	}

}
