// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointPropertiesResponseSubnets {
    /**
     * First address in the subnet.
     * 
     */
    private final @Nullable String first;
    /**
     * Last address in the subnet.
     * 
     */
    private final @Nullable String last;
    /**
     * Block size (number of leading bits in the subnet mask).
     * 
     */
    private final @Nullable Integer scope;

    @CustomType.Constructor
    private EndpointPropertiesResponseSubnets(
        @CustomType.Parameter("first") @Nullable String first,
        @CustomType.Parameter("last") @Nullable String last,
        @CustomType.Parameter("scope") @Nullable Integer scope) {
        this.first = first;
        this.last = last;
        this.scope = scope;
    }

    /**
     * First address in the subnet.
     * 
    */
    public Optional<String> getFirst() {
        return Optional.ofNullable(this.first);
    }
    /**
     * Last address in the subnet.
     * 
    */
    public Optional<String> getLast() {
        return Optional.ofNullable(this.last);
    }
    /**
     * Block size (number of leading bits in the subnet mask).
     * 
    */
    public Optional<Integer> getScope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesResponseSubnets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String first;
        private @Nullable String last;
        private @Nullable Integer scope;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesResponseSubnets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.first = defaults.first;
    	      this.last = defaults.last;
    	      this.scope = defaults.scope;
        }

        public Builder first(@Nullable String first) {
            this.first = first;
            return this;
        }
        public Builder last(@Nullable String last) {
            this.last = last;
            return this;
        }
        public Builder scope(@Nullable Integer scope) {
            this.scope = scope;
            return this;
        }        public EndpointPropertiesResponseSubnets build() {
            return new EndpointPropertiesResponseSubnets(first, last, scope);
        }
    }
}
