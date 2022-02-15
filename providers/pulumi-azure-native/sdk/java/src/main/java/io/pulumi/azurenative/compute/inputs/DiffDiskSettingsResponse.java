// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiffDiskSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiffDiskSettingsResponse Empty = new DiffDiskSettingsResponse();

    @InputImport(name="option")
    private final @Nullable String option;

    public Optional<String> getOption() {
        return this.option == null ? Optional.empty() : Optional.ofNullable(this.option);
    }

    @InputImport(name="placement")
    private final @Nullable String placement;

    public Optional<String> getPlacement() {
        return this.placement == null ? Optional.empty() : Optional.ofNullable(this.placement);
    }

    public DiffDiskSettingsResponse(
        @Nullable String option,
        @Nullable String placement) {
        this.option = option;
        this.placement = placement;
    }

    private DiffDiskSettingsResponse() {
        this.option = null;
        this.placement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiffDiskSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String option;
        private @Nullable String placement;

        public Builder() {
    	      // Empty
        }

        public Builder(DiffDiskSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.option = defaults.option;
    	      this.placement = defaults.placement;
        }

        public Builder setOption(@Nullable String option) {
            this.option = option;
            return this;
        }

        public Builder setPlacement(@Nullable String placement) {
            this.placement = placement;
            return this;
        }

        public DiffDiskSettingsResponse build() {
            return new DiffDiskSettingsResponse(option, placement);
        }
    }
}