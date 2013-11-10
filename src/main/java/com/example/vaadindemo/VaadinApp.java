package com.example.vaadindemo;

import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@Title("Vaadin Demo App")
public class VaadinApp extends UI {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		
		final TextField tf = new TextField();
		Button bt = new Button("click me");
		final Label lbl = new Label("Hello");
		
		HorizontalLayout hl = new HorizontalLayout();
		hl.addComponent(tf);
		hl.addComponent(bt);
		hl.addComponent(lbl);
		
		setContent(hl);
		
		bt.addClickListener(new ClickListener() {

			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				String message = tf.getValue();
				lbl.setValue(message);			
			}
		});

	}

}
