package net.controltheory.JavaIRC.Structures;

import java.awt.Component;
import java.awt.Container;

import net.controltheory.JavaIRC.UiElements.OptionsFrame;

public class OptionsSaver {

	public OptionsSaver(OptionsFrame optionsFrame) {
		for (Component c : optionsFrame.getContentPane().getComponents()) {
			// System.out.println(optionsFrame.getComponentCount());
			if (c.getName() != null) {
				for (Component c1 : ((Container) c).getComponents()) {
					if (c1.getName() != null) {
						System.out.println(c1.getName());
					}
				}
			}
		}
	}

}
