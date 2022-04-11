// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lambda.CodeSigningConfigArgs;
import io.pulumi.aws.lambda.inputs.CodeSigningConfigState;
import io.pulumi.aws.lambda.outputs.CodeSigningConfigAllowedPublishers;
import io.pulumi.aws.lambda.outputs.CodeSigningConfigPolicies;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Lambda Code Signing Config resource. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
 * 
 * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Code Signing Configs can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:lambda/codeSigningConfig:CodeSigningConfig imported_csc arn:aws:lambda:us-west-2:123456789012:code-signing-config:csc-0f6c334abcdea4d8b
 * ```
 * 
 */
@ResourceType(type="aws:lambda/codeSigningConfig:CodeSigningConfig")
public class CodeSigningConfig extends io.pulumi.resources.CustomResource {
    /**
     * A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     * 
     */
    @Export(name="allowedPublishers", type=CodeSigningConfigAllowedPublishers.class, parameters={})
    private Output<CodeSigningConfigAllowedPublishers> allowedPublishers;

    /**
     * @return A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     * 
     */
    public Output<CodeSigningConfigAllowedPublishers> getAllowedPublishers() {
        return this.allowedPublishers;
    }
    /**
     * The Amazon Resource Name (ARN) of the code signing configuration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the code signing configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Unique identifier for the code signing configuration.
     * 
     */
    @Export(name="configId", type=String.class, parameters={})
    private Output<String> configId;

    /**
     * @return Unique identifier for the code signing configuration.
     * 
     */
    public Output<String> getConfigId() {
        return this.configId;
    }
    /**
     * Descriptive name for this code signing configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Descriptive name for this code signing configuration.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The date and time that the code signing configuration was last modified.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The date and time that the code signing configuration was last modified.
     * 
     */
    public Output<String> getLastModified() {
        return this.lastModified;
    }
    /**
     * A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     * 
     */
    @Export(name="policies", type=CodeSigningConfigPolicies.class, parameters={})
    private Output<CodeSigningConfigPolicies> policies;

    /**
     * @return A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     * 
     */
    public Output<CodeSigningConfigPolicies> getPolicies() {
        return this.policies;
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
        super("aws:lambda/codeSigningConfig:CodeSigningConfig", name, args == null ? CodeSigningConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CodeSigningConfig(String name, Output<String> id, @Nullable CodeSigningConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/codeSigningConfig:CodeSigningConfig", name, state, makeResourceOptions(options, id));
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
    public static CodeSigningConfig get(String name, Output<String> id, @Nullable CodeSigningConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CodeSigningConfig(name, id, state, options);
    }
}
