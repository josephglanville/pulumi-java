// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness.outputs;

import io.pulumi.aws.route53recoveryreadiness.outputs.ResourceSetResourceDnsTargetResourceTargetResourceNlbResource;
import io.pulumi.aws.route53recoveryreadiness.outputs.ResourceSetResourceDnsTargetResourceTargetResourceR53Resource;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceSetResourceDnsTargetResourceTargetResource {
    /**
     * NLB resource a DNS Target Resource points to. Required if `r53_resource` is not set.
     * 
     */
    private final @Nullable ResourceSetResourceDnsTargetResourceTargetResourceNlbResource nlbResource;
    /**
     * Route53 resource a DNS Target Resource record points to.
     * 
     */
    private final @Nullable ResourceSetResourceDnsTargetResourceTargetResourceR53Resource r53Resource;

    @CustomType.Constructor
    private ResourceSetResourceDnsTargetResourceTargetResource(
        @CustomType.Parameter("nlbResource") @Nullable ResourceSetResourceDnsTargetResourceTargetResourceNlbResource nlbResource,
        @CustomType.Parameter("r53Resource") @Nullable ResourceSetResourceDnsTargetResourceTargetResourceR53Resource r53Resource) {
        this.nlbResource = nlbResource;
        this.r53Resource = r53Resource;
    }

    /**
     * NLB resource a DNS Target Resource points to. Required if `r53_resource` is not set.
     * 
    */
    public Optional<ResourceSetResourceDnsTargetResourceTargetResourceNlbResource> getNlbResource() {
        return Optional.ofNullable(this.nlbResource);
    }
    /**
     * Route53 resource a DNS Target Resource record points to.
     * 
    */
    public Optional<ResourceSetResourceDnsTargetResourceTargetResourceR53Resource> getR53Resource() {
        return Optional.ofNullable(this.r53Resource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResourceDnsTargetResourceTargetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceSetResourceDnsTargetResourceTargetResourceNlbResource nlbResource;
        private @Nullable ResourceSetResourceDnsTargetResourceTargetResourceR53Resource r53Resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResourceDnsTargetResourceTargetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nlbResource = defaults.nlbResource;
    	      this.r53Resource = defaults.r53Resource;
        }

        public Builder nlbResource(@Nullable ResourceSetResourceDnsTargetResourceTargetResourceNlbResource nlbResource) {
            this.nlbResource = nlbResource;
            return this;
        }
        public Builder r53Resource(@Nullable ResourceSetResourceDnsTargetResourceTargetResourceR53Resource r53Resource) {
            this.r53Resource = r53Resource;
            return this;
        }        public ResourceSetResourceDnsTargetResourceTargetResource build() {
            return new ResourceSetResourceDnsTargetResourceTargetResource(nlbResource, r53Resource);
        }
    }
}
