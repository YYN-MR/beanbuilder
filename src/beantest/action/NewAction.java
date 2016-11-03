/*
 * Copyright 10/01/99 Sun Microsystems, Inc. All Rights Reserved
 */

/*
 * @(#)NewAction.java	1.2 99/10/01
 */

package beantest.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * NewAction 
 *
 * @version 1.2 10/01/99
 * @author  Mark Davidson
 */
public class NewAction extends AbstractAction implements BeanActionConstants {

    private BeantestActionManager manager;

    /** 
     * @param manager Delegate that the actionPerformed method.
     */
    public NewAction(BeantestActionManager manager)  {
        this.manager = manager;
        
        putValue(Action.SMALL_ICON, manager.getIcon(CMD_SMALL_ICON_NEW));
        putValue(Action.NAME, CMD_NAME_NEW);
        putValue(Action.SHORT_DESCRIPTION, CMD_SHORT_DESCRIPTION_NEW);
        putValue(Action.LONG_DESCRIPTION, CMD_LONG_DESCRIPTION_NEW);
        putValue(Action.MNEMONIC_KEY, new Integer(CMD_MNEMONIC_NEW));
        putValue(Action.ACTION_COMMAND_KEY, CMD_ACTION_NEW);
    }
    
    public void actionPerformed(ActionEvent evt)  {
        manager.forwardAction(new ActionEvent(evt.getSource(), evt.getID(), 
                                (String)getValue(Action.ACTION_COMMAND_KEY)));
    }
}
