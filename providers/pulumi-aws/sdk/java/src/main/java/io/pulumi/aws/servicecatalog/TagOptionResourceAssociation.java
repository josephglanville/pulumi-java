// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.TagOptionResourceAssociationArgs;
import io.pulumi.aws.servicecatalog.inputs.TagOptionResourceAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Tag Option Resource Association.
 * 
 * > **Tip:** A "resource" is either a Service Catalog portfolio or product.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_servicecatalog_tag_option_resource_association` can be imported using the tag option ID and resource ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/tagOptionResourceAssociation:TagOptionResourceAssociation example tag-pjtvyakdlyo3m:prod-dnigbtea24ste
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/tagOptionResourceAssociation:TagOptionResourceAssociation")
public class TagOptionResourceAssociation extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the resource.
     * 
     */
    @OutputExport(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return ARN of the resource.
     * 
     */
    public Output<String> getResourceArn() {
        return this.resourceArn;
    }
    /**
     * Creation time of the resource.
     * 
     */
    @OutputExport(name="resourceCreatedTime", type=String.class, parameters={})
    private Output<String> resourceCreatedTime;

    /**
     * @return Creation time of the resource.
     * 
     */
    public Output<String> getResourceCreatedTime() {
        return this.resourceCreatedTime;
    }
    /**
     * Description of the resource.
     * 
     */
    @OutputExport(name="resourceDescription", type=String.class, parameters={})
    private Output<String> resourceDescription;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<String> getResourceDescription() {
        return this.resourceDescription;
    }
    /**
     * Resource identifier.
     * 
     */
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return Resource identifier.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * Description of the resource.
     * 
     */
    @OutputExport(name="resourceName", type=String.class, parameters={})
    private Output<String> resourceName;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<String> getPropResourceName() {
        return this.resourceName;
    }
    /**
     * Tag Option identifier.
     * 
     */
    @OutputExport(name="tagOptionId", type=String.class, parameters={})
    private Output<String> tagOptionId;

    /**
     * @return Tag Option identifier.
     * 
     */
    public Output<String> getTagOptionId() {
        return this.tagOptionId;
    }

    public interface BuilderApplicator {
        public void apply(TagOptionResourceAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.servicecatalog.TagOptionResourceAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.servicecatalog.TagOptionResourceAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TagOptionResourceAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagOptionResourceAssociation(String name) {
        this(name, TagOptionResourceAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagOptionResourceAssociation(String name, TagOptionResourceAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagOptionResourceAssociation(String name, TagOptionResourceAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/tagOptionResourceAssociation:TagOptionResourceAssociation", name, args == null ? TagOptionResourceAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TagOptionResourceAssociation(String name, Output<String> id, @Nullable TagOptionResourceAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/tagOptionResourceAssociation:TagOptionResourceAssociation", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagOptionResourceAssociation get(String name, Output<String> id, @Nullable TagOptionResourceAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagOptionResourceAssociation(name, id, state, options);
    }
}
