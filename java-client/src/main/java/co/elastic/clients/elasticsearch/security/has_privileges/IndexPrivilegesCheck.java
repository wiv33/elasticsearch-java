/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security.has_privileges;

import co.elastic.clients.elasticsearch.security.IndexPrivilege;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges.IndexPrivilegesCheck

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/security/has_privileges/types.ts#L30-L33">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexPrivilegesCheck implements JsonpSerializable {
	private final List<String> names;

	private final List<IndexPrivilege> privileges;

	// ---------------------------------------------------------------------------------------------

	private IndexPrivilegesCheck(Builder builder) {

		this.names = ApiTypeHelper.unmodifiableRequired(builder.names, this, "names");
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");

	}

	public static IndexPrivilegesCheck of(Function<Builder, ObjectBuilder<IndexPrivilegesCheck>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code names}
	 */
	public final List<String> names() {
		return this.names;
	}

	/**
	 * Required - API name: {@code privileges}
	 */
	public final List<IndexPrivilege> privileges() {
		return this.privileges;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.names)) {
			generator.writeKey("names");
			generator.writeStartArray();
			for (String item0 : this.names) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.privileges)) {
			generator.writeKey("privileges");
			generator.writeStartArray();
			for (IndexPrivilege item0 : this.privileges) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexPrivilegesCheck}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexPrivilegesCheck> {
		private List<String> names;

		private List<IndexPrivilege> privileges;

		/**
		 * Required - API name: {@code names}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>names</code>.
		 */
		public final Builder names(List<String> list) {
			this.names = _listAddAll(this.names, list);
			return this;
		}

		/**
		 * Required - API name: {@code names}
		 * <p>
		 * Adds one or more values to <code>names</code>.
		 */
		public final Builder names(String value, String... values) {
			this.names = _listAdd(this.names, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code privileges}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>privileges</code>.
		 */
		public final Builder privileges(List<IndexPrivilege> list) {
			this.privileges = _listAddAll(this.privileges, list);
			return this;
		}

		/**
		 * Required - API name: {@code privileges}
		 * <p>
		 * Adds one or more values to <code>privileges</code>.
		 */
		public final Builder privileges(IndexPrivilege value, IndexPrivilege... values) {
			this.privileges = _listAdd(this.privileges, value, values);
			return this;
		}

		/**
		 * Builds a {@link IndexPrivilegesCheck}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexPrivilegesCheck build() {
			_checkSingleUse();

			return new IndexPrivilegesCheck(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexPrivilegesCheck}
	 */
	public static final JsonpDeserializer<IndexPrivilegesCheck> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexPrivilegesCheck::setupIndexPrivilegesCheckDeserializer);

	protected static void setupIndexPrivilegesCheckDeserializer(ObjectDeserializer<IndexPrivilegesCheck.Builder> op) {

		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(IndexPrivilege._DESERIALIZER), "privileges");

	}

}
