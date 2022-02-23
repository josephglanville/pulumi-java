// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.PublicTypeVersionArgs;
import io.pulumi.awsnative.cloudformation.enums.PublicTypeVersionType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Test and Publish a resource that has been registered in the CloudFormation Registry.
 * 
 */
@ResourceType(type="aws-native:cloudformation:PublicTypeVersion")
public class PublicTypeVersion extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Number (ARN) of the extension.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output</* @Nullable */ String> arn;

    /**
     * @return The Amazon Resource Number (ARN) of the extension.
     * 
     */
    public Output</* @Nullable */ String> getArn() {
        return this.arn;
    }
    /**
     * A url to the S3 bucket where logs for the testType run will be available
     * 
     */
    @OutputExport(name="logDeliveryBucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> logDeliveryBucket;

    /**
     * @return A url to the S3 bucket where logs for the testType run will be available
     * 
     */
    public Output</* @Nullable */ String> getLogDeliveryBucket() {
        return this.logDeliveryBucket;
    }
    /**
     * The Amazon Resource Number (ARN) assigned to the public extension upon publication
     * 
     */
    @OutputExport(name="publicTypeArn", type=String.class, parameters={})
    private Output<String> publicTypeArn;

    /**
     * @return The Amazon Resource Number (ARN) assigned to the public extension upon publication
     * 
     */
    public Output<String> getPublicTypeArn() {
        return this.publicTypeArn;
    }
    /**
     * The version number of a public third-party extension
     * 
     */
    @OutputExport(name="publicVersionNumber", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicVersionNumber;

    /**
     * @return The version number of a public third-party extension
     * 
     */
    public Output</* @Nullable */ String> getPublicVersionNumber() {
        return this.publicVersionNumber;
    }
    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    @OutputExport(name="publisherId", type=String.class, parameters={})
    private Output<String> publisherId;

    /**
     * @return The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    public Output<String> getPublisherId() {
        return this.publisherId;
    }
    /**
     * The kind of extension
     * 
     */
    @OutputExport(name="type", type=PublicTypeVersionType.class, parameters={})
    private Output</* @Nullable */ PublicTypeVersionType> type;

    /**
     * @return The kind of extension
     * 
     */
    public Output</* @Nullable */ PublicTypeVersionType> getType() {
        return this.type;
    }
    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @OutputExport(name="typeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeName;

    /**
     * @return The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    public Output</* @Nullable */ String> getTypeName() {
        return this.typeName;
    }
    /**
     * The Amazon Resource Number (ARN) of the extension with the versionId.
     * 
     */
    @OutputExport(name="typeVersionArn", type=String.class, parameters={})
    private Output<String> typeVersionArn;

    /**
     * @return The Amazon Resource Number (ARN) of the extension with the versionId.
     * 
     */
    public Output<String> getTypeVersionArn() {
        return this.typeVersionArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicTypeVersion(String name) {
        this(name, PublicTypeVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicTypeVersion(String name, @Nullable PublicTypeVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicTypeVersion(String name, @Nullable PublicTypeVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:PublicTypeVersion", name, args == null ? PublicTypeVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PublicTypeVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:PublicTypeVersion", name, null, makeResourceOptions(options, id));
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
    public static PublicTypeVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PublicTypeVersion(name, id, options);
    }
}
