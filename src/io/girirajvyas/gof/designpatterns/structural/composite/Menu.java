package io.girirajvyas.gof.designpatterns.structural.composite;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}

	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		// First Append itself
		builder.append(print(this));

		// Append all the child components
		for (MenuComponent menuComponent : menuComponents) {
			builder.append(menuComponent.toString());
		}

		return builder.toString();
	}

}
