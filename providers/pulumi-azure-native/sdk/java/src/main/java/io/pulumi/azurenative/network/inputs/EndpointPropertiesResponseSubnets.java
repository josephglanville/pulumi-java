// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subnet first address, scope, and/or last address.
 * 
 */
public final class EndpointPropertiesResponseSubnets extends io.pulumi.resources.InvokeArgs {

    public static final EndpointPropertiesResponseSubnets Empty = new EndpointPropertiesResponseSubnets();

    /**
     * First address in the subnet.
     * 
     */
    @InputImport(name="first")
      private final @Nullable String first;

    public Optional<String> getFirst() {
        return this.first == null ? Optional.empty() : Optional.ofNullable(this.first);
    }

    /**
     * Last address in the subnet.
     * 
     */
    @InputImport(name="last")
      private final @Nullable String last;

    public Optional<String> getLast() {
        return this.last == null ? Optional.empty() : Optional.ofNullable(this.last);
    }

    /**
     * Block size (number of leading bits in the subnet mask).
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Integer scope;

    public Optional<Integer> getScope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    public EndpointPropertiesResponseSubnets(
        @Nullable String first,
        @Nullable String last,
        @Nullable Integer scope) {
        this.first = first;
        this.last = last;
        this.scope = scope;
    }

    private EndpointPropertiesResponseSubnets() {
        this.first = null;
        this.last = null;
        this.scope = null;
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

        public Builder setFirst(@Nullable String first) {
            this.first = first;
            return this;
        }

        public Builder setLast(@Nullable String last) {
            this.last = last;
            return this;
        }

        public Builder setScope(@Nullable Integer scope) {
            this.scope = scope;
            return this;
        }
        public EndpointPropertiesResponseSubnets build() {
            return new EndpointPropertiesResponseSubnets(first, last, scope);
        }
    }
}
