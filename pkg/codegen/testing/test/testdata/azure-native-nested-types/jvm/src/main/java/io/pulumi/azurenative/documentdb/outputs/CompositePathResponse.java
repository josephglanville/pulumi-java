// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CompositePathResponse {
    /**
     * Sort order for composite paths.
     * 
     */
    private final @Nullable String order;
    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    private final @Nullable String path;

    @CustomType.Constructor
    private CompositePathResponse(
        @CustomType.Parameter("order") @Nullable String order,
        @CustomType.Parameter("path") @Nullable String path) {
        this.order = order;
        this.path = path;
    }

    /**
     * Sort order for composite paths.
     * 
    */
    public Optional<String> getOrder() {
        return Optional.ofNullable(this.order);
    }
    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositePathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String order;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositePathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.order = defaults.order;
    	      this.path = defaults.path;
        }

        public Builder order(@Nullable String order) {
            this.order = order;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }        public CompositePathResponse build() {
            return new CompositePathResponse(order, path);
        }
    }
}
