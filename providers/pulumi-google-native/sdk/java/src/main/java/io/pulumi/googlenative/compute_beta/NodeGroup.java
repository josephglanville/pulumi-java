// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.NodeGroupArgs;
import io.pulumi.googlenative.compute_beta.outputs.NodeGroupAutoscalingPolicyResponse;
import io.pulumi.googlenative.compute_beta.outputs.NodeGroupMaintenanceWindowResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a NodeGroup resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:NodeGroup")
public class NodeGroup extends io.pulumi.resources.CustomResource {
    /**
     * Specifies how autoscaling should behave.
     * 
     */
    @OutputExport(name="autoscalingPolicy", type=NodeGroupAutoscalingPolicyResponse.class, parameters={})
    private Output<NodeGroupAutoscalingPolicyResponse> autoscalingPolicy;

    /**
     * @return Specifies how autoscaling should behave.
     * 
     */
    public Output<NodeGroupAutoscalingPolicyResponse> getAutoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The type of the resource. Always compute#nodeGroup for node group.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The type of the resource. Always compute#nodeGroup for node group.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    @OutputExport(name="locationHint", type=String.class, parameters={})
    private Output<String> locationHint;

    /**
     * @return An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    public Output<String> getLocationHint() {
        return this.locationHint;
    }
    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    @OutputExport(name="maintenancePolicy", type=String.class, parameters={})
    private Output<String> maintenancePolicy;

    /**
     * @return Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    public Output<String> getMaintenancePolicy() {
        return this.maintenancePolicy;
    }
    @OutputExport(name="maintenanceWindow", type=NodeGroupMaintenanceWindowResponse.class, parameters={})
    private Output<NodeGroupMaintenanceWindowResponse> maintenanceWindow;

    public Output<NodeGroupMaintenanceWindowResponse> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * URL of the node template to create the node group from.
     * 
     */
    @OutputExport(name="nodeTemplate", type=String.class, parameters={})
    private Output<String> nodeTemplate;

    /**
     * @return URL of the node template to create the node group from.
     * 
     */
    public Output<String> getNodeTemplate() {
        return this.nodeTemplate;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The total number of nodes in the node group.
     * 
     */
    @OutputExport(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return The total number of nodes in the node group.
     * 
     */
    public Output<Integer> getSize() {
        return this.size;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The name of the zone where the node group resides, such as us-central1-a.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The name of the zone where the node group resides, such as us-central1-a.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeGroup(String name) {
        this(name, NodeGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeGroup(String name, NodeGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeGroup(String name, NodeGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:NodeGroup", name, args == null ? NodeGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NodeGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:NodeGroup", name, null, makeResourceOptions(options, id));
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
    public static NodeGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodeGroup(name, id, options);
    }
}
