package com.gonzalo.tourman.UI.Interfaces;

import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

public interface IMainUIBuilder {
	public HorizontalSplitPanel buildMainLayout();
	public VerticalLayout createWorkingLayout();
}
