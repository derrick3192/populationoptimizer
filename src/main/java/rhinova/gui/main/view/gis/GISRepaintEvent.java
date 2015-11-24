package rhinova.gui.main.view.gis;

import org.springframework.context.ApplicationEvent;

public class GISRepaintEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GISRepaintEvent(Object source) {
		super(source);
	}

}
