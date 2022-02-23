// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53recoverycontrol.ControlPanelArgs;
import io.pulumi.awsnative.route53recoverycontrol.enums.ControlPanelStatus;
import io.pulumi.awsnative.route53recoverycontrol.outputs.ControlPanelTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS Route53 Recovery Control Control Panel resource schema .
 * 
 */
@ResourceType(type="aws-native:route53recoverycontrol:ControlPanel")
public class ControlPanel extends io.pulumi.resources.CustomResource {
    /**
     * Cluster to associate with the Control Panel
     * 
     */
    @OutputExport(name="clusterArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterArn;

    /**
     * @return Cluster to associate with the Control Panel
     * 
     */
    public Output</* @Nullable */ String> getClusterArn() {
        return this.clusterArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    @OutputExport(name="controlPanelArn", type=String.class, parameters={})
    private Output<String> controlPanelArn;

    /**
     * @return The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    public Output<String> getControlPanelArn() {
        return this.controlPanelArn;
    }
    /**
     * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to false.
     * 
     */
    @OutputExport(name="defaultControlPanel", type=Boolean.class, parameters={})
    private Output<Boolean> defaultControlPanel;

    /**
     * @return A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to false.
     * 
     */
    public Output<Boolean> getDefaultControlPanel() {
        return this.defaultControlPanel;
    }
    /**
     * The name of the control panel. You can use any non-white space character in the name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the control panel. You can use any non-white space character in the name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Count of associated routing controls
     * 
     */
    @OutputExport(name="routingControlCount", type=Integer.class, parameters={})
    private Output<Integer> routingControlCount;

    /**
     * @return Count of associated routing controls
     * 
     */
    public Output<Integer> getRoutingControlCount() {
        return this.routingControlCount;
    }
    /**
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    @OutputExport(name="status", type=ControlPanelStatus.class, parameters={})
    private Output<ControlPanelStatus> status;

    /**
     * @return The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    public Output<ControlPanelStatus> getStatus() {
        return this.status;
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ControlPanelTag.class})
    private Output</* @Nullable */ List<ControlPanelTag>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Output</* @Nullable */ List<ControlPanelTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ControlPanel(String name) {
        this(name, ControlPanelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ControlPanel(String name, @Nullable ControlPanelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ControlPanel(String name, @Nullable ControlPanelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoverycontrol:ControlPanel", name, args == null ? ControlPanelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ControlPanel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoverycontrol:ControlPanel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ControlPanel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ControlPanel(name, id, options);
    }
}
