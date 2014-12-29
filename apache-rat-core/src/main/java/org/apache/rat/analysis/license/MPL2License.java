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
 * Base MPL 2.0 - Mozilla Public License.
 */
public class MPL2License extends FullTextMatchingLicense {
    public static final String LICENSE_TEXT = "This Source Code Form is subject to the terms of the Mozilla Public " +
            "License, v. 2.0. If a copy of the MPL was not distributed with this " +
            "file, You can obtain one at http://mozilla.org/MPL/2.0/.";

    public MPL2License() {
        super(MetaData.RAT_LICENSE_FAMILY_CATEGORY_DATUM_MPL2, MetaData.RAT_LICENSE_FAMILY_NAME_DATUM_MPL2, "", LICENSE_TEXT);
    }
}
