// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.InfrastructureConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.outputs.InfrastructureConfigurationInstanceMetadataOptions;
import io.pulumi.awsnative.imagebuilder.outputs.InfrastructureConfigurationLogging;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::ImageBuilder::InfrastructureConfiguration
 * 
 */
@ResourceType(type="aws-native:imagebuilder:InfrastructureConfiguration")
public class InfrastructureConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the infrastructure configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The instance metadata option settings for the infrastructure configuration.
     * 
     */
    @Export(name="instanceMetadataOptions", type=InfrastructureConfigurationInstanceMetadataOptions.class, parameters={})
    private Output</* @Nullable */ InfrastructureConfigurationInstanceMetadataOptions> instanceMetadataOptions;

    /**
     * @return The instance metadata option settings for the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ InfrastructureConfigurationInstanceMetadataOptions> getInstanceMetadataOptions() {
        return this.instanceMetadataOptions;
    }
    /**
     * The instance profile of the infrastructure configuration.
     * 
     */
    @Export(name="instanceProfileName", type=String.class, parameters={})
    private Output<String> instanceProfileName;

    /**
     * @return The instance profile of the infrastructure configuration.
     * 
     */
    public Output<String> getInstanceProfileName() {
        return this.instanceProfileName;
    }
    /**
     * The instance types of the infrastructure configuration.
     * 
     */
    @Export(name="instanceTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> instanceTypes;

    /**
     * @return The instance types of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ List<String>> getInstanceTypes() {
        return this.instanceTypes;
    }
    /**
     * The EC2 key pair of the infrastructure configuration..
     * 
     */
    @Export(name="keyPair", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPair;

    /**
     * @return The EC2 key pair of the infrastructure configuration..
     * 
     */
    public Output</* @Nullable */ String> getKeyPair() {
        return this.keyPair;
    }
    /**
     * The logging configuration of the infrastructure configuration.
     * 
     */
    @Export(name="logging", type=InfrastructureConfigurationLogging.class, parameters={})
    private Output</* @Nullable */ InfrastructureConfigurationLogging> logging;

    /**
     * @return The logging configuration of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ InfrastructureConfigurationLogging> getLogging() {
        return this.logging;
    }
    /**
     * The name of the infrastructure configuration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the infrastructure configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The tags attached to the resource created by Image Builder.
     * 
     */
    @Export(name="resourceTags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> resourceTags;

    /**
     * @return The tags attached to the resource created by Image Builder.
     * 
     */
    public Output</* @Nullable */ Object> getResourceTags() {
        return this.resourceTags;
    }
    /**
     * The security group IDs of the infrastructure configuration.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return The security group IDs of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The SNS Topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    @Export(name="snsTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicArn;

    /**
     * @return The SNS Topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ String> getSnsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * The subnet ID of the infrastructure configuration.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return The subnet ID of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * The tags associated with the component.
     * 
     */
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return The tags associated with the component.
     * 
     */
    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }
    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     * 
     */
    @Export(name="terminateInstanceOnFailure", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstanceOnFailure;

    /**
     * @return The terminate instance on failure configuration of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ Boolean> getTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InfrastructureConfiguration(String name) {
        this(name, InfrastructureConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InfrastructureConfiguration(String name, InfrastructureConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InfrastructureConfiguration(String name, InfrastructureConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:InfrastructureConfiguration", name, args == null ? InfrastructureConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InfrastructureConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:InfrastructureConfiguration", name, null, makeResourceOptions(options, id));
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
    public static InfrastructureConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InfrastructureConfiguration(name, id, options);
    }
}
