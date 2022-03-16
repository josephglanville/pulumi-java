// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apprunner.ServiceArgs;
import io.pulumi.aws.apprunner.inputs.ServiceState;
import io.pulumi.aws.apprunner.outputs.ServiceEncryptionConfiguration;
import io.pulumi.aws.apprunner.outputs.ServiceHealthCheckConfiguration;
import io.pulumi.aws.apprunner.outputs.ServiceInstanceConfiguration;
import io.pulumi.aws.apprunner.outputs.ServiceSourceConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an App Runner Service.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * App Runner Services can be imported by using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apprunner/service:Service example arn:aws:apprunner:us-east-1:1234567890:service/example/0a03292a89764e5882c41d8f991c82fe
 * ```
 * 
 */
@ResourceType(type="aws:apprunner/service:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the App Runner service.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the App Runner service.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
     * 
     */
    @Export(name="autoScalingConfigurationArn", type=String.class, parameters={})
    private Output<String> autoScalingConfigurationArn;

    /**
     * @return ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
     * 
     */
    public Output<String> getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn;
    }
    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
     * 
     */
    @Export(name="encryptionConfiguration", type=ServiceEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
     * 
     */
    public Output</* @Nullable */ ServiceEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
     * 
     */
    @Export(name="healthCheckConfiguration", type=ServiceHealthCheckConfiguration.class, parameters={})
    private Output<ServiceHealthCheckConfiguration> healthCheckConfiguration;

    /**
     * @return Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
     * 
     */
    public Output<ServiceHealthCheckConfiguration> getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }
    /**
     * The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
     * 
     */
    @Export(name="instanceConfiguration", type=ServiceInstanceConfiguration.class, parameters={})
    private Output<ServiceInstanceConfiguration> instanceConfiguration;

    /**
     * @return The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
     * 
     */
    public Output<ServiceInstanceConfiguration> getInstanceConfiguration() {
        return this.instanceConfiguration;
    }
    /**
     * An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
     * 
     */
    @Export(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    /**
     * @return An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
     * 
     */
    public Output<String> getServiceId() {
        return this.serviceId;
    }
    /**
     * Name of the service.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return Name of the service.
     * 
     */
    public Output<String> getServiceName() {
        return this.serviceName;
    }
    /**
     * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
     * 
     */
    @Export(name="serviceUrl", type=String.class, parameters={})
    private Output<String> serviceUrl;

    /**
     * @return A subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
     * 
     */
    public Output<String> getServiceUrl() {
        return this.serviceUrl;
    }
    /**
     * The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
     * 
     */
    @Export(name="sourceConfiguration", type=ServiceSourceConfiguration.class, parameters={})
    private Output<ServiceSourceConfiguration> sourceConfiguration;

    /**
     * @return The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
     * 
     */
    public Output<ServiceSourceConfiguration> getSourceConfiguration() {
        return this.sourceConfiguration;
    }
    /**
     * The current state of the App Runner service.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current state of the App Runner service.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(ServiceArgs.Builder a);
    }
    private static io.pulumi.aws.apprunner.ServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apprunner.ServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Service(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/service:Service", name, state, makeResourceOptions(options, id));
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
