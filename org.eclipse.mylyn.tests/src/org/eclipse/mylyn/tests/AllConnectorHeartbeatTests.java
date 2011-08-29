/*******************************************************************************
 * Copyright (c) 2010 Tasktop Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylyn.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.mylyn.commons.sdk.util.ManagedTestSuite;

/**
 * @author Steffen Pingel
 */
public class AllConnectorHeartbeatTests {

	public static Test suite() {
		TestSuite suite = new ManagedTestSuite(AllConnectorHeartbeatTests.class.getName());
		AllConnectorTests.addTests(suite, true);
		return suite;
	}

}
