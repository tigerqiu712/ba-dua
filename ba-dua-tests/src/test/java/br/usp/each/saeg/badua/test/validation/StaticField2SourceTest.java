/**
 * Copyright (c) 2014, 2017 University of Sao Paulo and Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Roberto Araujo - initial API and implementation and/or initial documentation
 */
package br.usp.each.saeg.badua.test.validation;

import org.junit.Test;

import br.usp.each.saeg.badua.test.validation.targets.StaticField;

public class StaticField2SourceTest extends ValidationTargetsTest {

    public StaticField2SourceTest() {
        super(StaticField.class);
    }

    @Override
    public final void run(final Class<?> klass) throws Exception {
        klass.getField("running").setBoolean(null, true);
        klass.getMethod("start").invoke(null);
    }

    @Test
    public void verifyCoveredDU() {
        assertTotal(true, 1);
        assertDU(18, 18, 21, "running", true);
    }

    @Test
    public void verifyNotCoveredDU() {
        assertTotal(false, 2);
        assertDU(18, 18, 19, "running", false);
        assertDU(13, 13, "this", false);
    }

}
