/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flink.sql.sink.oceanbase.table;

import com.dtstack.flink.sql.sink.rdb.table.RdbSinkParser;
import com.dtstack.flink.sql.table.TableInfo;

import java.util.Map;

/**
 * Date: 2020/2/3
 * Company: www.dtstack.com
 * @author xiuzhu
 */

public class OceanbaseSinkParser extends RdbSinkParser {

    private static final String CURR_TYPE = "oceanbase";

    @Override
    public TableInfo getTableInfo(String tableName, String fieldsInfo, Map<String, Object> props) {
        TableInfo oceanBaseTableInfo = super.getTableInfo(tableName, fieldsInfo, props);
        oceanBaseTableInfo.setType(CURR_TYPE);
        return oceanBaseTableInfo;
    }

}
