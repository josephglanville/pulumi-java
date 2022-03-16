// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudcontrol;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudcontrol.ResourceArgs;
import io.pulumi.aws.cloudcontrol.inputs.ResourceState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Cloud Control API Resource. The configuration and lifecycle handling of these resources is proxied through Cloud Control API handlers to the backend service.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:cloudcontrol/resource:Resource")
public class Resource extends io.pulumi.resources.CustomResource {
    @Export(name="desiredState", type=String.class, parameters={})
    private Output<String> desiredState;

    public Output<String> getDesiredState() {
        return this.desiredState;
    }
    @Export(name="properties", type=String.class, parameters={})
    private Output<String> properties;

    public Output<String> getProperties() {
        return this.properties;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume for operations.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role to assume for operations.
     * 
     */
    public Output</* @Nullable */ String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * JSON string of the CloudFormation resource type schema which is used for plan time validation where possible. Automatically fetched if not provided. In large scale environments with multiple resources using the same `type_name`, it is recommended to fetch the schema once via the `aws.cloudformation.CloudFormationType` data source and use this argument to reduce `DescribeType` API operation throttling. This value is marked sensitive only to prevent large plan differences from showing.
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return JSON string of the CloudFormation resource type schema which is used for plan time validation where possible. Automatically fetched if not provided. In large scale environments with multiple resources using the same `type_name`, it is recommended to fetch the schema once via the `aws.cloudformation.CloudFormationType` data source and use this argument to reduce `DescribeType` API operation throttling. This value is marked sensitive only to prevent large plan differences from showing.
     * 
     */
    public Output<String> getSchema() {
        return this.schema;
    }
    /**
     * CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @Export(name="typeName", type=String.class, parameters={})
    private Output<String> typeName;

    /**
     * @return CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    public Output<String> getTypeName() {
        return this.typeName;
    }
    /**
     * Identifier of the CloudFormation resource type version.
     * 
     */
    @Export(name="typeVersionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeVersionId;

    /**
     * @return Identifier of the CloudFormation resource type version.
     * 
     */
    public Output</* @Nullable */ String> getTypeVersionId() {
        return this.typeVersionId;
    }

    public interface BuilderApplicator {
        public void apply(ResourceArgs.Builder a);
    }
    private static io.pulumi.aws.cloudcontrol.ResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudcontrol.ResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Resource(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resource(String name) {
        this(name, ResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resource(String name, ResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resource(String name, ResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudcontrol/resource:Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Resource(String name, Output<String> id, @Nullable ResourceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudcontrol/resource:Resource", name, state, makeResourceOptions(options, id));
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
    public static Resource get(String name, Output<String> id, @Nullable ResourceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, state, options);
    }
}
