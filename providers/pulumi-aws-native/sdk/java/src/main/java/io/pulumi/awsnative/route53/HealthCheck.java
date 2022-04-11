// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53.HealthCheckArgs;
import io.pulumi.awsnative.route53.outputs.HealthCheckConfigProperties;
import io.pulumi.awsnative.route53.outputs.HealthCheckTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53::HealthCheck.
 * 
 */
@ResourceType(type="aws-native:route53:HealthCheck")
public class HealthCheck extends io.pulumi.resources.CustomResource {
    /**
     * A complex type that contains information about the health check.
     * 
     */
    @Export(name="healthCheckConfig", type=HealthCheckConfigProperties.class, parameters={})
    private Output<HealthCheckConfigProperties> healthCheckConfig;

    /**
     * @return A complex type that contains information about the health check.
     * 
     */
    public Output<HealthCheckConfigProperties> getHealthCheckConfig() {
        return this.healthCheckConfig;
    }
    @Export(name="healthCheckId", type=String.class, parameters={})
    private Output<String> healthCheckId;

    public Output<String> getHealthCheckId() {
        return this.healthCheckId;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="healthCheckTags", type=List.class, parameters={HealthCheckTag.class})
    private Output</* @Nullable */ List<HealthCheckTag>> healthCheckTags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<HealthCheckTag>> getHealthCheckTags() {
        return this.healthCheckTags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HealthCheck(String name) {
        this(name, HealthCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HealthCheck(String name, HealthCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HealthCheck(String name, HealthCheckArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53:HealthCheck", name, args == null ? HealthCheckArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HealthCheck(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53:HealthCheck", name, null, makeResourceOptions(options, id));
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
    public static HealthCheck get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HealthCheck(name, id, options);
    }
}
