/**
 * Copyright (c) 2014, 2018 University of Sao Paulo and Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Roberto Araujo - initial API and implementation and/or initial documentation
 */
package br.usp.each.saeg.badua.agent.rt.internal;

import br.usp.each.saeg.badua.core.runtime.RuntimeData;

public final class RT {

    private static RuntimeData DATA;

    private RT() {
        // No instances
    }

    public static void init() {
        init(Agent.getInstance().getData());
    }

    public static void init(final RuntimeData data) {
        DATA = data;
    }

    public static long[] getData(final long classId, final String className, final int size) {
        return DATA.getExecutionData(classId, className, size).getData();
    }

}
