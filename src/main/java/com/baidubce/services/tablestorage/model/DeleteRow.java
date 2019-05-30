/*
 * Copyright (c) 2019 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.baidubce.services.tablestorage.model;

/**
 * Performs DeleteRow operation on a single row.
 */
public class DeleteRow extends TableStorageRow {
    /**
     * Constructs a delete row object with rowkey.
     *
     * @param rowkey
     */
    public DeleteRow(String rowkey) {
        super(rowkey);
    }

    /**
     * Add a cell with column name to delete row
     *
     * @param name The column name of this cell.
     * @return This delete row object.
     */
    public DeleteRow addCell(String name) {
        TableStorageCell cell = new TableStorageCell(CellType.DeleteCell, name);
        cells.add(cell);
        rowSize += cell.getSize();
        return this;
    }
}