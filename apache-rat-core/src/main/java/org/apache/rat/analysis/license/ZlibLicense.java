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
 * zlib license.
 */
public class ZlibLicense extends FullTextMatchingLicense {
    public static final String AS_IS_LICENSE_LINE = "This software is provided 'as-is', without any express or implied warranty.  In no event will the authors be held liable for any damages arising from the use of this software.";
    public static final String FIRST_LICENSE_LINE = "Permission is granted to anyone to use this software for any purpose, including commercial applications, and to alter it and redistribute it freely, subject to the following restrictions:";
    public static final String CLAUSE_1_LICENSE_LINE = "The origin of this software must not be misrepresented; you must not claim that you wrote the original software. If you use this software in a product, an acknowledgment in the product documentation would be appreciated but is not required.";
    public static final String CLAUSE_2_LICENSE_LINE = "Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.";
    public static final String CLAUSE_3_LICENSE_LINE = "This notice may not be removed or altered from any source distribution.";

    private static final Pattern LICENSE_PATTERN = Pattern.compile(new String(
            prune(AS_IS_LICENSE_LINE) + prune(FIRST_LICENSE_LINE) + "(1)?" + prune(CLAUSE_1_LICENSE_LINE) +
                    "(2)?" + prune(CLAUSE_2_LICENSE_LINE) + "(3)?" + prune(CLAUSE_3_LICENSE_LINE)).toLowerCase());

    public ZlibLicense() {
        super(MetaData.RAT_LICENSE_FAMILY_CATEGORY_DATUM_ZLIB, MetaData.RAT_LICENSE_FAMILY_NAME_DATUM_ZLIB,
                "", AS_IS_LICENSE_LINE + FIRST_LICENSE_LINE + CLAUSE_1_LICENSE_LINE + CLAUSE_2_LICENSE_LINE + CLAUSE_3_LICENSE_LINE,
                LICENSE_PATTERN);
    }

}
