/**
 * Copyright (C) 2011 LShift Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.lshift.accent;

/**
 * Interface implemented by components that wish to be notified of the state of an accent connection.
 */
public interface ConnectionStateListener {
  /**
   * Indicates that the state of the connection has changed.
   * @param sender the connection that had the state change.
   * @param state the new state.
   */
  void connectionStateChanged(AccentConnection sender, ConnectionState state);
}
