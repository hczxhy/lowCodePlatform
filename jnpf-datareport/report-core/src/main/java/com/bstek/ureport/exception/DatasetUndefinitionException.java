/*******************************************************************************
 * Copyright 2017 Bstek
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.bstek.ureport.exception;

/**
 * @author
 * @since 2016年11月1日
 */
public class DatasetUndefinitionException extends ReportException {
	private static final long serialVersionUID = -1897331038232057797L;

	public DatasetUndefinitionException(String datasetName) {
		super("Dataset ["+datasetName+"] not definition.");
	}
}