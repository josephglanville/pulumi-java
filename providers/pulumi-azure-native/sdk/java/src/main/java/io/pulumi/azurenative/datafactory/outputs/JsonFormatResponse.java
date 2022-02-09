// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JsonFormatResponse {
    private final @Nullable Object deserializer;
    private final @Nullable Object encodingName;
    private final @Nullable Object filePattern;
    private final @Nullable Object jsonNodeReference;
    private final @Nullable Object jsonPathDefinition;
    private final @Nullable Object nestingSeparator;
    private final @Nullable Object serializer;
    private final String type;

    @OutputCustomType.Constructor({"deserializer","encodingName","filePattern","jsonNodeReference","jsonPathDefinition","nestingSeparator","serializer","type"})
    private JsonFormatResponse(
        @Nullable Object deserializer,
        @Nullable Object encodingName,
        @Nullable Object filePattern,
        @Nullable Object jsonNodeReference,
        @Nullable Object jsonPathDefinition,
        @Nullable Object nestingSeparator,
        @Nullable Object serializer,
        String type) {
        this.deserializer = deserializer;
        this.encodingName = encodingName;
        this.filePattern = filePattern;
        this.jsonNodeReference = jsonNodeReference;
        this.jsonPathDefinition = jsonPathDefinition;
        this.nestingSeparator = nestingSeparator;
        this.serializer = serializer;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getDeserializer() {
        return Optional.ofNullable(this.deserializer);
    }
    public Optional<Object> getEncodingName() {
        return Optional.ofNullable(this.encodingName);
    }
    public Optional<Object> getFilePattern() {
        return Optional.ofNullable(this.filePattern);
    }
    public Optional<Object> getJsonNodeReference() {
        return Optional.ofNullable(this.jsonNodeReference);
    }
    public Optional<Object> getJsonPathDefinition() {
        return Optional.ofNullable(this.jsonPathDefinition);
    }
    public Optional<Object> getNestingSeparator() {
        return Optional.ofNullable(this.nestingSeparator);
    }
    public Optional<Object> getSerializer() {
        return Optional.ofNullable(this.serializer);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deserializer;
        private @Nullable Object encodingName;
        private @Nullable Object filePattern;
        private @Nullable Object jsonNodeReference;
        private @Nullable Object jsonPathDefinition;
        private @Nullable Object nestingSeparator;
        private @Nullable Object serializer;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.encodingName = defaults.encodingName;
    	      this.filePattern = defaults.filePattern;
    	      this.jsonNodeReference = defaults.jsonNodeReference;
    	      this.jsonPathDefinition = defaults.jsonPathDefinition;
    	      this.nestingSeparator = defaults.nestingSeparator;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder setDeserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setEncodingName(@Nullable Object encodingName) {
            this.encodingName = encodingName;
            return this;
        }

        public Builder setFilePattern(@Nullable Object filePattern) {
            this.filePattern = filePattern;
            return this;
        }

        public Builder setJsonNodeReference(@Nullable Object jsonNodeReference) {
            this.jsonNodeReference = jsonNodeReference;
            return this;
        }

        public Builder setJsonPathDefinition(@Nullable Object jsonPathDefinition) {
            this.jsonPathDefinition = jsonPathDefinition;
            return this;
        }

        public Builder setNestingSeparator(@Nullable Object nestingSeparator) {
            this.nestingSeparator = nestingSeparator;
            return this;
        }

        public Builder setSerializer(@Nullable Object serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public JsonFormatResponse build() {
            return new JsonFormatResponse(deserializer, encodingName, filePattern, jsonNodeReference, jsonPathDefinition, nestingSeparator, serializer, type);
        }
    }
}
