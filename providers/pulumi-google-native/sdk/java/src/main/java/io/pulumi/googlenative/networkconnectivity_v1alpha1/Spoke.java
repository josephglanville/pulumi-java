// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.SpokeArgs;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.outputs.RouterApplianceInstanceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Spoke in a given project and location.
 * 
 */
@ResourceType(type="google-native:networkconnectivity/v1alpha1:Spoke")
public class Spoke extends io.pulumi.resources.CustomResource {
    /**
     * The time when the Spoke was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the Spoke was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Short description of the spoke resource
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Short description of the spoke resource
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The resource URL of the hub resource that the spoke is attached to
     * 
     */
    @Export(name="hub", type=String.class, parameters={})
    private Output<String> hub;

    /**
     * @return The resource URL of the hub resource that the spoke is attached to
     * 
     */
    public Output<String> getHub() {
        return this.hub;
    }
    /**
     * User-defined labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User-defined labels.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The URIs of linked interconnect attachment resources
     * 
     */
    @Export(name="linkedInterconnectAttachments", type=List.class, parameters={String.class})
    private Output<List<String>> linkedInterconnectAttachments;

    /**
     * @return The URIs of linked interconnect attachment resources
     * 
     */
    public Output<List<String>> getLinkedInterconnectAttachments() {
        return this.linkedInterconnectAttachments;
    }
    /**
     * The URIs of linked Router appliance resources
     * 
     */
    @Export(name="linkedRouterApplianceInstances", type=List.class, parameters={RouterApplianceInstanceResponse.class})
    private Output<List<RouterApplianceInstanceResponse>> linkedRouterApplianceInstances;

    /**
     * @return The URIs of linked Router appliance resources
     * 
     */
    public Output<List<RouterApplianceInstanceResponse>> getLinkedRouterApplianceInstances() {
        return this.linkedRouterApplianceInstances;
    }
    /**
     * The URIs of linked VPN tunnel resources
     * 
     */
    @Export(name="linkedVpnTunnels", type=List.class, parameters={String.class})
    private Output<List<String>> linkedVpnTunnels;

    /**
     * @return The URIs of linked VPN tunnel resources
     * 
     */
    public Output<List<String>> getLinkedVpnTunnels() {
        return this.linkedVpnTunnels;
    }
    /**
     * Immutable. The name of a Spoke resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The name of a Spoke resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current lifecycle state of this Hub.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current lifecycle state of this Hub.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Google-generated UUID for this resource. This is unique across all Spoke resources. If a Spoke resource is deleted and another with the same name is created, it gets a different unique_id.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Google-generated UUID for this resource. This is unique across all Spoke resources. If a Spoke resource is deleted and another with the same name is created, it gets a different unique_id.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }
    /**
     * The time when the Spoke was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the Spoke was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SpokeArgs.Builder a);
    }
    private static io.pulumi.googlenative.networkconnectivity_v1alpha1.SpokeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.networkconnectivity_v1alpha1.SpokeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Spoke(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Spoke(String name) {
        this(name, SpokeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Spoke(String name, @Nullable SpokeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Spoke(String name, @Nullable SpokeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkconnectivity/v1alpha1:Spoke", name, args == null ? SpokeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Spoke(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkconnectivity/v1alpha1:Spoke", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Spoke get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Spoke(name, id, options);
    }
}
