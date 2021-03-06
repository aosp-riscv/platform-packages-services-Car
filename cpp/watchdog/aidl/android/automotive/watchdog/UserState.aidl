/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.automotive.watchdog;

/**
 * Used by ICarWatchdog to describe whether user is started or stopped.
 *
 * @deprecated System API specific copy available under android.automotive.watchdog.internal
 * package.
 */
@VintfStability
@Backing(type="int")
enum UserState {
  /**
   * The user is started.
   */
  USER_STATE_STARTED,

  /**
   * The user is stopped.
   */
  USER_STATE_STOPPED,

  /**
   * Number of available user states.
   */
  NUM_USER_STATES,
}
