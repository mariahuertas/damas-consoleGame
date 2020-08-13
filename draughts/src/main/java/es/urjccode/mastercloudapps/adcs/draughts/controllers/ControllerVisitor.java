package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import java.lang.reflect.InvocationTargetException;

public interface ControllerVisitor {
    void visit(AceptorController aceptorController);
	/*void visit(StartController startController);
	void visit(PlayController playController);
	void visit(ResumeController resumeController);
	void visit(SaveController saveController);*/
}
