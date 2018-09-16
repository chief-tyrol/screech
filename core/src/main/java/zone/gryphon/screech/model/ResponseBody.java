/*
 * Copyright 2018-2018 Gryphon Zone
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package zone.gryphon.screech.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.nio.ByteBuffer;

@Value
@Builder(toBuilder = true)
public class ResponseBody {

    public static ResponseBody from(@NonNull ByteBuffer buffer, String contentType, String encoding) {
        return ResponseBody.builder()
                .buffer(buffer)
                .contentType(contentType)
                .encoding(encoding)
                .build();
    }

    private final ByteBuffer buffer;

    private final String contentType;

    private final String encoding;

}