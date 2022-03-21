// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1.enums.MaintenanceExclusionOptionsScope;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the Maintenance exclusion option.
 * 
 */
public final class MaintenanceExclusionOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceExclusionOptionsArgs Empty = new MaintenanceExclusionOptionsArgs();

    /**
     * Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<MaintenanceExclusionOptionsScope> scope;

    public Output<MaintenanceExclusionOptionsScope> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    public MaintenanceExclusionOptionsArgs(@Nullable Output<MaintenanceExclusionOptionsScope> scope) {
        this.scope = scope;
    }

    private MaintenanceExclusionOptionsArgs() {
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceExclusionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MaintenanceExclusionOptionsScope> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceExclusionOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
        }

        public Builder scope(@Nullable Output<MaintenanceExclusionOptionsScope> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable MaintenanceExclusionOptionsScope scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }        public MaintenanceExclusionOptionsArgs build() {
            return new MaintenanceExclusionOptionsArgs(scope);
        }
    }
}
