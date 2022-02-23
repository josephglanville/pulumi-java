// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The data stored in Parquet format.
 * 
 */
public final class ParquetFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParquetFormatArgs Empty = new ParquetFormatArgs();

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="deserializer")
      private final @Nullable Input<Object> deserializer;

    public Input<Object> getDeserializer() {
        return this.deserializer == null ? Input.empty() : this.deserializer;
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="serializer")
      private final @Nullable Input<Object> serializer;

    public Input<Object> getSerializer() {
        return this.serializer == null ? Input.empty() : this.serializer;
    }

    /**
     * Type of dataset storage format.
     * Expected value is 'ParquetFormat'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ParquetFormatArgs(
        @Nullable Input<Object> deserializer,
        @Nullable Input<Object> serializer,
        Input<String> type) {
        this.deserializer = deserializer;
        this.serializer = serializer;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ParquetFormatArgs() {
        this.deserializer = Input.empty();
        this.serializer = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> deserializer;
        private @Nullable Input<Object> serializer;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder setDeserializer(@Nullable Input<Object> deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setDeserializer(@Nullable Object deserializer) {
            this.deserializer = Input.ofNullable(deserializer);
            return this;
        }

        public Builder setSerializer(@Nullable Input<Object> serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder setSerializer(@Nullable Object serializer) {
            this.serializer = Input.ofNullable(serializer);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ParquetFormatArgs build() {
            return new ParquetFormatArgs(deserializer, serializer, type);
        }
    }
}
