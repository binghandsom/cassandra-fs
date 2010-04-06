/**
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

package org.apache.cassandra.concurrent;

import java.util.HashMap;
import java.util.Map;

/**
 * Context object adding a collection of key/value pairs into ThreadLocalContext.
 */

public class Context
{
    private Map<Object, Object> ht_;
    
    public Context()
    {
        ht_ = new HashMap<Object, Object>();
    }
    
    public Object put(Object key, Object value)
    {
        return ht_.put(key, value);
    }
    
    public Object get(Object key)
    {
        return ht_.get(key);
    }
    
    public void remove(Object key)
    {
        ht_.remove(key);
    }
}
