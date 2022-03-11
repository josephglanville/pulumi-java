// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlPanelState extends io.pulumi.resources.ResourceArgs {

    public static final ControlPanelState Empty = new ControlPanelState();

    /**
     * ARN of the control panel.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * ARN of the cluster in which this control panel will reside.
     * 
     */
    @InputImport(name="clusterArn")
      private final @Nullable Output<String> clusterArn;

    public Output<String> getClusterArn() {
        return this.clusterArn == null ? Output.empty() : this.clusterArn;
    }

    /**
     * Whether a control panel is default.
     * 
     */
    @InputImport(name="defaultControlPanel")
      private final @Nullable Output<Boolean> defaultControlPanel;

    public Output<Boolean> getDefaultControlPanel() {
        return this.defaultControlPanel == null ? Output.empty() : this.defaultControlPanel;
    }

    /**
     * Name describing the control panel.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Number routing controls in a control panel.
     * 
     */
    @InputImport(name="routingControlCount")
      private final @Nullable Output<Integer> routingControlCount;

    public Output<Integer> getRoutingControlCount() {
        return this.routingControlCount == null ? Output.empty() : this.routingControlCount;
    }

    /**
     * Status of control panel: `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public ControlPanelState(
        @Nullable Output<String> arn,
        @Nullable Output<String> clusterArn,
        @Nullable Output<Boolean> defaultControlPanel,
        @Nullable Output<String> name,
        @Nullable Output<Integer> routingControlCount,
        @Nullable Output<String> status) {
        this.arn = arn;
        this.clusterArn = clusterArn;
        this.defaultControlPanel = defaultControlPanel;
        this.name = name;
        this.routingControlCount = routingControlCount;
        this.status = status;
    }

    private ControlPanelState() {
        this.arn = Output.empty();
        this.clusterArn = Output.empty();
        this.defaultControlPanel = Output.empty();
        this.name = Output.empty();
        this.routingControlCount = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlPanelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> clusterArn;
        private @Nullable Output<Boolean> defaultControlPanel;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> routingControlCount;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlPanelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterArn = defaults.clusterArn;
    	      this.defaultControlPanel = defaults.defaultControlPanel;
    	      this.name = defaults.name;
    	      this.routingControlCount = defaults.routingControlCount;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder clusterArn(@Nullable Output<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }

        public Builder clusterArn(@Nullable String clusterArn) {
            this.clusterArn = Output.ofNullable(clusterArn);
            return this;
        }

        public Builder defaultControlPanel(@Nullable Output<Boolean> defaultControlPanel) {
            this.defaultControlPanel = defaultControlPanel;
            return this;
        }

        public Builder defaultControlPanel(@Nullable Boolean defaultControlPanel) {
            this.defaultControlPanel = Output.ofNullable(defaultControlPanel);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder routingControlCount(@Nullable Output<Integer> routingControlCount) {
            this.routingControlCount = routingControlCount;
            return this;
        }

        public Builder routingControlCount(@Nullable Integer routingControlCount) {
            this.routingControlCount = Output.ofNullable(routingControlCount);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public ControlPanelState build() {
            return new ControlPanelState(arn, clusterArn, defaultControlPanel, name, routingControlCount, status);
        }
    }
}
