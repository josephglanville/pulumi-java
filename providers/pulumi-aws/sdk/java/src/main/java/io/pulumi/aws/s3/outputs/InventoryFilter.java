// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryFilter {
    /**
     * The prefix that an object must have to be included in the inventory results.
     * 
     */
    private final @Nullable String prefix;

    @CustomType.Constructor
    private InventoryFilter(@CustomType.Parameter("prefix") @Nullable String prefix) {
        this.prefix = prefix;
    }

    /**
     * The prefix that an object must have to be included in the inventory results.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }        public InventoryFilter build() {
            return new InventoryFilter(prefix);
        }
    }
}
