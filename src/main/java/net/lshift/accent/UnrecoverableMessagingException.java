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
 * Exception indicating that an unrecoverable messaging exception has occurred, and that Accent is unable to ensure
 * the operation will complete.
 */
public class UnrecoverableMessagingException extends RuntimeException {
  public UnrecoverableMessagingException(Throwable cause) {
    super(cause);
  }
}
