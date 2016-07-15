/*
 * Copyright 2015-present wequick.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.tong.fastdex.utils

import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.api.Project

public class FolderComparatorFactory {
    public static FolderComparator createFolderComparator(Project project) {
        if (Os.isFamily(Os.FAMILY_MAC) || Os.isFamily(Os.FAMILY_UNIX)) {
            return new UnixLikeFolderComparator()
        } else if (Os.isFamily(Os.FAMILY_WINDOWS)) {
            //TODO 需要选一种windows下高效的文件差异对比方案

        }
        return null
    }
}
