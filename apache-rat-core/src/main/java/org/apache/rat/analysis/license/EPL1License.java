/*
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 */ 
package org.apache.rat.analysis.license;

import org.apache.rat.api.MetaData;

/**
 * Base Eclipse Public License v1.0.
 */
public class EPL1License extends FullTextMatchingLicense {

    public static final String LICENSE_TEXT = "All rights reserved. This program and the accompanying materials " +
            "are made available under the terms of the Eclipse Public License v1.0 " +
            "which accompanies this distribution, and is available at " +
            "http://www.eclipse.org/legal/epl-v10.html";

    public EPL1License() {
        super(MetaData.RAT_LICENSE_FAMILY_CATEGORY_DATUM_EPL1,
                MetaData.RAT_LICENSE_FAMILY_NAME_DATUM_EPL1, "", LICENSE_TEXT);
    }
}