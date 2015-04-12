package ip_project.experiments.mechanics;

import ip_project.main.MIContainer;
import javafx.scene.control.Label;

/**
 * Newton's Second Law Experiment
 */
public class NewtonContainer extends MIContainer {

	public NewtonContainer(){
		super();
		this.getChildren().add(new Label("Newton's Second Law"));
	}
}