/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/

package net.xmind.signin;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Frank Shaka
 * 
 */
public interface ISignInDialogExtension2 {

    /**
     * 
     * @param dialog
     * @param buttonBar
     * @param buttonCreator
     */
    void contributeToButtonBar(Dialog dialog, Composite buttonBar,
            IButtonCreator buttonCreator);

    void handleButtonPressed(Dialog dialog, int buttonId);

}
