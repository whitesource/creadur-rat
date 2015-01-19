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
 * License matches Apple Public Source License version 2.0.
 */
public class ApplePublicSourceLicense20 extends FullTextMatchingLicense {
    public static final String FIRST_LICENSE_LINE = "This file contains Original Code and/or Modifications of Original Code as defined in and that are subject to the Apple Public Source License Version 2.0 (the 'License').  You may not use this file except in compliance with the License.  Please obtain a copy of the License at http://www.opensource.apple.com/apsl/ and read it before using this file.";
    public static final String SECOND_LICENSE_LINE = "The Original Code and all software distributed under the License are distributed on an 'AS IS' basis, WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESS OR IMPLIED, AND APPLE HEREBY DISCLAIMS ALL SUCH WARRANTIES, INCLUDING WITHOUT LIMITATION, ANY WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, QUIET ENJOYMENT OR NON-INFRINGEMENT.  Please see the License for the specific language governing rights and limitations under the License.";

    private static final Pattern LICENSE_PATTERN = Pattern.compile(new String(
            prune(FIRST_LICENSE_LINE) + prune(SECOND_LICENSE_LINE)).toLowerCase());

    public ApplePublicSourceLicense20() {
        super(MetaData.RAT_LICENSE_FAMILY_CATEGORY_DATUM_APSL20, MetaData.RAT_LICENSE_FAMILY_NAME_DATUM_APSL_20,
                "", FIRST_LICENSE_LINE + SECOND_LICENSE_LINE, LICENSE_PATTERN);
    }
}