// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kms;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kms.AliasArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::KMS::Alias resource specifies a display name for a customer master key (CMK) in AWS Key Management Service (AWS KMS). You can use an alias to identify a CMK in cryptographic operations.
 * 
 */
@ResourceType(type="aws-native:kms:Alias")
public class Alias extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    @Export(name="aliasName", type=String.class, parameters={})
    private Output<String> aliasName;

    /**
     * @return Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    public Output<String> getAliasName() {
        return this.aliasName;
    }
    /**
     * Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
     * 
     */
    @Export(name="targetKeyId", type=String.class, parameters={})
    private Output<String> targetKeyId;

    /**
     * @return Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
     * 
     */
    public Output<String> getTargetKeyId() {
        return this.targetKeyId;
    }

    public interface BuilderApplicator {
        public void apply(AliasArgs.Builder a);
    }
    private static io.pulumi.awsnative.kms.AliasArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.kms.AliasArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Alias(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kms:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Alias(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kms:Alias", name, null, makeResourceOptions(options, id));
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
    public static Alias get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, options);
    }
}
