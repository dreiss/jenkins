package hudson.maven.release.core.tasks;

import org.apache.maven.shared.release.ReleaseManagerListener;
import org.apache.maven.shared.release.config.ReleaseDescriptor;

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

/**
 * @author Edwin Punzalan
 * @version $Id: RollbackReleaseProjectTask.java 751433 2009-03-08 14:41:33Z
 *          ctan $
 */
public class RollbackReleaseProjectTask extends AbstractReleaseProjectTask {
	public RollbackReleaseProjectTask(String releaseId, ReleaseDescriptor descriptor, ReleaseManagerListener listener) {
		super(releaseId, descriptor, listener);
	}
}