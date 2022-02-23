// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codegurureviewer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codegurureviewer.RepositoryAssociationArgs;
import io.pulumi.awsnative.codegurureviewer.enums.RepositoryAssociationType;
import io.pulumi.awsnative.codegurureviewer.outputs.RepositoryAssociationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource schema represents the RepositoryAssociation resource in the Amazon CodeGuru Reviewer service.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:codegurureviewer:RepositoryAssociation")
public class RepositoryAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the repository association.
     * 
     */
    @OutputExport(name="associationArn", type=String.class, parameters={})
    private Output<String> associationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the repository association.
     * 
     */
    public Output<String> getAssociationArn() {
        return this.associationArn;
    }
    /**
     * The name of the S3 bucket associated with an associated S3 repository. It must start with `codeguru-reviewer-`.
     * 
     */
    @OutputExport(name="bucketName", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketName;

    /**
     * @return The name of the S3 bucket associated with an associated S3 repository. It must start with `codeguru-reviewer-`.
     * 
     */
    public Output</* @Nullable */ String> getBucketName() {
        return this.bucketName;
    }
    /**
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     * 
     */
    @OutputExport(name="connectionArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionArn;

    /**
     * @return The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     * 
     */
    public Output</* @Nullable */ String> getConnectionArn() {
        return this.connectionArn;
    }
    /**
     * Name of the repository to be associated.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the repository to be associated.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The owner of the repository. For a Bitbucket repository, this is the username for the account that owns the repository.
     * 
     */
    @OutputExport(name="owner", type=String.class, parameters={})
    private Output</* @Nullable */ String> owner;

    /**
     * @return The owner of the repository. For a Bitbucket repository, this is the username for the account that owns the repository.
     * 
     */
    public Output</* @Nullable */ String> getOwner() {
        return this.owner;
    }
    /**
     * The tags associated with a repository association.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={RepositoryAssociationTag.class})
    private Output</* @Nullable */ List<RepositoryAssociationTag>> tags;

    /**
     * @return The tags associated with a repository association.
     * 
     */
    public Output</* @Nullable */ List<RepositoryAssociationTag>> getTags() {
        return this.tags;
    }
    /**
     * The type of repository to be associated.
     * 
     */
    @OutputExport(name="type", type=RepositoryAssociationType.class, parameters={})
    private Output<RepositoryAssociationType> type;

    /**
     * @return The type of repository to be associated.
     * 
     */
    public Output<RepositoryAssociationType> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepositoryAssociation(String name) {
        this(name, RepositoryAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepositoryAssociation(String name, RepositoryAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryAssociation(String name, RepositoryAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codegurureviewer:RepositoryAssociation", name, args == null ? RepositoryAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RepositoryAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codegurureviewer:RepositoryAssociation", name, null, makeResourceOptions(options, id));
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
    public static RepositoryAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryAssociation(name, id, options);
    }
}
