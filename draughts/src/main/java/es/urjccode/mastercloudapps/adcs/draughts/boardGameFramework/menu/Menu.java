package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.ClosedInterval;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.IO;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Set;

public abstract class Menu {

    private static final String OPTION = "Choose an option: ";
    private ArrayList<Command> commandList;

    public Menu(AceptorController aceptorController) {
        this.commandList = new ArrayList<Command>();

        Reflections reflections = new Reflections("es.urjccode.mastercloudapps.adcs");
        Set<Class<?>> commands = reflections.getTypesAnnotatedWith(MenuCommand.class);
        try {
            for (Class<?> command : commands) {
                MenuCommand annotation = command.getAnnotation(MenuCommand.class);
                if(annotation.value() == this.getClass()) {
                    Constructor constructor = command.getConstructor(AceptorController.class);
                    Command commandInstance = (Command) constructor.newInstance(aceptorController);
                    this.commandList.add(commandInstance);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void execute() {
        ArrayList<Command> commands = new ArrayList<Command>();
        for (int i = 0; i < this.commandList.size(); i++) {
            if (this.commandList.get(i).isActive()) {
                commands.add(this.commandList.get(i));
            }
        }
        boolean error;
        int option;
        do {
            error = false;
            for (int i = 0; i < commands.size(); i++) {
                IO.writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            IO.write(OPTION);
            option = IO.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
            IO.writeln();
        } while (error);
        commands.get(option).execute();
    }

    protected void addCommand(Command command) {
        this.commandList.add(command);
    }

}
