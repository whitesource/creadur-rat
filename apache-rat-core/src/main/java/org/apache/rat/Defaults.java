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
package org.apache.rat;

import org.apache.rat.analysis.IHeaderMatcher;
import org.apache.rat.analysis.generation.GeneratedLicenseNotRequired;
import org.apache.rat.analysis.generation.JavaDocLicenseNotRequired;
import org.apache.rat.analysis.license.*;
import org.apache.rat.analysis.util.HeaderMatcherMultiplexer;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 * Utility class that holds constants shared by the CLI tool and the Ant tasks.
 */
public class Defaults {
    /** no instances */
    private Defaults() {}

    /**
     * The standard list of licenses to include in the reports.
     */
    public static final List<IHeaderMatcher> DEFAULT_MATCHERS = Collections.unmodifiableList(
            Arrays.asList(new ApacheSoftwareLicense20(),
                    new ApacheLicense20Pattern(),
                    new GPL1License(),
                    new GPL2License(),
                    new GPL3License(),
                    new MITLicense(),
                    new MPL2License(),
                    new PublicDomainLicense(),
                    new MicrosoftLicense(),
                    new EPL1License(),
                    new W3CLicense(),
                    new W3CDocLicense(),
                    new OASISLicense(),
                    new JavaDocLicenseNotRequired(),
                    new GeneratedLicenseNotRequired(),
                    new DojoLicenseHeader(),
                    new TMF854LicenseHeader(),
                    new CDDL1License(),
                    new LGPL21License(),
                    new LGPL3License(),
                    new AGPL3License(),
                    new BSD2License(),
                    new BSD3License(),
                    new BSD4License(),
                    new AFL11License(),
                    new AFL12License(),
                    new AFL20License(),
                    new AFL21License(),
                    new AFL30License(),
                    new ApplePublicSourceLicense20(),
                    new ZlibLicense()
            ));
    
    public static final String PLAIN_STYLESHEET = "org/apache/rat/plain-rat.xsl";
    public static final String UNAPPROVED_LICENSES_STYLESHEET = "org/apache/rat/unapproved-licenses.xsl";

    public static InputStream getPlainStyleSheet() {
        InputStream result = Defaults.class.getClassLoader().getResourceAsStream(Defaults.PLAIN_STYLESHEET);
        return result;
    }
    
    public static InputStream getUnapprovedLicensesStyleSheet() {
        InputStream result = Defaults.class.getClassLoader().getResourceAsStream(Defaults.UNAPPROVED_LICENSES_STYLESHEET);
        return result;
    }

    public static InputStream getDefaultStyleSheet() {
        InputStream result = getPlainStyleSheet();
        return result;
    }
    
    public static IHeaderMatcher createDefaultMatcher() {
        return new HeaderMatcherMultiplexer(Defaults.DEFAULT_MATCHERS);
    }
}
