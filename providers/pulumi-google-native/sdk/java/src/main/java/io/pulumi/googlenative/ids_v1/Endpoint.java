// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ids_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ids_v1.EndpointArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Endpoint in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:ids/v1:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    /**
     * The create time timestamp.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time timestamp.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the endpoint
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description of the endpoint
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The fully qualified URL of the endpoint's ILB Forwarding Rule.
     * 
     */
    @Export(name="endpointForwardingRule", type=String.class, parameters={})
    private Output<String> endpointForwardingRule;

    /**
     * @return The fully qualified URL of the endpoint's ILB Forwarding Rule.
     * 
     */
    public Output<String> getEndpointForwardingRule() {
        return this.endpointForwardingRule;
    }
    /**
     * The IP address of the IDS Endpoint's ILB.
     * 
     */
    @Export(name="endpointIp", type=String.class, parameters={})
    private Output<String> endpointIp;

    /**
     * @return The IP address of the IDS Endpoint's ILB.
     * 
     */
    public Output<String> getEndpointIp() {
        return this.endpointIp;
    }
    /**
     * The labels of the endpoint.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels of the endpoint.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the endpoint.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the endpoint.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Lowest threat severity that this endpoint will alert on.
     * 
     */
    @Export(name="severity", type=String.class, parameters={})
    private Output<String> severity;

    /**
     * @return Lowest threat severity that this endpoint will alert on.
     * 
     */
    public Output<String> getSeverity() {
        return this.severity;
    }
    /**
     * Current state of the endpoint.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the endpoint.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Whether the endpoint should report traffic logs in addition to threat logs.
     * 
     */
    @Export(name="trafficLogs", type=Boolean.class, parameters={})
    private Output<Boolean> trafficLogs;

    /**
     * @return Whether the endpoint should report traffic logs in addition to threat logs.
     * 
     */
    public Output<Boolean> getTrafficLogs() {
        return this.trafficLogs;
    }
    /**
     * The update time timestamp.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time timestamp.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ids/v1:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ids/v1:Endpoint", name, null, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, options);
    }
}
