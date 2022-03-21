// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.VMResourcesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListSubAccountVMHostsResult {
    /**
     * Link to the next set of results, if any.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Response of a list vm host update operation.
     * 
     */
    private final @Nullable List<VMResourcesResponse> value;

    @CustomType.Constructor
    private ListSubAccountVMHostsResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<VMResourcesResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to the next set of results, if any.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * Response of a list vm host update operation.
     * 
    */
    public List<VMResourcesResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSubAccountVMHostsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<VMResourcesResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSubAccountVMHostsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(@Nullable List<VMResourcesResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(VMResourcesResponse... value) {
            return value(List.of(value));
        }        public ListSubAccountVMHostsResult build() {
            return new ListSubAccountVMHostsResult(nextLink, value);
        }
    }
}
