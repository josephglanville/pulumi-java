// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SchemaVersionMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaVersionMetadataArgs Empty = new SchemaVersionMetadataArgs();

    /**
     * Metadata key
     * 
     */
    @InputImport(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Represents the version ID associated with the schema version.
     * 
     */
    @InputImport(name="schemaVersionId", required=true)
      private final Output<String> schemaVersionId;

    public Output<String> getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * Metadata value
     * 
     */
    @InputImport(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public SchemaVersionMetadataArgs(
        Output<String> key,
        Output<String> schemaVersionId,
        Output<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.schemaVersionId = Objects.requireNonNull(schemaVersionId, "expected parameter 'schemaVersionId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SchemaVersionMetadataArgs() {
        this.key = Output.empty();
        this.schemaVersionId = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaVersionMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<String> schemaVersionId;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaVersionMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.schemaVersionId = defaults.schemaVersionId;
    	      this.value = defaults.value;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder schemaVersionId(Output<String> schemaVersionId) {
            this.schemaVersionId = Objects.requireNonNull(schemaVersionId);
            return this;
        }

        public Builder schemaVersionId(String schemaVersionId) {
            this.schemaVersionId = Output.of(Objects.requireNonNull(schemaVersionId));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public SchemaVersionMetadataArgs build() {
            return new SchemaVersionMetadataArgs(key, schemaVersionId, value);
        }
    }
}
