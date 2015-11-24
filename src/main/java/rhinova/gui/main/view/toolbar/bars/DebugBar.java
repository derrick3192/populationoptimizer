package rhinova.gui.main.view.toolbar.bars;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import rhinova.gui.main.view.gis.GISRepaintEvent;
import rhinova.gui.main.view.toolbar.MainToolBarMenu;

public class DebugBar extends MainToolBarMenu {
	
	private static final long serialVersionUID = 1L;
	@Autowired
	ApplicationEventPublisher publisher;

	public DebugBar() {
		super("Debug");
		
		this.addNewAl(new RepaintAction(),"Repaint");
	}
	
	public class RepaintAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			publisher.publishEvent(new GISRepaintEvent(this));
			System.out.println("repaint");
		}
		
	}

}
