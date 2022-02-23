// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.AgentArgs;
import io.pulumi.awsnative.datasync.enums.AgentEndpointType;
import io.pulumi.awsnative.datasync.outputs.AgentTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::Agent.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:datasync:Agent")
public class Agent extends io.pulumi.resources.CustomResource {
    /**
     * Activation key of the Agent.
     * 
     */
    @OutputExport(name="activationKey", type=String.class, parameters={})
    private Output<String> activationKey;

    /**
     * @return Activation key of the Agent.
     * 
     */
    public Output<String> getActivationKey() {
        return this.activationKey;
    }
    /**
     * The DataSync Agent ARN.
     * 
     */
    @OutputExport(name="agentArn", type=String.class, parameters={})
    private Output<String> agentArn;

    /**
     * @return The DataSync Agent ARN.
     * 
     */
    public Output<String> getAgentArn() {
        return this.agentArn;
    }
    /**
     * The name configured for the agent. Text reference used to identify the agent in the console.
     * 
     */
    @OutputExport(name="agentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> agentName;

    /**
     * @return The name configured for the agent. Text reference used to identify the agent in the console.
     * 
     */
    public Output</* @Nullable */ String> getAgentName() {
        return this.agentName;
    }
    /**
     * The service endpoints that the agent will connect to.
     * 
     */
    @OutputExport(name="endpointType", type=AgentEndpointType.class, parameters={})
    private Output<AgentEndpointType> endpointType;

    /**
     * @return The service endpoints that the agent will connect to.
     * 
     */
    public Output<AgentEndpointType> getEndpointType() {
        return this.endpointType;
    }
    /**
     * The ARNs of the security group used to protect your data transfer task subnets.
     * 
     */
    @OutputExport(name="securityGroupArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupArns;

    /**
     * @return The ARNs of the security group used to protect your data transfer task subnets.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroupArns() {
        return this.securityGroupArns;
    }
    /**
     * The ARNs of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    @OutputExport(name="subnetArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> subnetArns;

    /**
     * @return The ARNs of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    public Output</* @Nullable */ List<String>> getSubnetArns() {
        return this.subnetArns;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={AgentTag.class})
    private Output</* @Nullable */ List<AgentTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<AgentTag>> getTags() {
        return this.tags;
    }
    /**
     * The ID of the VPC endpoint that the agent has access to.
     * 
     */
    @OutputExport(name="vpcEndpointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcEndpointId;

    /**
     * @return The ID of the VPC endpoint that the agent has access to.
     * 
     */
    public Output</* @Nullable */ String> getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Agent(String name) {
        this(name, AgentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Agent(String name, AgentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Agent(String name, AgentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:Agent", name, args == null ? AgentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Agent(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:Agent", name, null, makeResourceOptions(options, id));
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
    public static Agent get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Agent(name, id, options);
    }
}
