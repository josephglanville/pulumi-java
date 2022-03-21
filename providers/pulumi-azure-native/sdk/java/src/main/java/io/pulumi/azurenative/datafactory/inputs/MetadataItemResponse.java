// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specify the name and value of custom metadata item.
 * 
 */
public final class MetadataItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataItemResponse Empty = new MetadataItemResponse();

    /**
     * Metadata item key name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="name")
      private final @Nullable Object name;

    public Optional<Object> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Metadata item value. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="value")
      private final @Nullable Object value;

    public Optional<Object> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public MetadataItemResponse(
        @Nullable Object name,
        @Nullable Object value) {
        this.name = name;
        this.value = value;
    }

    private MetadataItemResponse() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object name;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Object name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable Object value) {
            this.value = value;
            return this;
        }        public MetadataItemResponse build() {
            return new MetadataItemResponse(name, value);
        }
    }
}
