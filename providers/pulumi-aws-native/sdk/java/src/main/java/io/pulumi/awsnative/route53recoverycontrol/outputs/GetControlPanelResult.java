// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.awsnative.route53recoverycontrol.enums.ControlPanelStatus;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetControlPanelResult {
    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    private final @Nullable String controlPanelArn;
    /**
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to false.
     * 
     */
    private final @Nullable Boolean defaultControlPanel;
    /**
     * The name of the control panel. You can use any non-white space character in the name.
     * 
     */
    private final @Nullable String name;
    /**
     * Count of associated routing controls
     * 
     */
    private final @Nullable Integer routingControlCount;
    /**
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    private final @Nullable ControlPanelStatus status;

    @CustomType.Constructor
    private GetControlPanelResult(
        @CustomType.Parameter("controlPanelArn") @Nullable String controlPanelArn,
        @CustomType.Parameter("defaultControlPanel") @Nullable Boolean defaultControlPanel,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("routingControlCount") @Nullable Integer routingControlCount,
        @CustomType.Parameter("status") @Nullable ControlPanelStatus status) {
        this.controlPanelArn = controlPanelArn;
        this.defaultControlPanel = defaultControlPanel;
        this.name = name;
        this.routingControlCount = routingControlCount;
        this.status = status;
    }

    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
    */
    public Optional<String> getControlPanelArn() {
        return Optional.ofNullable(this.controlPanelArn);
    }
    /**
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to false.
     * 
    */
    public Optional<Boolean> getDefaultControlPanel() {
        return Optional.ofNullable(this.defaultControlPanel);
    }
    /**
     * The name of the control panel. You can use any non-white space character in the name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Count of associated routing controls
     * 
    */
    public Optional<Integer> getRoutingControlCount() {
        return Optional.ofNullable(this.routingControlCount);
    }
    /**
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
    */
    public Optional<ControlPanelStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlPanelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String controlPanelArn;
        private @Nullable Boolean defaultControlPanel;
        private @Nullable String name;
        private @Nullable Integer routingControlCount;
        private @Nullable ControlPanelStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetControlPanelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.defaultControlPanel = defaults.defaultControlPanel;
    	      this.name = defaults.name;
    	      this.routingControlCount = defaults.routingControlCount;
    	      this.status = defaults.status;
        }

        public Builder controlPanelArn(@Nullable String controlPanelArn) {
            this.controlPanelArn = controlPanelArn;
            return this;
        }
        public Builder defaultControlPanel(@Nullable Boolean defaultControlPanel) {
            this.defaultControlPanel = defaultControlPanel;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder routingControlCount(@Nullable Integer routingControlCount) {
            this.routingControlCount = routingControlCount;
            return this;
        }
        public Builder status(@Nullable ControlPanelStatus status) {
            this.status = status;
            return this;
        }        public GetControlPanelResult build() {
            return new GetControlPanelResult(controlPanelArn, defaultControlPanel, name, routingControlCount, status);
        }
    }
}
