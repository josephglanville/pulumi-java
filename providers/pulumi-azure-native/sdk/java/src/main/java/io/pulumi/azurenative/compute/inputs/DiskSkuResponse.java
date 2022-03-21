// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, or StandardSSD_ZRS.
 * 
 */
public final class DiskSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskSkuResponse Empty = new DiskSkuResponse();

    /**
     * The sku name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The sku tier.
     * 
     */
    @Import(name="tier", required=true)
      private final String tier;

    public String getTier() {
        return this.tier;
    }

    public DiskSkuResponse(
        @Nullable String name,
        String tier) {
        this.name = name;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private DiskSkuResponse() {
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public DiskSkuResponse build() {
            return new DiskSkuResponse(name, tier);
        }
    }
}
