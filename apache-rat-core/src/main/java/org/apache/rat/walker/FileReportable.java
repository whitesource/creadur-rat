package org.apache.rat.walker;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.rat.api.Document;
import org.apache.rat.api.MetaData;
import org.apache.rat.api.RatException;
import org.apache.rat.document.impl.DocumentImplUtils;
import org.apache.rat.report.IReportable;
import org.apache.rat.report.RatReport;

import java.io.*;


/**
 * Implementation of IReportable that scans a single file.
 */
public class FileReportable implements IReportable {

    /* --- Members --- */

    private final File file;

    /* --- Constructors --- */

    public FileReportable(File file) throws IOException {
        final File currentDir = new File( System.getProperty("user.dir") ).getCanonicalFile();
        this.file = file.getCanonicalFile();
    }

    /* --- Overridden methods --- */

    public void run(RatReport report) throws RatException {
        FileDocument document = new FileDocument();
        document.setFile(file);
        document.getMetaData().clear();
        report.report(document);
    }

    /* --- Nested classes --- */

    private class FileDocument implements Document {

        /* --- Members --- */

        private File file;
        private final MetaData metaData = new MetaData();

        /* --- Private methods --- */

        private void setFile(File file) {
            this.file = file;
        }

        /* --- Public methods --- */

        public boolean isComposite() {
            return DocumentImplUtils.isZip(file);
        }

        public Reader reader() throws IOException
        {
            final InputStream in = new FileInputStream( file );
            return new InputStreamReader( in );
        }

        public String getName()
        {
            return DocumentImplUtils.toName(file);
        }

        public MetaData getMetaData() {
            return metaData;
        }

        public InputStream inputStream() throws IOException {
            return new FileInputStream(file);
        }

        /* --- Overridden methods --- */

        @Override
        public String toString() {
            return "File:" + file.getAbsolutePath();
        }
    }
}
