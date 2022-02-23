// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.route53recoveryreadiness.inputs.ResourceSetResourceArgs;
import io.pulumi.awsnative.route53recoveryreadiness.inputs.ResourceSetTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetArgs Empty = new ResourceSetArgs();

    /**
     * The name of the resource set to create.
     * 
     */
    @InputImport(name="resourceSetName")
      private final @Nullable Input<String> resourceSetName;

    public Input<String> getResourceSetName() {
        return this.resourceSetName == null ? Input.empty() : this.resourceSetName;
    }

    /**
     * The resource type of the resources in the resource set. Enter one of the following values for resource type:
     * 
     * AWS: :AutoScaling: :AutoScalingGroup, AWS: :CloudWatch: :Alarm, AWS: :EC2: :CustomerGateway, AWS: :DynamoDB: :Table, AWS: :EC2: :Volume, AWS: :ElasticLoadBalancing: :LoadBalancer, AWS: :ElasticLoadBalancingV2: :LoadBalancer, AWS: :MSK: :Cluster, AWS: :RDS: :DBCluster, AWS: :Route53: :HealthCheck, AWS: :SQS: :Queue, AWS: :SNS: :Topic, AWS: :SNS: :Subscription, AWS: :EC2: :VPC, AWS: :EC2: :VPNConnection, AWS: :EC2: :VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     * 
     */
    @InputImport(name="resourceSetType", required=true)
      private final Input<String> resourceSetType;

    public Input<String> getResourceSetType() {
        return this.resourceSetType;
    }

    /**
     * A list of resource objects in the resource set.
     * 
     */
    @InputImport(name="resources", required=true)
      private final Input<List<ResourceSetResourceArgs>> resources;

    public Input<List<ResourceSetResourceArgs>> getResources() {
        return this.resources;
    }

    /**
     * A tag to associate with the parameters for a resource set.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ResourceSetTagArgs>> tags;

    public Input<List<ResourceSetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ResourceSetArgs(
        @Nullable Input<String> resourceSetName,
        Input<String> resourceSetType,
        Input<List<ResourceSetResourceArgs>> resources,
        @Nullable Input<List<ResourceSetTagArgs>> tags) {
        this.resourceSetName = resourceSetName;
        this.resourceSetType = Objects.requireNonNull(resourceSetType, "expected parameter 'resourceSetType' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.tags = tags;
    }

    private ResourceSetArgs() {
        this.resourceSetName = Input.empty();
        this.resourceSetType = Input.empty();
        this.resources = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceSetName;
        private Input<String> resourceSetType;
        private Input<List<ResourceSetResourceArgs>> resources;
        private @Nullable Input<List<ResourceSetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceSetName = defaults.resourceSetName;
    	      this.resourceSetType = defaults.resourceSetType;
    	      this.resources = defaults.resources;
    	      this.tags = defaults.tags;
        }

        public Builder setResourceSetName(@Nullable Input<String> resourceSetName) {
            this.resourceSetName = resourceSetName;
            return this;
        }

        public Builder setResourceSetName(@Nullable String resourceSetName) {
            this.resourceSetName = Input.ofNullable(resourceSetName);
            return this;
        }

        public Builder setResourceSetType(Input<String> resourceSetType) {
            this.resourceSetType = Objects.requireNonNull(resourceSetType);
            return this;
        }

        public Builder setResourceSetType(String resourceSetType) {
            this.resourceSetType = Input.of(Objects.requireNonNull(resourceSetType));
            return this;
        }

        public Builder setResources(Input<List<ResourceSetResourceArgs>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setResources(List<ResourceSetResourceArgs> resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ResourceSetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ResourceSetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ResourceSetArgs build() {
            return new ResourceSetArgs(resourceSetName, resourceSetType, resources, tags);
        }
    }
}
