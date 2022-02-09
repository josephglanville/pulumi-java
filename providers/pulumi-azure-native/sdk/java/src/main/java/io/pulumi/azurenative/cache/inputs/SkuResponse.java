// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    @InputImport(name="capacity", required=true)
    private final Integer capacity;

    public Integer getCapacity() {
        return this.capacity;
    }

    @InputImport(name="family", required=true)
    private final String family;

    public String getFamily() {
        return this.family;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public SkuResponse(
        Integer capacity,
        String family,
        String name) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuResponse() {
        this.capacity = null;
        this.family = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String family;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setFamily(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public SkuResponse build() {
            return new SkuResponse(capacity, family, name);
        }
    }
}
