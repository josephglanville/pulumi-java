// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for upgrading an agentpool
 * 
 */
public final class AgentPoolUpgradeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentPoolUpgradeSettingsArgs Empty = new AgentPoolUpgradeSettingsArgs();

    /**
     * Count or percentage of additional nodes to be added during upgrade. If empty uses AKS default
     * 
     */
    @InputImport(name="maxSurge")
      private final @Nullable Input<String> maxSurge;

    public Input<String> getMaxSurge() {
        return this.maxSurge == null ? Input.empty() : this.maxSurge;
    }

    public AgentPoolUpgradeSettingsArgs(@Nullable Input<String> maxSurge) {
        this.maxSurge = maxSurge;
    }

    private AgentPoolUpgradeSettingsArgs() {
        this.maxSurge = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentPoolUpgradeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> maxSurge;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentPoolUpgradeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
        }

        public Builder setMaxSurge(@Nullable Input<String> maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        public Builder setMaxSurge(@Nullable String maxSurge) {
            this.maxSurge = Input.ofNullable(maxSurge);
            return this;
        }
        public AgentPoolUpgradeSettingsArgs build() {
            return new AgentPoolUpgradeSettingsArgs(maxSurge);
        }
    }
}
