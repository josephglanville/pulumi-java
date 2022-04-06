// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicediscovery.ServiceArgs;
import io.pulumi.aws.servicediscovery.inputs.ServiceState;
import io.pulumi.aws.servicediscovery.outputs.ServiceDnsConfig;
import io.pulumi.aws.servicediscovery.outputs.ServiceHealthCheckConfig;
import io.pulumi.aws.servicediscovery.outputs.ServiceHealthCheckCustomConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Service Discovery Service resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Service Discovery Service can be imported using the service ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicediscovery/service:Service example 0123456789
 * ```
 * 
 */
@ResourceType(type="aws:servicediscovery/service:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the service.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the service.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the service.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     * 
     */
    @Export(name="dnsConfig", type=ServiceDnsConfig.class, parameters={})
    private Output</* @Nullable */ ServiceDnsConfig> dnsConfig;

    /**
     * @return A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     * 
     */
    public Output</* @Nullable */ ServiceDnsConfig> getDnsConfig() {
        return this.dnsConfig;
    }
    /**
     * A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     * 
     */
    @Export(name="healthCheckConfig", type=ServiceHealthCheckConfig.class, parameters={})
    private Output</* @Nullable */ ServiceHealthCheckConfig> healthCheckConfig;

    /**
     * @return A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     * 
     */
    public Output</* @Nullable */ ServiceHealthCheckConfig> getHealthCheckConfig() {
        return this.healthCheckConfig;
    }
    /**
     * A complex type that contains settings for ECS managed health checks.
     * 
     */
    @Export(name="healthCheckCustomConfig", type=ServiceHealthCheckCustomConfig.class, parameters={})
    private Output</* @Nullable */ ServiceHealthCheckCustomConfig> healthCheckCustomConfig;

    /**
     * @return A complex type that contains settings for ECS managed health checks.
     * 
     */
    public Output</* @Nullable */ ServiceHealthCheckCustomConfig> getHealthCheckCustomConfig() {
        return this.healthCheckCustomConfig;
    }
    /**
     * The name of the service.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the service.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the namespace to use for DNS configuration.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The ID of the namespace to use for DNS configuration.
     * 
     */
    public Output<String> getNamespaceId() {
        return this.namespaceId;
    }
    /**
     * A map of tags to assign to the service. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the service. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, @Nullable ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, @Nullable ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/service:Service", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Service get(String name, Output<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}