// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.NetworkEndpointGroupArgs;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupAppEngineResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudFunctionResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudRunResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupServerlessDeploymentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a network endpoint group in the specified project using the parameters that are included in the request.
 * 
 */
@ResourceType(type="google-native:compute/alpha:NetworkEndpointGroup")
public class NetworkEndpointGroup extends io.pulumi.resources.CustomResource {
    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    @OutputExport(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return Metadata defined as annotations on the network endpoint group.
     * 
     */
    public Output<Map<String,String>> getAnnotations() {
        return this.annotations;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @OutputExport(name="appEngine", type=NetworkEndpointGroupAppEngineResponse.class, parameters={})
    private Output<NetworkEndpointGroupAppEngineResponse> appEngine;

    /**
     * @return Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Output<NetworkEndpointGroupAppEngineResponse> getAppEngine() {
        return this.appEngine;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @OutputExport(name="cloudFunction", type=NetworkEndpointGroupCloudFunctionResponse.class, parameters={})
    private Output<NetworkEndpointGroupCloudFunctionResponse> cloudFunction;

    /**
     * @return Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Output<NetworkEndpointGroupCloudFunctionResponse> getCloudFunction() {
        return this.cloudFunction;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @OutputExport(name="cloudRun", type=NetworkEndpointGroupCloudRunResponse.class, parameters={})
    private Output<NetworkEndpointGroupCloudRunResponse> cloudRun;

    /**
     * @return Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Output<NetworkEndpointGroupCloudRunResponse> getCloudRun() {
        return this.cloudRun;
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
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    @OutputExport(name="defaultPort", type=Integer.class, parameters={})
    private Output<Integer> defaultPort;

    /**
     * @return The default port used if the port number is not specified in the network endpoint.
     * 
     */
    public Output<Integer> getDefaultPort() {
        return this.defaultPort;
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
    /**
     * Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    @OutputExport(name="networkEndpointType", type=String.class, parameters={})
    private Output<String> networkEndpointType;

    /**
     * @return Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    public Output<String> getNetworkEndpointType() {
        return this.networkEndpointType;
    }
    /**
     * The target service url used to set up private service connection to a Google API. An example value is: "asia-northeast3-cloudkms.googleapis.com"
     * 
     */
    @OutputExport(name="pscTargetService", type=String.class, parameters={})
    private Output<String> pscTargetService;

    /**
     * @return The target service url used to set up private service connection to a Google API. An example value is: "asia-northeast3-cloudkms.googleapis.com"
     * 
     */
    public Output<String> getPscTargetService() {
        return this.pscTargetService;
    }
    /**
     * The URL of the region where the network endpoint group is located.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The URL of the region where the network endpoint group is located.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
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
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @OutputExport(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    @OutputExport(name="serverlessDeployment", type=NetworkEndpointGroupServerlessDeploymentResponse.class, parameters={})
    private Output<NetworkEndpointGroupServerlessDeploymentResponse> serverlessDeployment;

    /**
     * @return Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    public Output<NetworkEndpointGroupServerlessDeploymentResponse> getServerlessDeployment() {
        return this.serverlessDeployment;
    }
    /**
     * [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    @OutputExport(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    public Output<Integer> getSize() {
        return this.size;
    }
    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @OutputExport(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    public Output<String> getSubnetwork() {
        return this.subnetwork;
    }
    /**
     * Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The URL of the zone where the network endpoint group is located.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The URL of the zone where the network endpoint group is located.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkEndpointGroup(String name) {
        this(name, NetworkEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkEndpointGroup(String name, @Nullable NetworkEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkEndpointGroup(String name, @Nullable NetworkEndpointGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:NetworkEndpointGroup", name, args == null ? NetworkEndpointGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkEndpointGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:NetworkEndpointGroup", name, null, makeResourceOptions(options, id));
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
    public static NetworkEndpointGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkEndpointGroup(name, id, options);
    }
}
