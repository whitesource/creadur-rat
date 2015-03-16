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

import java.util.regex.Pattern;

/**
 * Matches Apache License, Version 2.0 by pattern.
 *
 */
public class ApacheLicense20Pattern extends FullTextMatchingLicense {
    public static final String FIRST_LICENSE_LINE = "Licensed under the Apache License, Version 2.0 (the \"License\")";
    public static final String LICENSE_REFERENCE_LINE = "http://www.apache.org/licenses/LICENSE-2.0";

    public static final Pattern LICENSE_PATTERN = Pattern.compile(new String(
            prune(FIRST_LICENSE_LINE) + ".*" + "(" + prune(LICENSE_REFERENCE_LINE) + ")?").toLowerCase());

    public ApacheLicense20Pattern() {
        super(MetaData.RAT_LICENSE_FAMILY_CATEGORY_DATUM_ASL, MetaData.RAT_LICENSE_FAMILY_NAME_DATUM_APACHE_LICENSE_VERSION_2_0,
                "", FIRST_LICENSE_LINE, LICENSE_PATTERN);
    }
}
