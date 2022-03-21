// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResourceSetDescriptionResponse {
    /**
     * The elements included in the set.
     * 
     */
    private final @Nullable List<String> elements;
    /**
     * The elements that are not included in the set, in case elements contains '*' indicating 'all'.
     * 
     */
    private final @Nullable List<String> exceptions;

    @CustomType.Constructor
    private ResourceSetDescriptionResponse(
        @CustomType.Parameter("elements") @Nullable List<String> elements,
        @CustomType.Parameter("exceptions") @Nullable List<String> exceptions) {
        this.elements = elements;
        this.exceptions = exceptions;
    }

    /**
     * The elements included in the set.
     * 
    */
    public List<String> getElements() {
        return this.elements == null ? List.of() : this.elements;
    }
    /**
     * The elements that are not included in the set, in case elements contains '*' indicating 'all'.
     * 
    */
    public List<String> getExceptions() {
        return this.exceptions == null ? List.of() : this.exceptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> elements;
        private @Nullable List<String> exceptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elements = defaults.elements;
    	      this.exceptions = defaults.exceptions;
        }

        public Builder elements(@Nullable List<String> elements) {
            this.elements = elements;
            return this;
        }
        public Builder elements(String... elements) {
            return elements(List.of(elements));
        }
        public Builder exceptions(@Nullable List<String> exceptions) {
            this.exceptions = exceptions;
            return this;
        }
        public Builder exceptions(String... exceptions) {
            return exceptions(List.of(exceptions));
        }        public ResourceSetDescriptionResponse build() {
            return new ResourceSetDescriptionResponse(elements, exceptions);
        }
    }
}
