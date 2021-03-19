/*
 * Copyright (c) 2016 Vivid Solutions.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.fobermaier.jts;

import java.io.File;

public class TestFiles {

  public static final String getResourceFilePath(String fileName) {
    ClassLoader classLoader = TestFiles.class.getClassLoader();
    return new File(classLoader.getResource("testdata/" + fileName).getFile()).getAbsolutePath();
  }
}
