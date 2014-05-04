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
package org.apache.olingo.client.core.edm.xml.v4;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

import org.apache.olingo.client.api.edm.xml.v4.NavigationPropertyBinding;
import org.apache.olingo.client.api.edm.xml.v4.Singleton;

@JsonDeserialize(using = SingletonDeserializer.class)
public class SingletonImpl extends AbstractAnnotatable implements Singleton {

  private static final long serialVersionUID = 941802518279658559L;

  private String name;

  private String entityType;

  private final List<NavigationPropertyBinding> navigationPropertyBindings = new ArrayList<NavigationPropertyBinding>();

  @Override
  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(final String entityType) {
    this.entityType = entityType;
  }

  @Override
  public List<NavigationPropertyBinding> getNavigationPropertyBindings() {
    return navigationPropertyBindings;
  }

}
