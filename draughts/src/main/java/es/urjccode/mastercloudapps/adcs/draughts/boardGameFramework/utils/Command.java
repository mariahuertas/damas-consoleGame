package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;

public abstract class Command {

    protected AceptorController aceptorController;

    protected Command(String title, AceptorController acceptorController) {
        this.title = title;
        this.aceptorController = acceptorController;
    }

	protected String title;

	protected abstract void execute();

	protected abstract boolean isActive();

	String getTitle() {
		return this.title;
	}

}
