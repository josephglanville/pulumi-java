// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeartifact;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codeartifact.DomainArgs;
import io.pulumi.awsnative.codeartifact.outputs.DomainTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The resource schema to create a CodeArtifact domain.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:codeartifact:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the domain.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the domain.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the domain.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The name of the domain.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * 
     */
    @OutputExport(name="encryptionKey", type=String.class, parameters={})
    private Output<String> encryptionKey;

    /**
     * @return The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * 
     */
    public Output<String> getEncryptionKey() {
        return this.encryptionKey;
    }
    /**
     * The name of the domain. This field is used for GetAtt
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the domain. This field is used for GetAtt
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The 12-digit account ID of the AWS account that owns the domain. This field is used for GetAtt
     * 
     */
    @OutputExport(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The 12-digit account ID of the AWS account that owns the domain. This field is used for GetAtt
     * 
     */
    public Output<String> getOwner() {
        return this.owner;
    }
    /**
     * The access control resource policy on the provided domain.
     * 
     */
    @OutputExport(name="permissionsPolicyDocument", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> permissionsPolicyDocument;

    /**
     * @return The access control resource policy on the provided domain.
     * 
     */
    public Output</* @Nullable */ Object> getPermissionsPolicyDocument() {
        return this.permissionsPolicyDocument;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DomainTag.class})
    private Output</* @Nullable */ List<DomainTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<DomainTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codeartifact:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Domain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codeartifact:Domain", name, null, makeResourceOptions(options, id));
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
    public static Domain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
