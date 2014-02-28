/**
 * Copyright © Microsoft Open Technologies, Inc.
 *
 * All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * THIS CODE IS PROVIDED *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION
 * ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A
 * PARTICULAR PURPOSE, MERCHANTABILITY OR NON-INFRINGEMENT.
 *
 * See the Apache License, Version 2.0 for the specific language
 * governing permissions and limitations under the License.
 */
package com.msopentech.odatajclient.engine.uri.filter;

abstract class AbstractComparingFilter implements ODataFilter {

    private final ODataFilterArg left;

    private final ODataFilterArg right;

    AbstractComparingFilter(final ODataFilterArg left, final ODataFilterArg right) {
        this.left = left;
        this.right = right;
    }

    protected abstract String getOp();

    @Override
    public String build() {
        return new StringBuilder().
                append('(').append(left.build()).
                append(' ').append(getOp()).append(' ').
                append(right.build()).append(')').
                toString();
    }
}