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
 * BSD 4 license.
 */
public class BSD4License extends FullTextMatchingLicense {
    public static final String FIRST_LICENSE_LINE = "Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:";
    public static final String CLAUSE_1_LICENSE_LINE = "Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.";
    public static final String CLAUSE_2_LICENSE_LINE = "Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.";
    public static final String CLAUSE_3_LICENSE_LINE = "All advertising materials mentioning features or use of this software must display the following acknowledgement: This product includes software developed by the University of California, Berkeley and its contributors.";
    public static final String CLAUSE_4_LICENSE_LINE = "Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.";
    public static final String AS_IS_LICENSE_LINE = "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.";

    private static final Pattern LICENSE_PATTERN = Pattern.compile(new String(
            prune(FIRST_LICENSE_LINE) + "(1)?" + prune(CLAUSE_1_LICENSE_LINE) + "(2)?" + prune(CLAUSE_2_LICENSE_LINE) +
                    "(3)?" + prune(CLAUSE_3_LICENSE_LINE) + "(4)?" + prune(CLAUSE_4_LICENSE_LINE) + prune(AS_IS_LICENSE_LINE)).toLowerCase());

    public BSD4License() {
        super(MetaData.RAT_LICENSE_FAMILY_CATEGORY_DATUM_BSD4, MetaData.RAT_LICENSE_FAMILY_NAME_DATUM_BSD_VERSION_4,
                "", FIRST_LICENSE_LINE + CLAUSE_1_LICENSE_LINE + CLAUSE_2_LICENSE_LINE + CLAUSE_3_LICENSE_LINE + CLAUSE_4_LICENSE_LINE + AS_IS_LICENSE_LINE,
                LICENSE_PATTERN);
    }

}
