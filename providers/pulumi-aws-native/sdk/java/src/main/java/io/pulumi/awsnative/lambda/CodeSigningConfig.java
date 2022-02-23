// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lambda.CodeSigningConfigArgs;
import io.pulumi.awsnative.lambda.outputs.CodeSigningConfigAllowedPublishers;
import io.pulumi.awsnative.lambda.outputs.CodeSigningConfigCodeSigningPolicies;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lambda::CodeSigningConfig.
 * 
 */
@ResourceType(type="aws-native:lambda:CodeSigningConfig")
public class CodeSigningConfig extends io.pulumi.resources.CustomResource {
    /**
     * When the CodeSigningConfig is later on attached to a function, the function code will be expected to be signed by profiles from this list
     * 
     */
    @OutputExport(name="allowedPublishers", type=CodeSigningConfigAllowedPublishers.class, parameters={})
    private Output<CodeSigningConfigAllowedPublishers> allowedPublishers;

    /**
     * @return When the CodeSigningConfig is later on attached to a function, the function code will be expected to be signed by profiles from this list
     * 
     */
    public Output<CodeSigningConfigAllowedPublishers> getAllowedPublishers() {
        return this.allowedPublishers;
    }
    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    @OutputExport(name="codeSigningConfigArn", type=String.class, parameters={})
    private Output<String> codeSigningConfigArn;

    /**
     * @return A unique Arn for CodeSigningConfig resource
     * 
     */
    public Output<String> getCodeSigningConfigArn() {
        return this.codeSigningConfigArn;
    }
    /**
     * A unique identifier for CodeSigningConfig resource
     * 
     */
    @OutputExport(name="codeSigningConfigId", type=String.class, parameters={})
    private Output<String> codeSigningConfigId;

    /**
     * @return A unique identifier for CodeSigningConfig resource
     * 
     */
    public Output<String> getCodeSigningConfigId() {
        return this.codeSigningConfigId;
    }
    /**
     * Policies to control how to act if a signature is invalid
     * 
     */
    @OutputExport(name="codeSigningPolicies", type=CodeSigningConfigCodeSigningPolicies.class, parameters={})
    private Output</* @Nullable */ CodeSigningConfigCodeSigningPolicies> codeSigningPolicies;

    /**
     * @return Policies to control how to act if a signature is invalid
     * 
     */
    public Output</* @Nullable */ CodeSigningConfigCodeSigningPolicies> getCodeSigningPolicies() {
        return this.codeSigningPolicies;
    }
    /**
     * A description of the CodeSigningConfig
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the CodeSigningConfig
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CodeSigningConfig(String name) {
        this(name, CodeSigningConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CodeSigningConfig(String name, CodeSigningConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CodeSigningConfig(String name, CodeSigningConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lambda:CodeSigningConfig", name, args == null ? CodeSigningConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CodeSigningConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lambda:CodeSigningConfig", name, null, makeResourceOptions(options, id));
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
    public static CodeSigningConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CodeSigningConfig(name, id, options);
    }
}
