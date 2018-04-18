package hu.bme.mit.mdsd.m2m2c.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;
import hu.bme.mit.mdsd.m2m2c.ErdToRdbLiveTransformation;

public class TransformHandler extends AbstractHandler implements IHandler {

	ErdToRdbLiveTransformation transformation;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);

        Object object = (EntityRelationDiagram) selection.getFirstElement();

        if(object instanceof EntityRelationDiagram) {
        	EntityRelationDiagram erd = (EntityRelationDiagram) object;
        	transformation = ErdToRdbLiveTransformation.getInstance();
        	transformation.prepare(erd);
        	transformation.execute();
        } else {
        	System.out.println("That was NOT an ERD");
        }

        return null;
    }
}
