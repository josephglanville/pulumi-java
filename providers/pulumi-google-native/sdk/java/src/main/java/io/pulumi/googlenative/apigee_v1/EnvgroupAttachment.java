// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.EnvgroupAttachmentArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new attachment of an environment to an environment group.
 * 
 */
@ResourceType(type="google-native:apigee/v1:EnvgroupAttachment")
public class EnvgroupAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the environment group attachment was created as milliseconds since epoch.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time at which the environment group attachment was created as milliseconds since epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * ID of the attached environment.
     * 
     */
    @OutputExport(name="environment", type=String.class, parameters={})
    private Output<String> environment;

    /**
     * @return ID of the attached environment.
     * 
     */
    public Output<String> getEnvironment() {
        return this.environment;
    }
    /**
     * ID of the environment group attachment.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return ID of the environment group attachment.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(EnvgroupAttachmentArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.EnvgroupAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.EnvgroupAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EnvgroupAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvgroupAttachment(String name) {
        this(name, EnvgroupAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvgroupAttachment(String name, EnvgroupAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvgroupAttachment(String name, EnvgroupAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:EnvgroupAttachment", name, args == null ? EnvgroupAttachmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EnvgroupAttachment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:EnvgroupAttachment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static EnvgroupAttachment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnvgroupAttachment(name, id, options);
    }
}
