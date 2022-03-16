// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53recoveryreadiness.ResourceSetArgs;
import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetResource;
import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schema for the AWS Route53 Recovery Readiness ResourceSet Resource and API.
 * 
 */
@ResourceType(type="aws-native:route53recoveryreadiness:ResourceSet")
public class ResourceSet extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the resource set.
     * 
     */
    @Export(name="resourceSetArn", type=String.class, parameters={})
    private Output<String> resourceSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the resource set.
     * 
     */
    public Output<String> getResourceSetArn() {
        return this.resourceSetArn;
    }
    /**
     * The name of the resource set to create.
     * 
     */
    @Export(name="resourceSetName", type=String.class, parameters={})
    private Output<String> resourceSetName;

    /**
     * @return The name of the resource set to create.
     * 
     */
    public Output<String> getResourceSetName() {
        return this.resourceSetName;
    }
    /**
     * The resource type of the resources in the resource set. Enter one of the following values for resource type:
     * 
     * AWS: :AutoScaling: :AutoScalingGroup, AWS: :CloudWatch: :Alarm, AWS: :EC2: :CustomerGateway, AWS: :DynamoDB: :Table, AWS: :EC2: :Volume, AWS: :ElasticLoadBalancing: :LoadBalancer, AWS: :ElasticLoadBalancingV2: :LoadBalancer, AWS: :MSK: :Cluster, AWS: :RDS: :DBCluster, AWS: :Route53: :HealthCheck, AWS: :SQS: :Queue, AWS: :SNS: :Topic, AWS: :SNS: :Subscription, AWS: :EC2: :VPC, AWS: :EC2: :VPNConnection, AWS: :EC2: :VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     * 
     */
    @Export(name="resourceSetType", type=String.class, parameters={})
    private Output<String> resourceSetType;

    /**
     * @return The resource type of the resources in the resource set. Enter one of the following values for resource type:
     * 
     * AWS: :AutoScaling: :AutoScalingGroup, AWS: :CloudWatch: :Alarm, AWS: :EC2: :CustomerGateway, AWS: :DynamoDB: :Table, AWS: :EC2: :Volume, AWS: :ElasticLoadBalancing: :LoadBalancer, AWS: :ElasticLoadBalancingV2: :LoadBalancer, AWS: :MSK: :Cluster, AWS: :RDS: :DBCluster, AWS: :Route53: :HealthCheck, AWS: :SQS: :Queue, AWS: :SNS: :Topic, AWS: :SNS: :Subscription, AWS: :EC2: :VPC, AWS: :EC2: :VPNConnection, AWS: :EC2: :VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     * 
     */
    public Output<String> getResourceSetType() {
        return this.resourceSetType;
    }
    /**
     * A list of resource objects in the resource set.
     * 
     */
    @Export(name="resources", type=List.class, parameters={ResourceSetResource.class})
    private Output<List<ResourceSetResource>> resources;

    /**
     * @return A list of resource objects in the resource set.
     * 
     */
    public Output<List<ResourceSetResource>> getResources() {
        return this.resources;
    }
    /**
     * A tag to associate with the parameters for a resource set.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ResourceSetTag.class})
    private Output</* @Nullable */ List<ResourceSetTag>> tags;

    /**
     * @return A tag to associate with the parameters for a resource set.
     * 
     */
    public Output</* @Nullable */ List<ResourceSetTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(ResourceSetArgs.Builder a);
    }
    private static io.pulumi.awsnative.route53recoveryreadiness.ResourceSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.route53recoveryreadiness.ResourceSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourceSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceSet(String name) {
        this(name, ResourceSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceSet(String name, ResourceSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceSet(String name, ResourceSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:ResourceSet", name, args == null ? ResourceSetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ResourceSet(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:ResourceSet", name, null, makeResourceOptions(options, id));
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
    public static ResourceSet get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceSet(name, id, options);
    }
}
