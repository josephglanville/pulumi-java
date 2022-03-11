// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudformation.CloudFormationTypeArgs;
import io.pulumi.aws.cloudformation.inputs.CloudFormationTypeState;
import io.pulumi.aws.cloudformation.outputs.CloudFormationTypeLoggingConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * `aws_cloudformation_type` can be imported with their type version Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudformation/cloudFormationType:CloudFormationType example arn:aws:cloudformation:us-east-1:123456789012:type/resource/ExampleCompany-ExampleService-ExampleType/1
 * ```
 * 
 */
@ResourceType(type="aws:cloudformation/cloudFormationType:CloudFormationType")
public class CloudFormationType extends io.pulumi.resources.CustomResource {
    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type version. See also `type_arn`.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return (Optional) Amazon Resource Name (ARN) of the CloudFormation Type version. See also `type_arn`.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Identifier of the CloudFormation Type default version.
     * 
     */
    @OutputExport(name="defaultVersionId", type=String.class, parameters={})
    private Output<String> defaultVersionId;

    /**
     * @return Identifier of the CloudFormation Type default version.
     * 
     */
    public Output<String> getDefaultVersionId() {
        return this.defaultVersionId;
    }
    /**
     * Deprecation status of the version.
     * 
     */
    @OutputExport(name="deprecatedStatus", type=String.class, parameters={})
    private Output<String> deprecatedStatus;

    /**
     * @return Deprecation status of the version.
     * 
     */
    public Output<String> getDeprecatedStatus() {
        return this.deprecatedStatus;
    }
    /**
     * Description of the version.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the version.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * URL of the documentation for the CloudFormation Type.
     * 
     */
    @OutputExport(name="documentationUrl", type=String.class, parameters={})
    private Output<String> documentationUrl;

    /**
     * @return URL of the documentation for the CloudFormation Type.
     * 
     */
    public Output<String> getDocumentationUrl() {
        return this.documentationUrl;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     * 
     */
    @OutputExport(name="executionRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> executionRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     * 
     */
    public Output</* @Nullable */ String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * Whether the CloudFormation Type version is the default version.
     * 
     */
    @OutputExport(name="isDefaultVersion", type=Boolean.class, parameters={})
    private Output<Boolean> isDefaultVersion;

    /**
     * @return Whether the CloudFormation Type version is the default version.
     * 
     */
    public Output<Boolean> getIsDefaultVersion() {
        return this.isDefaultVersion;
    }
    /**
     * Configuration block containing logging configuration.
     * 
     */
    @OutputExport(name="loggingConfig", type=CloudFormationTypeLoggingConfig.class, parameters={})
    private Output</* @Nullable */ CloudFormationTypeLoggingConfig> loggingConfig;

    /**
     * @return Configuration block containing logging configuration.
     * 
     */
    public Output</* @Nullable */ CloudFormationTypeLoggingConfig> getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * Provisioning behavior of the CloudFormation Type.
     * 
     */
    @OutputExport(name="provisioningType", type=String.class, parameters={})
    private Output<String> provisioningType;

    /**
     * @return Provisioning behavior of the CloudFormation Type.
     * 
     */
    public Output<String> getProvisioningType() {
        return this.provisioningType;
    }
    /**
     * JSON document of the CloudFormation Type schema.
     * 
     */
    @OutputExport(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return JSON document of the CloudFormation Type schema.
     * 
     */
    public Output<String> getSchema() {
        return this.schema;
    }
    /**
     * URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     * 
     */
    @OutputExport(name="schemaHandlerPackage", type=String.class, parameters={})
    private Output<String> schemaHandlerPackage;

    /**
     * @return URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     * 
     */
    public Output<String> getSchemaHandlerPackage() {
        return this.schemaHandlerPackage;
    }
    /**
     * URL of the source code for the CloudFormation Type.
     * 
     */
    @OutputExport(name="sourceUrl", type=String.class, parameters={})
    private Output<String> sourceUrl;

    /**
     * @return URL of the source code for the CloudFormation Type.
     * 
     */
    public Output<String> getSourceUrl() {
        return this.sourceUrl;
    }
    /**
     * CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type. See also `arn`.
     * 
     */
    @OutputExport(name="typeArn", type=String.class, parameters={})
    private Output<String> typeArn;

    /**
     * @return (Optional) Amazon Resource Name (ARN) of the CloudFormation Type. See also `arn`.
     * 
     */
    public Output<String> getTypeArn() {
        return this.typeArn;
    }
    /**
     * CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     * 
     */
    @OutputExport(name="typeName", type=String.class, parameters={})
    private Output<String> typeName;

    /**
     * @return CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     * 
     */
    public Output<String> getTypeName() {
        return this.typeName;
    }
    /**
     * (Optional) Identifier of the CloudFormation Type version.
     * 
     */
    @OutputExport(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return (Optional) Identifier of the CloudFormation Type version.
     * 
     */
    public Output<String> getVersionId() {
        return this.versionId;
    }
    /**
     * Scope of the CloudFormation Type.
     * 
     */
    @OutputExport(name="visibility", type=String.class, parameters={})
    private Output<String> visibility;

    /**
     * @return Scope of the CloudFormation Type.
     * 
     */
    public Output<String> getVisibility() {
        return this.visibility;
    }

    public interface BuilderApplicator {
        public void apply(CloudFormationTypeArgs.Builder a);
    }
    private static io.pulumi.aws.cloudformation.CloudFormationTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudformation.CloudFormationTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CloudFormationType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudFormationType(String name) {
        this(name, CloudFormationTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudFormationType(String name, CloudFormationTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudFormationType(String name, CloudFormationTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/cloudFormationType:CloudFormationType", name, args == null ? CloudFormationTypeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CloudFormationType(String name, Output<String> id, @Nullable CloudFormationTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/cloudFormationType:CloudFormationType", name, state, makeResourceOptions(options, id));
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
    public static CloudFormationType get(String name, Output<String> id, @Nullable CloudFormationTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CloudFormationType(name, id, state, options);
    }
}
