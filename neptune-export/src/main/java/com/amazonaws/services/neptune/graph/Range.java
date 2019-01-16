/*
Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
Licensed under the Apache License, Version 2.0 (the "License").
You may not use this file except in compliance with the License.
A copy of the License is located at
    http://www.apache.org/licenses/LICENSE-2.0
or in the "license" file accompanying this file. This file is distributed
on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
express or implied. See the License for the specific language governing
permissions and limitations under the License.
*/

package com.amazonaws.services.neptune.graph;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.structure.Element;

public class Range {

    public static final Range ALL = new Range(0, -1);

    private final long start;
    private final long end;

    public Range(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public GraphTraversal<? extends Element, ?> applyRange(GraphTraversal<? extends Element, ?> traversal) {
        if (end == -1) {
            return traversal;
        } else {
            return traversal.range(start, end);
        }
    }

    public long start() {
        return start;
    }

    public long value(){
        return end - start;
    }

    @Override
    public String toString() {
        return "range(" + start + ", " + end + ")";
    }
}
