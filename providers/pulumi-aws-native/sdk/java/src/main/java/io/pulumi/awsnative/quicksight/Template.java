// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.quicksight.TemplateArgs;
import io.pulumi.awsnative.quicksight.outputs.TemplateResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.TemplateSourceEntity;
import io.pulumi.awsnative.quicksight.outputs.TemplateTag;
import io.pulumi.awsnative.quicksight.outputs.TemplateVersion;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of the AWS::QuickSight::Template Resource Type.
 * 
 */
@ResourceType(type="aws-native:quicksight:Template")
public class Template extends io.pulumi.resources.CustomResource {
    /**
     * <p>The Amazon Resource Name (ARN) of the template.</p>
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return <p>The Amazon Resource Name (ARN) of the template.</p>
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId;
    }
    /**
     * <p>Time when this was created.</p>
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return <p>Time when this was created.</p>
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * <p>Time when this was last updated.</p>
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return <p>Time when this was last updated.</p>
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * <p>A display name for the template.</p>
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return <p>A display name for the template.</p>
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * <p>A list of resource permissions to be set on the template. </p>
     * 
     */
    @Export(name="permissions", type=List.class, parameters={TemplateResourcePermission.class})
    private Output</* @Nullable */ List<TemplateResourcePermission>> permissions;

    /**
     * @return <p>A list of resource permissions to be set on the template. </p>
     * 
     */
    public Output</* @Nullable */ List<TemplateResourcePermission>> getPermissions() {
        return this.permissions;
    }
    @Export(name="sourceEntity", type=TemplateSourceEntity.class, parameters={})
    private Output<TemplateSourceEntity> sourceEntity;

    public Output<TemplateSourceEntity> getSourceEntity() {
        return this.sourceEntity;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.</p>
     * 
     */
    @Export(name="tags", type=List.class, parameters={TemplateTag.class})
    private Output</* @Nullable */ List<TemplateTag>> tags;

    /**
     * @return <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.</p>
     * 
     */
    public Output</* @Nullable */ List<TemplateTag>> getTags() {
        return this.tags;
    }
    @Export(name="templateId", type=String.class, parameters={})
    private Output<String> templateId;

    public Output<String> getTemplateId() {
        return this.templateId;
    }
    @Export(name="version", type=TemplateVersion.class, parameters={})
    private Output<TemplateVersion> version;

    public Output<TemplateVersion> getVersion() {
        return this.version;
    }
    /**
     * <p>A description of the current template version being created. This API operation creates the
     * 			first version of the template. Every time <code>UpdateTemplate</code> is called, a new
     * 			version is created. Each version of the template maintains a description of the version
     * 			in the <code>VersionDescription</code> field.</p>
     * 
     */
    @Export(name="versionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionDescription;

    /**
     * @return <p>A description of the current template version being created. This API operation creates the
     * 			first version of the template. Every time <code>UpdateTemplate</code> is called, a new
     * 			version is created. Each version of the template maintains a description of the version
     * 			in the <code>VersionDescription</code> field.</p>
     * 
     */
    public Output</* @Nullable */ String> getVersionDescription() {
        return this.versionDescription;
    }

    public interface BuilderApplicator {
        public void apply(TemplateArgs.Builder a);
    }
    private static io.pulumi.awsnative.quicksight.TemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.quicksight.TemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Template(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Template(String name) {
        this(name, TemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Template(String name, TemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Template(String name, TemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Template", name, args == null ? TemplateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Template(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Template", name, null, makeResourceOptions(options, id));
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
    public static Template get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Template(name, id, options);
    }
}
