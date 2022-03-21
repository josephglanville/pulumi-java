// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.enums.MonitoringComponentConfigEnableComponentsItem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MonitoringComponentConfig is cluster monitoring component configuration.
 * 
 */
public final class MonitoringComponentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringComponentConfigArgs Empty = new MonitoringComponentConfigArgs();

    /**
     * Select components to collect metrics. An empty set would disable all monitoring.
     * 
     */
    @Import(name="enableComponents")
      private final @Nullable Output<List<MonitoringComponentConfigEnableComponentsItem>> enableComponents;

    public Output<List<MonitoringComponentConfigEnableComponentsItem>> getEnableComponents() {
        return this.enableComponents == null ? Output.empty() : this.enableComponents;
    }

    public MonitoringComponentConfigArgs(@Nullable Output<List<MonitoringComponentConfigEnableComponentsItem>> enableComponents) {
        this.enableComponents = enableComponents;
    }

    private MonitoringComponentConfigArgs() {
        this.enableComponents = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringComponentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MonitoringComponentConfigEnableComponentsItem>> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringComponentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder enableComponents(@Nullable Output<List<MonitoringComponentConfigEnableComponentsItem>> enableComponents) {
            this.enableComponents = enableComponents;
            return this;
        }
        public Builder enableComponents(@Nullable List<MonitoringComponentConfigEnableComponentsItem> enableComponents) {
            this.enableComponents = Output.ofNullable(enableComponents);
            return this;
        }
        public Builder enableComponents(MonitoringComponentConfigEnableComponentsItem... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }        public MonitoringComponentConfigArgs build() {
            return new MonitoringComponentConfigArgs(enableComponents);
        }
    }
}
