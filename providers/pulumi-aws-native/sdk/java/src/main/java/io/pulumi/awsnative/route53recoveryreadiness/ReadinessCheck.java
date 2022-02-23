// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53recoveryreadiness.ReadinessCheckArgs;
import io.pulumi.awsnative.route53recoveryreadiness.outputs.ReadinessCheckTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Aws Route53 Recovery Readiness Check Schema and API specification.
 * 
 */
@ResourceType(type="aws-native:route53recoveryreadiness:ReadinessCheck")
public class ReadinessCheck extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the readiness check.
     * 
     */
    @OutputExport(name="readinessCheckArn", type=String.class, parameters={})
    private Output<String> readinessCheckArn;

    /**
     * @return The Amazon Resource Name (ARN) of the readiness check.
     * 
     */
    public Output<String> getReadinessCheckArn() {
        return this.readinessCheckArn;
    }
    /**
     * Name of the ReadinessCheck to create.
     * 
     */
    @OutputExport(name="readinessCheckName", type=String.class, parameters={})
    private Output<String> readinessCheckName;

    /**
     * @return Name of the ReadinessCheck to create.
     * 
     */
    public Output<String> getReadinessCheckName() {
        return this.readinessCheckName;
    }
    /**
     * The name of the resource set to check.
     * 
     */
    @OutputExport(name="resourceSetName", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceSetName;

    /**
     * @return The name of the resource set to check.
     * 
     */
    public Output</* @Nullable */ String> getResourceSetName() {
        return this.resourceSetName;
    }
    /**
     * A collection of tags associated with a resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ReadinessCheckTag.class})
    private Output</* @Nullable */ List<ReadinessCheckTag>> tags;

    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    public Output</* @Nullable */ List<ReadinessCheckTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReadinessCheck(String name) {
        this(name, ReadinessCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReadinessCheck(String name, @Nullable ReadinessCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReadinessCheck(String name, @Nullable ReadinessCheckArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:ReadinessCheck", name, args == null ? ReadinessCheckArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ReadinessCheck(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:ReadinessCheck", name, null, makeResourceOptions(options, id));
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
    public static ReadinessCheck get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReadinessCheck(name, id, options);
    }
}
